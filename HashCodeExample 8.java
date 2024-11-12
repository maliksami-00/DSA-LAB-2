import java.util.Scanner;

public class HashCodeExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        // Calculate the hash code of the input string
        int hashCodeValue = userInput.hashCode();

        // Display the hash code value
        System.out.println("HashCode value: " + hashCodeValue);

        // Close the scanner to avoid resource leak
        input.close();
    }
}
