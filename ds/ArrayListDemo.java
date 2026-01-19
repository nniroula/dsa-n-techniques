import java.util.ArrayList;

class ArrayListImplementation {
    // Implementation details would go here
    public void addElement(ArrayList<Integer> arList, int index, int value) {
        // Method to add an element to the ArrayList
       //ArrayList<Integer> al = new ArrayList<>(ArrayList<Integer> arList, int value) {;
        // al.add(10);
        // al.add(2, 30); // Adding element at index 2
        arList.add(index, value);
    }
} 

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println("This is an ArrayList implementation.");

        //instantiating the ArrayListImplementation class
        ArrayListImplementation arrayListImplObj = new ArrayListImplementation();
        ArrayList<Integer> al = new ArrayList<>();
        arrayListImplObj.addElement(al, 0, 10); // Adding element at index 0
        arrayListImplObj.addElement(al, 1, 20); // Adding element at index 2
        arrayListImplObj.addElement(al, 0, 1); // Adding element at index 0
        System.out.println("ArrayList after adding elements: " + al);
        al.set(0, 55); // Modifying element at index 0
        System.out.println("ArrayList after modifying element at index 0: " + al);

        //size
        al.size();
        System.out.println("Size of the ArrayList: " + al.size());

        //remove
        al.remove(2); // Removing element at index 2
        System.out.println("ArrayList after removing element at index 2: " + al);   

        //condition remove
        al.remove(Integer.valueOf(20)); // Removing element with value 20
        System.out.println("ArrayList after removing element with value 20: " + al);    
      
    }
}

  
