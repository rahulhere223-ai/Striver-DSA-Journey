// import java.util.*;

import java.util.HashMap;

public class longestcmsubseq {
    public static boolean linearsearch(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }
    public static int  longestsubseq1(int arr[]){
        int longest=1;
        int count=0;

        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            count=1;
            while(linearsearch(arr, x+1) == true){
                x=x+1;
                count++;
            }
            longest=Math.max(longest, count);
        }
        return longest;
    }
    public static int longestsubseq2(int arr[]){
        int longest=0;
        int currcount=0;
        int lastsmaller=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] - 1 == lastsmaller){
                currcount++;
                lastsmaller=arr[i];
            }
            else if(arr[i] != lastsmaller){
                currcount=1;
                lastsmaller=arr[i];
            }
            longest=Math.max(longest, currcount);
        }
        return longest;
    }
    public static int longestsubseq3(int arr[]){
        int longest=0;
        HashMap<Integer,Boolean> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],Boolean.FALSE);
        }
         
        for(int val :arr){
            int count=1;

            int nextval=val+1;
            while(map.containsKey(nextval) && map.get(nextval) == false){
                count++;
               map.put(nextval, true);
               nextval++;
            }

            int prevval=val-1;
            while(map.containsKey(prevval ) && map.get(prevval) == false){
                count++;
                map.put(prevval, true);
                prevval--;
            }
            longest=Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[]={102,4,100,1,101,3,2,1};

        // System.out.println(longestsubseq1(arr));
        // System.out.println(longestsubseq1(arr));
         System.out.println(longestsubseq3(arr));
        
    }    
}
