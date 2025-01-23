public class StringArray {

    public static void main(String[] args) {

         // Declare and initialize a string array
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        // Print all elements of the array
        System.out.println("Original Array:");

        for (String fruit: fruits) {
            System.out.println(fruit);
        }
        // Access and modify an element

        fruits[1] = "Blueberry"; // Changing "Banana" to "Blueberry"
        // Add a new element (replace an existing one)

        fruits[3] = "Dragonfruit"; // Replacing "Date" with "Dragonfruit

           // Print modified array

        System.out.println("\nModified Array:");

        for (String fruit: fruits) {

            System.out.println(fruit);

        }
    }
}
