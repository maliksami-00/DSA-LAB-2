import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add String\n2. Display All\n3. Display Largest\n4. Exit");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    list.add(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Elements: " + list);
                    break;
                case 3:
                    String largest = list.stream()
                            .max((s1, s2) -> s1.length() - s2.length())
                            .orElse("No strings available");
                    System.out.println("Largest String: " + largest);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
