public class SearchinrotatedarrI{
    public static int search1(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int search2(int arr[],int target){
     int low=0,high=arr.length-1;

     while(low<= high){
        int mid=(high - low)/2 +low;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[low] <= arr[mid]){
            if(arr[low] <= target && target <= arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        } 
        else{
            if(arr[mid] <= target && target <= arr[high]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
     }
     return -1;
    }
    public static void main(String[] args) {
        int arr[]={7,8,9,1,2,3,4,5,6};
        System.out.println(search1(arr, 4));
        System.out.println(search2(arr, 4));

    }
}