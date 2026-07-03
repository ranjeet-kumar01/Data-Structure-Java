import java.util.Scanner;

public class CheckSortedArray {
    
    
    public static boolean checkIsArraySorted(int array[]) {
        boolean res = false;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] <= array[i+1]) {
               res = true;
            } else{
                res = false;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elements in array :");
        int array[] = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        boolean result = CheckSortedArray.checkIsArraySorted(array);
        System.out.println(result);
    }
}
