import java.util.Scanner;

public class RotateArray {

    public static void leftRotateArray(int array[]) {

        int temp;
        temp = array[0];

        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }

        array[array.length - 1] = temp;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array[] = new int[5];
   
        // use this input when rotate from k position
        // System.out.println("Enter position");
        // int position = scanner.nextInt();

        System.out.println("Enter elements in Array");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // rotate from 1 position
        RotateArray.leftRotateArray(array);

        // rotate from k position
        // for (int k = 0; k < position; k++) {

        //     RotateArray.leftRotateArray(array);
        // }

        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
