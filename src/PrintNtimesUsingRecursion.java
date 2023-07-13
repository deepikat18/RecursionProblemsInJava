public class PrintNtimesUsingRecursion {
    static  void func (int i, int n){
        if(i>n) return;
        System.out.println("Raj");
        func(i+1,n);
    }
    public static void main(String[] arg){
        int n = 4;
        func(1,4);
    }
}
