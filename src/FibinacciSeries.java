import static javax.swing.text.html.HTML.Attribute.N;

public class FibinacciSeries {
    static int fibinacci(int n){
        if (n<=1){
            return n;}
        int last = fibinacci(n-1);
        int start = fibinacci(n-2);
        return last+start;
    }

    public static void main(String[] args) {
        int n =6;
        System.out.println(fibinacci(n));
    }
}
