import java.util.Vector;

public class VectorSum {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(10);

        // Add integers 1 to 10 to the vector
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Integers in the Vector: " + numbers);

        // Calculate the sum of integers in the vector
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of integers: " + sum);
    }
}
