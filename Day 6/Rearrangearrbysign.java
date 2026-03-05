import java.util.ArrayList;

public class Rearrangearrbysign {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void rearrange1(int arr[]){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }
         
        for(int i=0;i<arr.length/2;i++){
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        }
        printarr(arr);
        
    }
    public static void rearrange2(int arr[]){
        int ans[]=new int[arr.length];
        
        int pos=0;
        int neg=1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                ans[pos]=arr[i];
                pos +=2;
            }
            else{
                ans[neg]=arr[i];
                neg +=2;
            }
        }
        printarr(ans);

        
    }
    public static void main(String[] args) {
        int arr[]={3,1,-2,-5,2,-4};
        rearrange2(arr);

    }
}
