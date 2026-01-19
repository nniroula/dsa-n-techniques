package algo_searching;
/* Iterarte through each element in the array and compare it with the target value.
   If a match is found, return the index of the element.
   If no match is found after checking all elements, return -1 to 
   indicate that the target is not present in the array. 
 */

   
   /* time complexity: O(n)
      space complexity: O(1)
    */
class LinearSearchImplementation {
   public static int linearSearch(int[] arr, int target) {
     for(int i = 0; i < arr.length; i++) {
        if(arr[i] == target) {
            return i; // Target found at index i
        }
     }
       return -1; // Target not found
    }
}

public class LinearSearch {
    public static void main(String[] args){
        System.out.println("Linear Search Algorithm");

        // Instantiate the class
        LinearSearchImplementation lsObject = new LinearSearchImplementation();
        int[] arrOne = new int[3];
        arrOne[0] = 5;
        arrOne[1] = 10;
        arrOne[2] = 15;
        int resultOne = lsObject.linearSearch(arrOne, 10);
        System.out.println("Target found at index: " + resultOne);
    }
}
