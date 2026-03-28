

public class Agressivecows {
    public static boolean canweplace(int arr[],int dist,int cows){
        int countcows=1,last=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] - last >= dist){
                countcows++;
                last=arr[i];
            }
        }
        if(countcows >= cows){
            return true;
        }
        return false;
    }
    // brute
    public static int agressivecow1(int arr[],int cows){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }

        int ans=-1;

        for(int i=1;i<=max;i++){
            if(canweplace(arr, i, cows)){
                ans=i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    // optimal
    public static int agressivecow2(int arr[],int cows){
        int low=0,high=arr[arr.length -1];
        int ans=-1;

        while(low <= high){
            int mid=low+(high - low)/2;
            if(canweplace(arr, mid, cows)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={0,3,4,7,9,10};
        int cows=4;
        System.out.println(agressivecow1(arr, cows));
        System.out.println(agressivecow2(arr, cows));
         
    }
}
