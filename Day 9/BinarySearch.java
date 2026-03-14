public  class BinarySearch{
    public static int search1(int arr[],int target){
        int low=0;
        int high=arr.length-1;

        while(low <= high){
            int mid=(high-low)/2 +low;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return -1;
    }
    public static int search2(int arr[],int low,int high,int target){
         if(low > high){
            return -1;
         }
         int mid=(high - low)/2 +low;
         if(arr[mid] == target){
            return mid;
         }
         else if(arr[mid] > target){
            return search2(arr, low, mid-1, target);
         }

         return search2(arr, mid+1, high, target);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        // System.out.println(search1(arr,8));
        System.out.println(search2(arr,0,8,8));
        
    }
}