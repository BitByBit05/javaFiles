import java.util.Scanner;

public class ArrayUserInput {

    public static void main(String[] args) {
        // Declare an array of integers.  The size is not yet known.
        int[] myArray;

        // Declare an integer variable to store the size of the array.
        int arraySize;

        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array.
        System.out.print("Enter the size of the array: ");
        arraySize = scanner.nextInt(); // Read the size from the user.

        // Now that we know the size, create the array.
        myArray = new int[arraySize];

        // Prompt the user to enter the elements of the array.
        System.out.println("Enter the elements of the array:");

        // Use a for loop to iterate through the array and get input from the user.
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt(); // Read the element and store it in the array.
        }

        // Print the array elements (optional, to verify the input).
        System.out.println("The elements of the array are:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println(); // Print a newline character for better formatting.

        // Close the scanner to prevent resource leaks.  It's good practice to do this.
        scanner.close();
    }
}

