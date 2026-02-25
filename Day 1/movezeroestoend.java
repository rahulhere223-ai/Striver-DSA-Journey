import java.util.*;
public class movezeroestoend {
    // Brute force
    public static void printarr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void move(int nums[]){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                temp.add(nums[i]);
            }
        }
        for(int i=0;i<temp.size();i++){
            nums[i]=temp.get(i);
        }

        int nonzeroidx=temp.size();

        for(int i=nonzeroidx;i<nums.length;i++){
            nums[i]=0;
        }

        printarr(nums);
    }
    public static void move2(int nums[]){
        int j=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i<nums.length;i++){
            if(nums[i] != 0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        printarr(nums);
    }
    public static void main(String[] args) {
        int nums[]={1,0,2,3,5,0,0,4,5,1};
        // move(nums);
        move2(nums);

    }
}
