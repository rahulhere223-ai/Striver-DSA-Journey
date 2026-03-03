import java.util.ArrayList;
import java.util.HashMap;

public class Twosum{
    public static ArrayList<Integer> sum1(int nums[],int target){
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] +nums[j] == target){
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                }
            }
        }
        return ans;
    }
    public static ArrayList<Integer> sum2(int nums[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(map.containsKey(target-num)){
                ans.add(num);
                ans.add(target-num);
            }
            map.put(num,i);
        }
        return ans;
    }
    public static ArrayList<Integer> sum3(int nums[],int target){
       ArrayList<Integer> ans=new ArrayList<>();
       int i=0;
       int j=nums.length-1;

       while(i  <= j){
        if(nums[i] + nums[j] == target){
            ans.add(nums[i]);
            ans.add(nums[j]);
        }
        i++;
        j--;
       }
        return ans;
    }    
    
    public static void main(String[] args) {
        int nums[]={2,6,4,8,10};
        int target=14;
        System.out.println(sum2(nums, target));
    }
}