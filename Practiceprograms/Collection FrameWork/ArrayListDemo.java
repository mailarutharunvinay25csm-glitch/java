import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Ravi");
        names.add("Sita");
        names.add("Arun");
        names.add("Kiran");

        System.out.println("ArrayList: " + names);

        // Add element at a particular index
        names.add(2, "Rahul");
        System.out.println("After adding at index 2: " + names);

        // Get an element
        System.out.println("Element at index 1: " + names.get(1));

        // Change an element
        names.set(1, "Priya");
        System.out.println("After changing: " + names);

        // Remove by index
        names.remove(2);
        System.out.println("After removing index 2: " + names);

        // Check element
        System.out.println("Contains Ravi? " + names.contains("Ravi"));

        //  Find size
        System.out.println("Size: " + names.size());

        //  Find index
        System.out.println("Index of Kiran: " + names.indexOf("Kiran"));

        //  Check empty
        System.out.println("Is empty? " + names.isEmpty());

        // Display using loop
        System.out.println("Elements:");
        for (String name : names) {
            System.out.println(name);
        }

        //  Clear all elements
        names.clear();
        System.out.println("After clear: " + names);

        //  Check empty again
        System.out.println("Is empty? " + names.isEmpty());
    }
}
