import java.util.Scanner;

/**
 * SmallestElement
 */
public class SmallestElement {

    public static int smallestElement(int array[]) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
           if (array[i] < smallest) {
                smallest = array[i];
           }
        }

       return smallest;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elements in array :");
        int array[] =new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
 Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elements in array :");
        int array[] =new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int result = SmallestElement.smallestElement(array);
        System.out.println("smallest number is " + result);
    }
}