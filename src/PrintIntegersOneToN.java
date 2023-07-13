import java.util.Arrays;

public class PrintIntegersOneToN {
   static void recFun(int i, int[] arr){
       if(i == 0){
           return ;
       }
       recFun(i-1,arr);
       arr[i-1] =i;
   }
   public static void main(String args[]){
       int x = 5;
       int arr[] = new int[x];
       recFun(x,arr);
       System.out.println(Arrays.toString(arr));
   }


}
//INPUT : n=5
//OUTPUT : 1 2 3 4 5
