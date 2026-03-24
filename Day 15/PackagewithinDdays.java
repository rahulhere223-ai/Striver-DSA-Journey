public class PackagewithinDdays{
    // brute
    public static int func(int weights[],int capacity){
        int days=1;
        int loadcapacity=0;

        for(int i=0;i<weights.length;i++){
            if(loadcapacity + weights[i] > capacity){
                days=days+1;
                loadcapacity=weights[i];
            }
            else{
                loadcapacity +=weights[i];
            }
        }
        return days;
    }
    public static int leastcapacity1(int weights[],int days){
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<weights.length;i++){
            max=Math.max(max, weights[i]);
            sum +=weights[i];
        }

        for(int i=max;i<=sum;i++){
            int reqdays=func(weights,i);
            if(reqdays <=days){
                return i;
            }
        }
        return -1;
    }
    public static int leastcapacity2(int weights[],int days){
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<weights.length;i++){
            max=Math.max(max, weights[i]);
            sum +=weights[i];
        }
        int low=max,high=sum;
        int ans=0;

        while(low<=high){
            int mid= low+ (high - low)/2;
            int reqdays=func(weights, mid);
            if(reqdays <= days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int weights[]={1,2,3,4,5,6,7,8,9,10};
        int days=5;

        System.out.println(leastcapacity1(weights, days));
        System.out.println(leastcapacity2(weights, days));
        
    }
}