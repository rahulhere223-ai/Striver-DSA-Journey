
import java.util.Arrays;

public class Appearonceandothertwice {
    public static int uniqueno(int arr[]){
        int count=0;

        for(int i=0;i<arr.length;i++){
            int num=arr[i];
               count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j] == num){
                    count++;
                }
            }

            if(count == 1){
                return num;
            }
        }
        return -1;
    }
    public static int uniqueno2(int arr[]){
        int largest=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest=arr[i];
            }
        }
        int hash[]=new int[largest+1];
        Arrays.fill(hash, 0);

        for(int i=0;i<hash.length;i++){
            hash[arr[i]]++;
        }

        for(int i=0;i<hash.length;i++){
            if(hash[arr[i]]==1 ){
                return arr[i];
            }
        }
        return -1;
    }
    public static int uniqueno3(int arr[]){
        int xor=0;

        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};

        // System.out.println(uniqueno(arr));
        // System.out.println(uniqueno2(arr));
        System.out.println(uniqueno3(arr));
    }
}
