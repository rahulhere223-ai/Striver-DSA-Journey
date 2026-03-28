public class Bookallocation {
    public static int countstudent(int arr[],int pages){
        int countstu=1;
        int pagesstudent=0;

        for(int i=0;i<arr.length;i++){
            if(pagesstudent + arr[i] <= pages){
                pagesstudent += arr[i];
            }
            else{
                countstu++;
                pagesstudent=arr[i];
            }
        }
        return countstu;
    }
    public static int allocatbook1(int arr[],int student){
        if(student > arr.length) return -1;

        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            sum +=arr[i];
        }

        for(int i=max;i<=sum;i++){
            int noofstudent=countstudent(arr,i);
            if(noofstudent == student){
                return i;
            }
        }
        return -1;
    }
    public static int allocatbook2(int arr[],int student){
        if(student > arr.length) return -1;

        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            sum +=arr[i];
        }

        int low=max,high=sum;
        int ans=-1;

        while(low <= high){
            int mid=low+(high - low)/2;
            int noofstudent=countstudent(arr, mid);
            if(noofstudent > student){
                low=mid+1;
            }
            else{
                high=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={25,46,28,49,24};
        int student=4;
        System.out.println(allocatbook1(arr, student));    
        System.out.println(allocatbook2(arr, student));    

    }
}
