public class maxproductsubarr {
    public static int maxproduct1(int nums[]){
       int maxproduct=0;
       int product=1;

       for(int i=0;i<nums.length;i++){
          for(int j=i;j<nums.length;j++){
             product=1  ;
             for(int k=i ;k<=j;k++){
                product = product*nums[k];
             } 
             maxproduct=Math.max(maxproduct, product);
          }
       }
       return maxproduct;
    }
    public static int maxproduct2(int nums[]){
       int maxproduct=0;
       int product=1;

       for(int i=0;i<nums.length;i++){
        product=1;
          for(int j=i;j<nums.length;j++){
             product = product *nums[j];
             if(product > maxproduct){
                maxproduct=product;
             }
          }
       }
       return maxproduct;
    }
    public static int maxproduct3(int nums[]){
       int maxproduct=0;
       int product=1;

       for(int i=0;i<nums.length;i++){
          
        product = product * nums[i];
        maxproduct=Math.max(maxproduct, product);
        if(product < 0){
            product=1;
        }
       }
       return maxproduct;
    }
    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
        System.out.println(maxproduct2(nums));
        
    }    
}
