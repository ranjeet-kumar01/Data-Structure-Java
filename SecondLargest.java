import java.util.Scanner;

/**
 * SecondLargest
 */
public class SecondLargest {

     public static int findSecondLargest(int array[]) {

            int largest = array[0];
            int secondLargest = array[1];

            for (int i = 1; i < array.length; i++) {
                if (array[i] > largest) {
                    secondLargest = largest;
                    largest = array[i];
                } 

                if (array[i] > secondLargest && array[i] != largest) {
                    secondLargest = array[i];
                }
            }

            return secondLargest;
        }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elements in array :");
        int array[] =new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int secondLargest = SecondLargest.findSecondLargest(array);
        System.out.println("second largest element in "+secondLargest);

    }
}