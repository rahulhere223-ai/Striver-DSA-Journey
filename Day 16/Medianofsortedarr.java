import java.util.ArrayList;

public class Medianofsortedarr {

    // brute
    public static double  median1(int nums1[],int nums2[]){
        ArrayList<Integer> result=new ArrayList<>();
       
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] <= nums2[j]){
                result.add(nums1[i]);
                i++;
            }
            else{
                result.add(nums2[j]);
                j++;
            }
        }

        
        while(i<nums1.length){
            result.add(nums1[i]);
            i++;
        }

        while(j < nums2.length){
            result.add(nums2[j]);
            j++;
        }
        int n=result.size();

        if(n % 2 == 0){
            return (double)(result.get(n/2) +result.get((n/2) -1))/2;
        }
        else {
            return (double)result.get((n/2));
        }
    }
    // better
    public static double median2(int nums1[],int nums2[]){
        int n1=nums1.length, n2=nums2.length;
        int i=0 , j=0;
        int n=n1+n2;
        int ind1=n/2;
        int ind2=ind1-1;
        int count=0;
        int ele1=-1;
        int ele2=-1;

        while(i < n1 && j <n2 ){
            if(nums1[i] <= nums2[j]){
                if(count == ind1) ele1=nums1[i];
                if(count == ind2) ele2=nums1[i];
                count++;
                i++;
            }
            else{
                if(count == ind1) ele1=nums2[j];
                if(count == ind2) ele2=nums2[j];
                count++;
                j++;
            }
        }
        while( i <n1){
            if(count == ind1) ele1=nums1[i];
            if(count == ind2) ele2=nums1[i];
                count++;
                i++;
        }

        while(j <n2){
            if(count == ind1) ele1=nums2[j];
            if(count == ind2) ele2=nums2[j];
                count++;
                j++;
        }

        if(n %2 == 1) {
            return ele1;
         }
         return (double)(ele1 +ele2)/2;
    }
    // optimal
    public static double median3(int nums1[],int nums2[]){
         int n1=nums1.length;
         int n2=nums2.length;
         
         if(n1 > n2) return median3(nums2, nums1);
         int low=0,high=n1-1;
         int left=(n1+n2+1)/2;

         while(low <= high){
          int mid1=(low+high)/2;
          int mid2=left-mid1;

          int left1= (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 -1];
          int left2= (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 -1];
          int right1= (mid1 == n1) ? Integer.MAX_VALUE : nums1[mid1];
          int right2= (mid2 == n2) ? Integer.MAX_VALUE : nums2[mid2];

          if(left1 <= right2 && left2 <=right1 ){
             if((n1+n2) % 2 == 1){
                return Math.max(left1,left2);
             }
             else{
                return (Math.max(left1, left2) + Math.min(right1, right2))/2;
             }
          }
          else if(left1 > right2){
            high =mid1-1;
          }
          else{
            low=mid1+1;
          }
         }
         return 0.0;
    }

    
    public static void main(String[] args) {
        int nums1[]={1,3,4,7,10,12};
        int nums2[]={2,3,6,15};

        System.out.println(median1(nums1, nums2));
        System.out.println(median2(nums1, nums2));
        System.out.println(median3(nums1, nums2));

    }
}
