import java.util.Stack;

public class reverseanarray {
    public static void printarr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void reverse(int nums[]){
        int i=0 ,j =nums.length -1;
      
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
      printarr(nums);
    }
    public static void reverse2(int nums[]){
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=s.pop();
        }
        printarr(nums);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        reverse2(nums);

    }
}
