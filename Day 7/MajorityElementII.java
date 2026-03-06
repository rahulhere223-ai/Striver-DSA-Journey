import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElementII{
    public static ArrayList<Integer> majority1(int nums[]){
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(list.size() == 0 || list.get(0) != nums[i]){
                count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
                if(count > nums.length/3){
                    list.add(nums[i]);
                }
            }
            if(list.size() == 2) break;
        }
        return list;
    }
    public static ArrayList<Integer> majority2(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        int min=nums.length/3 +1;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            if(map.get(nums[i]) == min ){
                list.add(nums[i]);
            }
        }
        return list;
    }
    public static ArrayList<Integer> majority3(int nums[]){
        ArrayList<Integer> list=new ArrayList<>();
        int count1=0,candidate1=Integer.MIN_VALUE;
        int count2=0,candidate2=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(count1 == 0 && candidate2 != nums[i]){
                count1=1;
                candidate1=nums[i];
            }
            else if(count2 ==0 && nums[i] != candidate1){
                count2=1;
                candidate2=nums[i];
            }
            else if(nums[i] == candidate1) count1++;
            else if(nums[i] == candidate2) count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int i=0;i<nums.length;i++){
            if(candidate1 == nums[i]){
                count1++;
            }
            if(candidate2 == nums[i]){
                count2++;
            }
        }
        int min=nums.length/3 +1;

        if(count1 >= min) list.add(candidate1);
        if(count2 >= min) list.add(candidate2);

        
        return list;
    }
 
    public static void main(String[] args) {
        int nums[]={1,1,1,3,3,2,2,2};
        System.out.println(majority3(nums));
    }
}