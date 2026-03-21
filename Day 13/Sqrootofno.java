public class Sqrootofno {
    public static int root1(int n){
        int ans= (int)Math.sqrt(n);
        return ans;
    }
    public static int root2(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i*i <= n){
                ans=i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    public static int root3(int n){
        int low=1;
        int high=n;
        int ans=0;

        while(low <= high){
            int mid=low + (high-low)/2;
            if(mid * mid <= n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=39;
        System.out.println(root1(n));
        System.out.println(root2(n));
        System.out.println(root3(n));


    }
}
