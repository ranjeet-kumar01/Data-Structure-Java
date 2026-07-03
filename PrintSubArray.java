import java.util.Scanner;

public interface PrintSubArray {
    
    public static int  printAllSubArray(int array[]) {

        int count=0;
        System.out.println("possible sub array is ");

        // find start of sub array

        for(int start=0; start<array.length; start++){

            //find end of sub array
          
            for(int end=start; end < array.length; end++) {

                // count total number of sub array
                  count++;
                // traverse all sub array

                for (int i = start; i <= end; i++) {
                    System.out.print(array[i] + "\t");
                   
                }

                System.out.println();
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter Elements in array :");
        int array[] = {4,5,-1,3,-2};

        // for (int i = 0; i < array.length; i++) {
        //     array[i] = scanner.nextInt();
        // }

        int totalSubArray = PrintSubArray.printAllSubArray(array);

        System.out.println(totalSubArray);
    }
}
