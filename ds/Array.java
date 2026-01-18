class ArrayImplementation {
    // create an array
    public int[] createArray() {
        int[] evenNums = new int[3]; // decalre an array
        evenNums[0] = 2; // initialize array elements
        evenNums[1] = 4;
        evenNums[2] = 6;

        return evenNums;
    }

    //print array elements
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


public class Array { 
    public static void main(String[] args) {
        System.out.println("Hello, Array World!");

        ArrayImplementation arrayImpl = new ArrayImplementation();
        int[] arrayOne; // declare an array
        arrayOne = arrayImpl.createArray();
        arrayImpl.printArray(arrayOne); //call print array method
    }
}