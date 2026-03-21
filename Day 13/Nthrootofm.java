public class Nthrootofm {

    public static int help(int base,int n){
       int result=1;
       for(int i=0;i<n;i++){
        result=result * base;
       }
       return result;
    }
    public static int nthroot(int m,int n){
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
    public static void main(String[] args) {
        int m=27;
        int n=3;
        System.out.println(nthroot(m, n));
    }
}
