public class Nthrootofm {

    public static int help(int base,int n){
       int result=1;
       for(int i=0;i<n;i++){
        result=result * base;
       }
       return result;
    }
    public static int nthroot1(int m,int n){
        for(int i=1;i<m;i++){
            int val=help(i, n);
            if(val == m){
                return i;
            }
            if(val > m){
                break;
            }
        }
        return -1;
    }
    public static int power(int base,int n,int m){
        long result=1;
        for(int i=0;i<n;i++){
            result *=base;
            if(result > m) return 2;
        }
        if(result == m) return 1;
        return 0;
    }
    public static int nthroot2(int m,int n){
        int low=1;
        int high=m;

        while(low <= high){
            int mid=low + (high - low)/2;

            int check=power(mid,n,m);
            if(check == 1){
                return mid;
            }
            else if(check == 0){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int m=27;
        int n=3;
        System.out.println(nthroot1(m, n));
        System.out.println(nthroot2(m, n));
    }
}
