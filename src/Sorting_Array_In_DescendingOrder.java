public class Sorting_Array_In_DescendingOrder {
    public static void main(String[] args) {
        int [] a = {23,65,89,41,56,877,245};
        int max = 0 ,temp = 0;
        for (int i = 0; i < a.length; i++) {
            max = i;
            for (int j = i+1; j<a.length; j++){
                if (a[j]>a[max]){
                    max = j;
                }
            }
            temp = a[i];
            a[i]=a[max];
            a[max] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+", ");
        }
    }
}
