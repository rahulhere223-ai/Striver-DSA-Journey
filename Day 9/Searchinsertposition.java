public class Searchinsertposition {
    public static int searchposition(int nums[],int target){
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;

        while(low<= high){
            int mid= (high-low)/2 +low;
            if(nums[mid] >= target){
                ans=mid;
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[]={1,3,5,9};
        System.out.println(searchposition(nums, 7));
    }
}
