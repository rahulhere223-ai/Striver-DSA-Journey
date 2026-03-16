public class Minimuminsortedarr {
    public static int findminimum1(int nums[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < smallest){
                smallest=nums[i];
            }
        }
        return smallest;
    }
    public static int findminimum2(int nums[]){
       int low=0,high=nums.length-1;
       int ans=Integer.MAX_VALUE;

       while(low <=  high){
        int mid=low + (high - low)/2;
        if(nums[low] <= nums[mid]){
            ans=Math.min(ans, nums[low]);
            low=mid+1;
        }
        else{
            ans=Math.min(ans,nums[mid]);
            high=mid-1;
        }
       }
       return ans;
    }    
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        System.out.println(findminimum1(nums));
        System.out.println(findminimum2(nums));
    }
}
