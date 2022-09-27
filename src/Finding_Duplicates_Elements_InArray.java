public class Finding_Duplicates_Elements_InArray {
    public static void main(String[] args) {
        int [] a = {10,56,20,29,10,20,56};
        System.out.println("Duplicate elements are :");
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j<a.length; j++){
                if (a[i]==a[j] && i!=j){
                    System.out.print(a[j]+", ");
                }
            }
        }
    }
}
