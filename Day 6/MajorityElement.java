import java.util.HashMap;

public class MajorityElement{
    // Brute force
    public static int majority1(int arr[]){
       int count=0;

       for(int i=0;i<arr.length;i++){
         count=0;
         for(int j=0;j<arr.length;j++){
            if(arr[i] == arr[j]){
                count++;
            }
         }
         if(count > arr.length/2 ){
            return arr[i];
         }
       }
       return -1;
    }
    public static int majority2(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(int i=0;i<map.size();i++){
            if(map.get(arr[i]) > arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static int majority3(int arr[]){
       int candidate=0;
       int count=0;

       for(int i=0;i<arr.length;i++){
          if(count==0){
            candidate=arr[i];
            count=1;
           }
           else if(candidate != arr[i]){
            count--;
           } 
           else {
            count++;
           }
       }
       return candidate;

    }
    public static void main(String[] args) {
        int arr[]={2,2,3,3,1,2,2};

        System.out.println(majority1(arr));
        System.out.println(majority2(arr));
        System.out.println(majority3(arr));
        



    }
}