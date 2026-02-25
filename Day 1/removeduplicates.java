public class removeduplicates {
    public static int removesame(int nums[]){
        int i=0;

        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,2,2,3,3};

        // System.out.println(removesame(nums));
         System.out.println(removesame(nums));
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i]+" ");
        // }
        // System.out.println();

    }
}
