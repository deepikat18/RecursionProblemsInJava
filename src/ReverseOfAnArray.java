public class ReverseOfAnArray {
    static void ReverseArray(int arr[],int start,int end){
        if (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            ReverseArray(arr,start+1,end-1);
        }
    }
    static void PrintArray(int arr[],int n){
        System.out.println("Reversed Array : ");
        for (int i =0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {5,4,3,2,1};
        ReverseArray(arr,0,n-1);
        PrintArray(arr,n);
    }
}
