package algo_sorting;

import java.util.Arrays;

class BubbleSortImplementation {
    // method to implement bubble sort
    public int[] bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) { // outer loop for iterations. First iteration sorts the biggest element as the last item
            for(int j=0; j<arr.length-1-i; j++) { // inner loop for comparison and swapping
                if(arr[j] > arr[j+1]) { // comparison
                    // swap
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

}
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(" ---- The Bubble Sort implementation ------");

        // isntantiate the BubbleSortImplementation class
        BubbleSortImplementation bubbleSortImplObj = new BubbleSortImplementation();
        int arrOne[] = new int[7];
        arrOne[0] = 64;
        arrOne[1] = 34;
        arrOne[2] = 25;
        arrOne[3] = 12;
        arrOne[4] = 22;
        arrOne[5] = 11;
        arrOne[6] = 90; 

        // calling the bubbleSort method
        int sortedArr[] = bubbleSortImplObj.bubbleSort(arrOne);
        System.out.println("The sorted array using Bubble sort is: ");
        System.out.print(Arrays.toString(sortedArr));
        System.out.println();

    }// end of main method
}
