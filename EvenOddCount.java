import java.util.Scanner;

public class EvenOddCount {
    
    public static int countEven(int array[]) {

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 ==0 ) {
                evenCount++;
            } else{
                oddCount++;
            }
        }
        return evenCount;
    }

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Elements in array :");
        int array[] =new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

       int evenCount =  EvenOddCount.countEven(array);
       int oddCount = array.length-evenCount;

       System.out.println("Even count is "+ evenCount);
       System.out.println("Odd count is "+ oddCount);

    }
}
