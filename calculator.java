import java.util.Scanner;

class Add {
    static void addition() {
        // Scanner to take input from the user
        Scanner addsc = new Scanner(System.in);

        // Asking for two numbers to add
        System.out.println("Enter Number 1:");
        int a = addsc.nextInt();
        System.out.println("Enter Number 2:");
        int b = addsc.nextInt();

        // Calculating sum
        int sum = a + b;

        // Displaying the sum
        System.out.println("Sum: " + sum);
        addsc.close();
    }
}

public class calculator {
    public static void main(String[] args) {
        // Create a scanner to take user input in the main method
        Scanner scanner = new Scanner(System.in);

        // Display welcome message and menu options
        System.out.println("Welcome to Simple Calculator!");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Ask user to choose an operation
        System.out.println("Choose an operation (1, 2, 3, 4):");
        int choice = scanner.nextInt();

        // Check user's choice and call appropriate function
        if (choice == 1) {
            // Call the addition function
            Add.addition();
        } else if (choice == 2) {
            // You can implement subtraction here
            System.out.println("Subtraction feature not yet implemented.");
        } else if (choice == 3) {
            // You can implement multiplication here
            System.out.println("Multiplication feature not yet implemented.");
        } else if (choice == 4) {
            // You can implement division here
            System.out.println("Division feature not yet implemented.");
        } else {
            // Handle invalid input
            System.out.println("Invalid choice! Please select a valid operation.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
