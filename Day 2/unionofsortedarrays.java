import java.util.*;

public class unionofsortedarrays {
    public static void unionofarr1(int nums1[],int nums2[]){
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }
        int union[]=new int[set.size()];
         int i=0;
        for(int val: set){
            union[i]=val;
            i++;
        }
        for(int ele:union){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int nums1[]={1,1,2,3,3,4,5};
        int nums2[]={1,2,3,4,5,6};

       unionofarr1(nums1, nums2);

    }
}
