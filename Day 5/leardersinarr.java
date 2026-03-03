import java.util.ArrayList;

public class leardersinarr{
    public static ArrayList<Integer> leaders1(int arr[]){
     
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            boolean leaders=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    leaders =false;
                }
            }
            if(leaders == true){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    public static ArrayList<Integer> leaders2(int arr[]){
        ArrayList<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;

        for(int i=arr.length-1;i>=0;i--){
                if(arr[i] > max){
                    ans.add(arr[i]);
                }
            max=Math.max(max, arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,22,12,3,0,6};

        System.out.println(leaders1(arr));
        System.out.println(leaders2(arr));
    }
}