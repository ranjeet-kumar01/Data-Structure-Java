public class MaxSumArray {
    
    public static int findMaxSumSubArray(int array[]) {

        int maxSum = Integer.MIN_VALUE;
        // find start of sub array
        for(int start=0; start < array.length; start++) {
            
            int currSum = 0;

            // find end of sub array
            for(int end=start; end < array.length; end++){
                currSum = currSum + array[end];
                maxSum = Math.max(currSum, maxSum);
            }
        }

        return maxSum;
    }

    // find max sum of sub array using kadane's algo.
    public static int  kandaneAlgo(int array[]){

        int currsum=0;
        int maxSum= Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            
             currsum = currsum + array[i];
             maxSum = Math.max(maxSum, currsum);

             if (currsum < 0) {
                currsum = 0;
             }
        }
        return maxSum;
    } 


    public static void main(String[] args) {
        
        int array[] = {-5, -2, -8, -1, -6};

        int maxSum = MaxSumArray.findMaxSumSubArray(array);
        System.out.println(maxSum);

        System.out.println("Kadane algo answer");
        int algoResult = MaxSumArray.kandaneAlgo(array);
        System.out.println(algoResult);
    }
}
