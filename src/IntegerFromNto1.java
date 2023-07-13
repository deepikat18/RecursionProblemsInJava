import java.util.Arrays;

public class IntegerFromNto1 {
    static void recFun(int i, int n){
        if(i < 1){
            return ;
        }
        System.out.println(i);
        recFun(i-1,n);
    }
    public static void main(String args[]){
        int n = 5;
        recFun(n,n);
    }
}
