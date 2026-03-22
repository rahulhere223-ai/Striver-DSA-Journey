public class Kokoeatingbanana{
    // brute force
    public static int calculatehours(int piles[],int hourly){
        int totalhrs=0;
        
        for(int i=0;i<piles.length;i++){
          totalhrs += Math.ceil((double)piles[i]/(double)hourly);
        }
        return totalhrs;
    }
    public static int koko1(int piles[],int h){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            if(piles[i] > max){
                max=piles[i];
            }
        }

        for(int i=1;i<=max;i++){
            int requiretime=calculatehours(piles, i);
            if(requiretime <= h){
                return i;
            }
        }
        return -1;
    }
    // optimal
    public static int koko2(int piles[],int h){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            if(piles[i] > max){
                max=piles[i];
            }
        }
        int low=1;
        int high=max;
        int ans=Integer.MAX_VALUE;

        while(low<=high){
            int mid=low +(high - low)/2;
            int requiretime=calculatehours(piles, mid);
            if(requiretime <=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans; //or return low
    }
    

    public static void main(String[] args) {
        int piles[]={30,11,23,4,20};
        int h=5;
        System.out.println(koko1(piles, h));
        // System.out.println(calculatehours(piles, 4));
        System.out.println(koko2(piles, h));



    }
}