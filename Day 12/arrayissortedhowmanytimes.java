public class arrayissortedhowmanytimes{
    public static int rotated1(int arr[]){
     int low=0,high=arr.length-1;
     int ans=Integer.MAX_VALUE;
     int index=-1;

     while(low<=high){
       int mid=low + (high - low)/2;
       if(arr[low] <= arr[high]){
        if(ans > arr[low]){
            index=low;
            ans=arr[low];
        }
        break;
       }
       if(arr[low] <= arr[mid]){
        if(ans > arr[low]){
            index=low;
            ans=arr[low];
        }
        low=mid+1;
       }
       else{
        if(ans > arr[mid]){
            index=mid;
            ans=arr[mid];
        }
        high=mid-1;
       }
     }
     return index;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        System.out.println(rotated1(arr));

    }
}