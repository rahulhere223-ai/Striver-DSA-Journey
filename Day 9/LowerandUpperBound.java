public class LowerandUpperBound {    
    public static int lowerbound(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low <= high){
            int mid=(high - low)/2 + low;
            if(arr[mid] >= target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
        public static int upperbound(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low <= high){
            int mid=(high - low)/2 + low;
            if(arr[mid] > target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,7,8,9,9,9,11};
        System.out.println(upperbound(arr, 2));
    }
}
