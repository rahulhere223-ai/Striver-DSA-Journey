public class secondsmallest {
    public static int secsmallest(int nums[]){
        int smallest=nums[0];
        int smallest2=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i] < smallest){
                smallest2=smallest;
                smallest=nums[i];
            }
            else if(nums[i] > smallest && smallest2 > nums[i]){
                smallest2=nums[i];
            }
        }
        return smallest2;

    }
    public static void main(String[] args) {
        int nums[]={5,8,2,4,12};
        System.out.println(secsmallest(nums));

    }
}
