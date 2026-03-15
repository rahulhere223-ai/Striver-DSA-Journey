public class Countoccurence {
    public static int first(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;

        while(low <= high){
            int mid=(high - low)/2 + low;
            if(arr[mid] == x){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid] < x){
                low=mid+1;
            }
            else{
               high=mid-1;
            }
        }
        return ans;
    }
    public static int Last(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;

        while(low <= high){
            int mid=(high - low)/2 + low;
            if(arr[mid] == x){
                ans=mid;
               low=mid+1;
            }
            else if(arr[mid] > x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int countoccur1(int arr[],int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
    public static int countoccur2(int arr[],int target){
        int first=first(arr, target);
        int last=Last(arr, target);

        if(first == -1 ) return 0;

        return last-first+1;
    }
    public static void main(String[] args) {
         int arr[]={2,4,6,8,8,8,11,13};

         System.out.println(countoccur1(arr, 8));
         System.out.println(countoccur2(arr, 8));

         
    }
}
