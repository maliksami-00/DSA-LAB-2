import java.util.Collections;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector to store integers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        // Sort the Vector in ascending order
        Collections.sort(numbers);

        // Print the sorted Vector
        System.out.println("Sorted Vector: " + numbers);

        // Print the largest (last) element in the sorted Vector
        System.out.println("Largest Number: " + numbers.lastElement());

        // Print the smallest (first) element in the sorted Vector
        System.out.println("Smallest Number: " + numbers.firstElement());
    }
}
