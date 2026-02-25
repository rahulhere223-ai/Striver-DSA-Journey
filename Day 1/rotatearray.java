public class rotatearray {
    public static void printarr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    // Brute force
    public static void rotate(int nums[],int k){
     int temp[]=new int[k];
     int n=nums.length;
     for(int i=0;i<k;i++){
        temp[i]=nums[i];
     }

     for(int i=k;i<n;i++){
        nums[i-k]=nums[i];
     }

     for(int i=n-k;i<n;i++){
        nums[i]=temp[i-(n-k)];
     }
    printarr(nums);
    }
    public static void reverse(int nums[],int idx1,int idx2){
         
        while(idx1<=idx2){
            int temp=nums[idx1];
            nums[idx1]=nums[idx2];
            nums[idx2]=temp;
            idx1++;
            idx2--;
        }
    }

    public static void rotate2(int nums[],int k){
        int n=nums.length;
       reverse(nums,0,k-1);
       reverse(nums,k,n-1);
       reverse(nums,0,n-1);
       printarr(nums);
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        rotate2(nums, 3);
    }
}
