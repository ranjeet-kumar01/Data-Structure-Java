import java.util.Scanner;

public class MergeSortedArray {
    
    public static void mergeSortedArray(int array1[], int array2[], int result[]) {

        int i =0;
        int j = 0;
        int k = 0;
        while (i < array1.length && j< array2.length) {
            if (array1[i] < array2[j]) {
                result[k] = array1[i];
                i++;
                k++;
            } else {
                result[k] = array2[j];
                j++;
                k++;
            } 


        }

         while (i< array1.length) {
                result[k] = array1[i];
                i++;
                k++;
           }
           while (j< array2.length) {
                result[k] = array2[j];
                j++;
                k++;
           }
    }
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        int array1[] =new int[8];
        int array2[] =new int[5];
        int result[] = new int[15];
        
        System.out.println("Enter Elements in array 1 :");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        
        System.out.println("Enter Elements in array 2 :");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        MergeSortedArray.mergeSortedArray(array1, array2, result);

        System.out.println("result array is -------------");

        for (int i : result) {
            System.out.print("| " +i  +" |");
        }

    }
}
