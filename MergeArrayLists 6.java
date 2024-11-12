import java.util.ArrayList;

public class MergeArrayLists {
    public static void main(String[] args) {
        // Create the first ArrayList and add elements
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        // Create the second ArrayList and add elements
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Orange");
        list2.add("Grapes");

        // Merge list2 into list1
        list1.addAll(list2);

        // Print the merged ArrayList
        System.out.println("Merged ArrayList: " + list1);
    }
}
