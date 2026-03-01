public class Maximumconsecutiveones {

    public static int maximumones(int arr[]){
        int count=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
                max=Math.max(count, max);
            }
            else{
                count=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,1,1};
        System.out.println(maximumones(arr));

    }
}
