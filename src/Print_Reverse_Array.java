
public class Print_Reverse_Array {
    public static void main(String[] args) {
        int [] a = {87,20,30,15,90,110,78};
        int start = 0;
        int end = a.length-1;
        int temp = 0;

        while(start<end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+", ");
        }
    }
}
