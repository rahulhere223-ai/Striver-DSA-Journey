public class largest {
    public static int largestno(int nums[]){
        int max=nums[0];

        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[]={2,3,4,1,5};
        System.out.println(largestno(nums));
    }
}
