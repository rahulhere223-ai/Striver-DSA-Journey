public class sort0s1s2s {
    public static void printarr(int nums[]){
         for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
         }
         System.out.println();
    }
    public static void sort1(int nums[]){
         int count0=0;
         int count1=0;
         int count2=0;

         for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count0++;
            }
            else if(nums[i] == 1){
                count1++;
            }
            else if(nums[i] ==2){
                count2++;
            }
         }

         for(int i=0;i<count0;i++){
            nums[i]=0;
         }
         for(int i=count0;i< count0+count1;i++){
            nums[i]=1;
         }
         for(int i=count0 +count1;i<count0 + count1+count2;i++){
            nums[i]=2;
         }
         printarr(nums);
    }
    public static void sort2(int nums[]){
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid <= high){
            if(nums[mid] ==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else {
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
     printarr(nums);
    }
    public static void main(String[] args) {
        int nums[]={0,1,2,0,1,2,1,2,0,0,0,1};

        sort1(nums);
        sort2(nums);
    }
}
