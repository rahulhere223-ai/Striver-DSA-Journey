import java.util.ArrayList;

public class Firstandlastoccurence{
    public static int lowerbound(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low <= high){
            int mid=(high - low)/2 + low;
            if(arr[mid] >= x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int upperbound(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low <= high){
            int mid=(high - low)/2 + low;
            if(arr[mid] > x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static ArrayList<Integer> occurence1(int arr[],int x){
        int first=-1;
        int last=-1;
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                if(first == -1) first=i;
                last=i;
            }
        }
        ans.add(first);
        ans.add(last);

        return ans;
    } 
    public static ArrayList<Integer> occurence2(int arr[],int x){
          int lb=lowerbound(arr, x);
          int ub=upperbound(arr, x);

        ArrayList<Integer> ans=new ArrayList<>();

          if(arr[lb] != x || arr[lb] == arr.length){
            lb=-1;
            ub=-1;
          }
          ans.add(lb);
          ans.add(ub);

          return ans;
    }
    
    public static void main(String[] args) {
        int arr[]={2,4,6,8,8,8,11,13};
        System.out.println(occurence1(arr, 8));
        // System.out.println(occurence2(arr, 8));


    }
}