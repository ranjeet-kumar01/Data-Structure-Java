import java.util.Scanner;

public class ReverseArray {
    
    public static void reverseArray(int array[]) {

        int i = 0;
        int j = array.length-1;
        while (i<=j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elements in array :");
        int array[] =new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        ReverseArray.reverseArray(array);

        System.out.println("result array is ...");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
