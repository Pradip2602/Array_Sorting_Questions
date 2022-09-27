public class Delete_Element_InArray {
    public static void delete(int []a){
        int delete = 30;
        for (int i = 0; i <a.length ; i++) {
            if (delete == a[i]){
                for (int j=i; j< a.length-1; j++){
                    a[j]= a[j+1];
                }
                break;
            }
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] a = {52,65,78,22,30,12,62,45,11};
        delete(a);
    }
}
