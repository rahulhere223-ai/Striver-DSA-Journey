import java.util.*;

public class threesum{
    public static void sum1(int arr[]){
        Set<ArrayList<Integer>> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j]+ arr[k] == 0){
                          ArrayList<Integer> temp=new ArrayList<>(); 
                          temp.add(arr[i]);
                          temp.add(arr[j]);
                          temp.add(arr[k]);

                          Collections.sort(temp);
                          set.add(temp);
                    }
                }
            }
        }
        for(ArrayList<Integer> ele:set){
            System.out.println(ele);
        }
    }
  public static void sum2(int arr[]){

    Set<ArrayList<Integer>> set = new HashSet<>();

    for(int i=0;i<arr.length;i++){

        Set<Integer> map = new HashSet<>();

        for(int j=i+1;j<arr.length;j++){

            int third = -(arr[i] + arr[j]);

            if(map.contains(third)){

                ArrayList<Integer> temp = new ArrayList<>();

                temp.add(arr[i]);
                temp.add(arr[j]);
                temp.add(third);

                Collections.sort(temp);

                set.add(temp);
            }

            map.add(arr[j]);
        }
    }

    for(ArrayList<Integer> ele : set){
        System.out.println(ele);
    }
}
public static void sum3(int arr[]){
    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

    Arrays.sort(arr);

    for(int i=0;i<arr.length;i++){
         if(i>0 && arr[i] == arr[i-1]) continue;
         int j=i+1;
         int k=arr.length-1;

         while(j < k ){
            int sum =arr[i]+arr[j]+arr[k];
            if(sum < 0){
               j++;
            }
            else if(sum > 0){
                k--;
            }
            else{
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[j]);
                temp.add(arr[k]);
                j++;
                k--;
                while(j<k && arr[j] == arr[j-1]) j++;
                while(j <k && arr[k] == arr[k+1]) k--;
            }
         }
    }
}
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,4};
        // sum1(arr);
        // sum2(arr);
        sum3(arr);


    }
}