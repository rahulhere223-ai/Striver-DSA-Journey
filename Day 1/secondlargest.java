

public class secondlargest {
    public static int seclarge(int nums[]){
       int largest=nums[0];
       int slargest=-1;

      for(int i=0;i<nums.length;i++){
        if(nums[i] > largest){
            slargest=largest;
            largest=nums[i];
        }
        else if(nums[i] <largest && nums[i] >slargest){
            slargest=nums[i];
        }
      }
      return slargest;
    }
    public static void main(String[] args) {
        int nums[]={1,2,4,7,7,5};

        System.out.println(seclarge(nums));


    }
}
