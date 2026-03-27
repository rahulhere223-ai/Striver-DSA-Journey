public class kthmissingposno{
    // brute
    public static int missing1(int arr[],int k){
         int largest=Integer.MIN_VALUE;

         for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
         }
         int i=1;
         int j=0;
         int count=0;
         while(i <= largest){
            if(arr[j] != i){
                count++;
                if(count==k){
                    return i;
                }
            }
            if(arr[j] == i){
                j++;
            }
            i++;
         }
         return -1;
    }
    // better
    public static int missing2(int arr[],int k){
      for(int i=0;i<arr.length;i++){
        if(arr[i] <= k) k++;
        else{
            break;
        }
      }
      return k;
    }
    public static int missing3(int arr[],int k){
        int low=0,high=arr.length-1;

        while(low<=high){
            int mid=low +(high - low)/2;
            int missing=arr[mid] - (mid+1);
            if(missing < k) low=mid+1; 
            else high=mid+1;
        }
        return low + k ; //or high + 1 + k
    }
    public static void main(String[] args) {
        int arr[]={5,7,10,12};
        System.out.println(missing1(arr,6));
        System.out.println(missing2(arr,6));
        System.out.println(missing3(arr,6));

    }
}