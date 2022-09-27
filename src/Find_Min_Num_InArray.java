public class Find_Min_Num_InArray {
    public static void main(String[] args) {
        int [] array = {20,56,5,65,89,21,100,500};
        // Assume that first element of array is smallest number
        int min = array[0];
        int index = 0;
        // Traverse the array excluding first element
        for (int i = 1; i < array.length ; i++) {
            if(array[i]<min){
                min = array[i];
                index = array[i];
            }
        }
        System.out.println("The min number in array is "+min);
    }
}
