import java.util.Scanner;

/**
 * LinearSearch
 */
public class LinearSearch {

    

     public static int linearSearch(int array[], int target){

            for (int i = 0; i < array.length; i++) {
                if(array[i] == target){
                    return i;
                    
                }
            }
                return-1;

        }

    public static void main(String[] args) {
        
        int array[] = new int[6];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elements in Array");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter Target Element");
        int target = scanner.nextInt();

        int resultIndex =LinearSearch.linearSearch(array, target);
        System.out.println("Element found on "+ resultIndex + "  position");
       
    }
}