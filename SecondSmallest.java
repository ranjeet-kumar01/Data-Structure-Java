import java.util.Scanner;

/**
 * second smallest
 */
public class SecondSmallest {

     public static int findSecondSmallest(int array[]) {

            int smallest = array[0];
            int secondSmallest = array[1];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = array[i];
                }

                if (array[i] < secondSmallest && array[i] != smallest) {
                    secondSmallest = array[i];
                }
            }
            return secondSmallest;
        }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elements in array :");
        int array[] =new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int result = SecondSmallest.findSecondSmallest(array);
        System.out.println(result + " is second smallest element in array ");

       
    }
}