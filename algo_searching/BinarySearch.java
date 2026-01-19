package algo_searching;

/* Time Complexity: O(log n)
   Space Complexity: O(1)
   
   Binary Search works on the principle of divide and conquer. It requires the input array to be sorted.
   The algorithm repeatedly divides the search interval in half. If the value of the target is less than 
   the value in the middle of the interval, it narrows the interval to the lower half. Otherwise, it narrows 
   it to the upper half. This process continues until the target value is found or the interval is empty.

   NOTE: Always sort the array with Arrays.sort(arr) before using Binary Search if the array is not already sorted.

 */
class BinarySearchImplementation {
    public int binarySearch(int [] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while(startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if(arr[middleIndex] == target) {
                return middleIndex; // Target found at middleIndex
            } else if(arr[middleIndex] < target) {
                startIndex = middleIndex + 1; // Search in the right half
            } else if(arr[middleIndex] > target) {
                endIndex = middleIndex - 1; // Search in the left half
            }
        } 

        return -1; // Placeholder return value
   
     
    }
}
public class BinarySearch {
    public static void main(String[] args){
        System.out.println("Binary Search Algorithm");

        // Instantiate the class
        BinarySearchImplementation bsObject = new BinarySearchImplementation();

        // create an array
        int[] arrOne = new int[5];
        arrOne[0] = 1;
        arrOne[1] = 3;
        arrOne[2] = 5;
        arrOne[3] = 7;
        arrOne[4] = 9;

        int[] arrTwo = {2, 4, 6, 8, 10, 12};

        // call the binarySearch method
        int resultOne = bsObject.binarySearch(arrOne, 7);
        System.out.println("Target found at index: " + resultOne);
        int resultTwo = bsObject.binarySearch(arrTwo, 24); // target not present
        System.out.println("Target found at index: " + resultTwo);

    }  
}
