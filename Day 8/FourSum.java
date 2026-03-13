import java.util.*;

public class FourSum{
    public static void sum1(int nums[],int target){
        long sum=0;
        HashSet<ArrayList<Integer>> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    for(int l=k+1;l<nums.length;l++){
                         sum=nums[i]+nums[j];
                         sum +=nums[k];
                         sum +=nums[l];
                         if(sum == target){
                            ArrayList<Integer> temp=new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);

                            Collections.sort(temp);
                            set.add(temp);
                         }
                    }
                }
            }
        }

        for(ArrayList<Integer> val :set){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void sum2(int nums[],int target){
        HashSet<ArrayList<Integer>> ans=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                Set<Integer> set =new HashSet<>();
                for(int k=j+1;k<nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    int fourth=target-sum;
                    if(set.contains(fourth)){
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(fourth);
                        Collections.sort(temp);

                        ans.add(temp);
                    }

                    set.add(nums[k]);
                }
            }
        }
        for(ArrayList<Integer> val:ans){
            System.out.print(val+" ");
        }
    }
    public static void sum3(int nums[],int target){

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j != i+1 && nums[j] == nums[j-1]) continue;
                int k=j+1;
                int l=nums.length-1;

                while(k < l){
                    int sum=nums[i]+nums[j];
                    sum +=nums[k];
                    sum +=nums[l];

                    if(sum < target){
                        k++;
                    }
                    else if(sum > target){
                        l--;
                    }
                    else {
                        ArrayList<Integer> temp=new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);

                        while(k < l && nums[k] == nums[k+1]) k++;
                        while(k < l  && nums[l] == nums[l-1]) l--;
                            
                        k++;
                        l--;
                    }
                }
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        // int nums[]={1,0,-1,0,-2,2};
        // // sum1(nums, 0);
        // sum2(nums, 0);
        int nums[]={1,1,1,2,2,2,3,3,3,4,4,4,5,5};
        int target=8;
    sum3(nums, target);
    }
}