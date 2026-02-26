public class insertionsort {
    public static void printarr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void insertion(int nums[]){
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];
            int prev=i-1;
            while(prev >= 0 && nums[prev] > curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
            nums[prev+1]=curr;
        }
        printarr(nums);
    }
    public static void main(String[] args) {
        int nums[]={1,5,3,2,4};
        insertion(nums);
    }
}
