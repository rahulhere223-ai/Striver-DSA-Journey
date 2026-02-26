public class linearsearch{
    public static int search(int nums[],int x){
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(nums[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={6,7,8,4,1};
        System.out.println(search(nums, 2));

    }
}