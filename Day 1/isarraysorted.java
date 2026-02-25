public class isarraysorted {
    public static boolean sortornot(int nums[]){
        for(int i=1;i<nums.length;i++){
            if(nums[i] >= nums[i-1]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[]={2,3,9};
        System.out.println(sortornot(nums));
    }
}
