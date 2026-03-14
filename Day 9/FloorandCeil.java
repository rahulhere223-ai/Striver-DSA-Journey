public class FloorandCeil {
    public static int floorvalue(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;

        while(low <= high){
            int mid=(high-low)/2 +low;

            if(arr[mid] <= target){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
     public static int ceilvalue(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;

        while(low <= high){
            int mid=(high-low)/2 +low;

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
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(floorvalue(arr, 25));
        System.out.println(ceilvalue(arr, 25));
        
    }
}
