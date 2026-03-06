import java.util.HashMap;

public class CountSubarrXORK {
    public static int SubarrXOR1(int arr[],int target){
        int xor=0;
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                xor=0;
                for(int k=i;k<=j;k++){
                    xor ^=arr[k];
                }
                if(xor == target){
                        count++;
                }
            }
        }
        return count;
    }
    public static int SubarrXOR2(int arr[],int target){
        int xor=0;
        int count=0;
        
        for(int i=0;i<arr.length;i++){
             xor=0;
            for(int j=i;j<arr.length;j++){
                 xor ^=arr[j];
                if(xor == target){
                        count++;
                }
            }
        }
        return count;
    }

    public static int SubarrXOR3(int arr[],int target){
        int xor=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0, 1);
        
        for(int i=0;i<arr.length;i++){
            xor = xor^arr[i];
            if(map.containsKey(xor ^target)){
                count +=map.get(xor ^ target);
            }
            map.put(xor, map.getOrDefault(xor, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={4,2,2,6,4};
        // System.out.println(SubarrXOR(arr, 6));
        int target=6;
       System.out.println(SubarrXOR1(arr,target));
       System.out.println(SubarrXOR2(arr,target));
       System.out.println(SubarrXOR3(arr,target));

    }
}
