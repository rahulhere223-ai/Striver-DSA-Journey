import java.util.HashMap;
import java.util.Map;

public class singleelementinsortarr {
    public static int find1(int arr[]){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1] != arr[i] && arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static int find2(int arr[]){
      HashMap<Integer,Integer> map=new HashMap<>();

      for(int i=0;i<arr.length;i++){
        map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
      }
       for (Map.Entry<Integer,Integer> i : map.entrySet()) {
        if(i.getValue() == 1){
            return i.getKey();
        }
       }
       return -1;
      
    }
    public static int find3(int arr[]){
       int n=arr.length;
       if(n == 1) return arr[0];
       if(arr[0] != arr[1]) return arr[0];
       if(arr[n-1] != arr[n-2]) return arr[n-1];

       int low=1;
       int high=n-2;

       while(low <= high){
        int mid=low + (high - low)/2;
        if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
            return arr[mid];
        }
        // left half
        if(mid %2==1 && arr[mid] == arr[mid-1] || mid%2==0 && arr[mid] == arr[mid+1]){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        System.out.println(find1(arr));
        System.out.println(find2(arr));
        System.out.println(find3(arr));
    }
}
