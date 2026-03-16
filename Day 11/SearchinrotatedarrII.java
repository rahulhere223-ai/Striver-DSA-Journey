public class SearchinrotatedarrII {
    public static boolean search1(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
        return false;
    }
    public static boolean search2(int nums[],int target){
        int low=0,high=nums.length-1;

        while(low <= high){
            int mid=(high - low)/2 + low;
            if(nums[mid] == target){
                return true;
            }
            if(nums[low] == nums[mid] && nums[mid] == nums[high]){
                low++;
                high--;
                continue;
            }
            // left half is sorted or not
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                   high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid] <= target && target <=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={7,8,1,2,3,3,3,4,5,6};
        System.out.println(search1(nums, 3));
        System.out.println(search2(nums, 3));

    }
}
