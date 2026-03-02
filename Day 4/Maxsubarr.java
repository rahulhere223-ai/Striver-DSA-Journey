public class Maxsubarr{

    public static int maxsubarr1(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currsum=0;
            for(int j=i;j<arr.length;j++){
                currsum +=arr[j];
                if(currsum > maxsum ){
                    maxsum=currsum;
                }
            }
        }
        return maxsum;
    }


    public static int maxsubarr2(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currsum +=arr[i];
            maxsum=Math.max(maxsum, currsum);
            if(currsum <0){
                currsum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        // System.out.println(maxsubarr1(arr));
        System.out.println(maxsubarr2(arr));

    }
}