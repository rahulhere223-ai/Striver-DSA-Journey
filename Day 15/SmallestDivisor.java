public class SmallestDivisor {
    public static int calculatethreshold(int nums[],int threshold){
        int ans=0;
       for(int i=0;i<nums.length;i++){
          ans += Math.ceil((double)nums[i]/(double)threshold);
       }
       return ans;
    }
    public static int mindivisor1(int nums[],int threshold){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }

        for(int i=1;i<=max;i++){
            int reqthreshold=calculatethreshold(nums,i);
            if(reqthreshold <= threshold){
                return i;
            }
        }
        return -1;
    }
    public static int mindivisor2(int nums[],int threshold){
        if(threshold < nums.length) return -1;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }

        int low=1;
        int high=max;
        int ans=0;

        while(low <= high){
            int mid = low +( high - low)/2;
            int reqthreshold=calculatethreshold(nums, mid);
            if(reqthreshold <= threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int nums[]={1,2,5,9};
        int threshold=6;
        System.out.println(mindivisor1(nums, threshold));
        System.out.println(mindivisor2(nums, threshold));

    }
}
