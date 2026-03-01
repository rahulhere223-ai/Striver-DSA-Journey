
import java.util.*;

public class Missingelement{
    // Brute force
    public static int missing(int arr[],int n){
        int flag=0;
        for(int i=1;i<=n;i++){
            flag=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j] == i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
    }
    return -1;
}
// Better
public static int missing2(int arr[],int n){
    int hash[]=new int[n+1];
    Arrays.fill(hash, 0);

    for(int i=0;i<n-1;i++){
        hash[arr[i]]=1;
    }

    for(int i=1;i<hash.length;i++){
        if(hash[i]==0){
            return i;
        }
    }
    return -1;
}
// Optimal 1
public static int missing3(int arr[],int n){
    int s1=(n*(n+1))/2;

    int s2=0;

    for(int i=0;i<arr.length;i++){
        s2 +=arr[i];
    }
    return s1-s2;
}
// optimal 2

public static int missing4(int arr[],int n){
     int xor1=0;
     for(int i=1;i<=n;i++){
        xor1=xor1^i;
     }
     int xor2=0;

     for(int i=0;i<arr.length;i++){
        xor2=xor2^arr[i];
     }

     return  xor1 ^ xor2;
}
    public static void main(String[] args) {
        int arr[]={1,4,2,5};
        int n=5;
        // System.out.println(missing(arr, n));
        // System.out.println(missing2(arr, n));
        // System.out.println(missing3(arr, n));
        System.out.println(missing4(arr, n));
        
    }
}