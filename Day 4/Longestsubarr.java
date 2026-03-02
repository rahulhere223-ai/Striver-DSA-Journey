import java.util.HashMap;

public class Longestsubarr {

    // Brute force
    public static int subarr1(int arr[], int target) {
        int sum = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=0;
            for (int j = i; j < arr.length; j++) {
               sum =sum + arr[j]; 
               if(sum == target){
                len=Math.max(len, j-i+1);
               }
            }
        }
        return len;
    }
    // better
    public static int subarr2(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixsum=0;
        int maxlen=0;

        map.put(0, -1);

        for(int i=0;i<arr.length;i++){
            prefixsum +=arr[i];

            if(map.containsKey(prefixsum - k)){
               maxlen=Math.max(maxlen,i- map.get(prefixsum - k));
            }
            if(!map.containsKey(prefixsum)){
                map.put(prefixsum, i);
            }
        }
        return maxlen;
    }
    // optimal
    public static int subarr3(int arr[],int k){
        int n=arr.length;
        int left=0,right=0;
        int maxlen=0;
        int sum=arr[0];

        while(right< n){
            while(left < right && sum > k){
                sum -=arr[left];
                left++;
            }
            if(sum == k){
                maxlen=Math.max(maxlen, right-left+1);
            }
            right++;
            if(right < n){
                sum +=arr[right];
            } 
        }
        return  maxlen;
    }
 


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        // System.out.println(subarr1(arr, 3));
        // System.out.println(subarr2(arr, 3));
        System.out.println(subarr3(arr, 3));
    }
}
