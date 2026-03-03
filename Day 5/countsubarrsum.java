import java.util.HashMap;

public class countsubarrsum{
    public static int countsubarr1(int arr[],int k){
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum =0; 
                for(int t=i;t<=j;t++){
                    sum +=arr[t];
                }
                if(sum == k){            // not working
                 count++;
                }
            }
        }
        return count;
    }
    public static int countsubarr2(int arr[],int k){
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum +=arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static int countsubarr3(int arr[],int target){
        int count=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        int prefixsum=0;
        map.put(0, 1);

        for(int i=0;i<arr.length;i++){
            prefixsum += arr[i];
            if(map.containsKey(prefixsum-target)){
                count += map.get(prefixsum - target);
            }
            map.put(prefixsum, map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,-3,1,1,1,4,2,-3};

        System.out.println(countsubarr1(arr, 3));
        System.out.println(countsubarr2(arr, 3));
        System.out.println(countsubarr3(arr, 3));

    }
}