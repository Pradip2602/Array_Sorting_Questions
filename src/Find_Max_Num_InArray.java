public class Find_Max_Num_InArray {
    public static void main(String[] args) {
        int [] arr = {10,50,56,48,90,24,120};
        // assume first elements is largest in array
        int max = arr[0];
        // we traverse array excluding first element
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The max number in array is "+max);
    }
}
