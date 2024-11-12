import java.util.ArrayList;

public class KthSmallestElement {
    
    // Method to find the k-th smallest element in a sorted list
    public static <T extends Comparable<T>> T findKthSmallest(ArrayList<T> sortedList, int k) {
        if (k < 1 || k > sortedList.size()) {
            throw new IllegalArgumentException("k is out of bounds");
        }
        return sortedList.get(k - 1); // k is 1-based index
    }

    public static void main(String[] args) {
        // Create a sorted list of integers
        ArrayList<Integer> sortedList = new ArrayList<>();
        sortedList.add(1);
        sortedList.add(3);
        sortedList.add(5);
        sortedList.add(7);
        sortedList.add(9);

        // Set k to 3
        int k = 3;

        // Find and print the k-th smallest element
        System.out.println("The " + k + "-th smallest element is: " + findKthSmallest(sortedList, k));
    }
}
