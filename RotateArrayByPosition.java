public class RotateArrayByPosition {

    public static void reverseArray(int array[], int low, int high) {

        int temp;

        while (low < high) {
            
            temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low = low+1;
            high= high-1;

        }
    }
    

    public static void rotateArrayFromPosition(int array[], int position) {

        if (array.length == 0 || position == 0 || position > array.length) {
            System.out.println("invalid input");
            return;
        }

         int low =0;
        int high = array.length-1;
        RotateArrayByPosition.reverseArray(array, low, high);

        high = (array.length-position)-1;

        RotateArrayByPosition.reverseArray(array, low, high);

        low = high+1;
        high = array.length-1;

        RotateArrayByPosition.reverseArray(array, low, high);



    }

    public static void main(String[] args) {
        
        int array[] = {1,2,3,4,5,6,7};

        //  int low =0;
        // int high = array.length-1;
        
        // RotateArrayByPosition.reverseArray(array, low, high);
        RotateArrayByPosition.rotateArrayFromPosition(array, 9);

        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
