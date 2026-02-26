import java.util.ArrayList;
import java.util.Arrays;

public class intersectionofarr {
    public static void intersection1(int nums1[],int nums2[]){
        ArrayList<Integer> ans=new ArrayList<>();
        int vis[]=new int[nums2.length];
        Arrays.fill(vis, 0);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j] && vis[j]==0){
                    ans.add(nums1[i]);
                    vis[j]=1;
                    break;
                }
                if(nums2[j] > nums1[i] ){
                    break;
                }
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }

    public static void intersection2(int nums1[],int nums2[]){
        int i=0;
        int j=0;
        ArrayList<Integer> ans=new ArrayList<>();

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
               i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }

        for(int k=0;k<ans.size();k++){
            System.out.print(ans.get(k)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums1[]={1,1,2,3,3,4,5};
        int nums2[]={1,2,3,4,5,6};

        intersection1(nums1, nums2);
        intersection2(nums1, nums2);

        
    }
}
