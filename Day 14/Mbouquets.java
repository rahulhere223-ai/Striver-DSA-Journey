public class Mbouquets {
    public static boolean possible(int bloomday[],int day,int m,int k){
        int count=0;
        int noofbouq=0;

        for(int i=0;i<bloomday.length;i++){
            if(bloomday[i] <= day){
                count++;
            }
            else{
               noofbouq +=(int)(count/k);
               count=0;
            }
        }
        noofbouq +=(int)(count/k);

        if(noofbouq >= m){
            return true;
        }
        else{
            return false;
        }
    }
    public static int mbouq1(int bloomday[],int m,int k){

        if(m*k > bloomday.length) return -1;
        for(int i=7;i<=13;i++){
            if(possible(bloomday, i, m, k) == true){
                return i;
            }
        }
        return -1;
    }
    public static int mbouq2(int bloomday[],int m,int k){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<bloomday.length;i++){
            max=Math.max(max, bloomday[i]);
            min=Math.min(min, bloomday[i]);
        }
        int low=min,high=max;

        while(low <=high){
            int mid=low + (high-low)/2;
            if(possible(bloomday, mid, m, k) == true){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int bloomday[]={7,7,7,7,13,11,12,7};
        int m=2,k=3;
        System.out.println(mbouq1(bloomday, m, k));
        System.out.println(mbouq2(bloomday, m, k));

    }
}
