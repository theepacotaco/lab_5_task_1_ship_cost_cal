import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the price of the item
        System.out.print("Enter the price of the item: $");
        double itemPrice = scanner.nextDouble();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate shipping cost
        double shippingCost;
        if (itemPrice >= 100) {
            shippingCost = 0;  // Free shipping for items priced $100 or more
        } else {
            shippingCost = itemPrice * 0.02;  // 2% of the item price for items under $100
        }

        // Calculate total price
        double totalPrice = itemPrice + shippingCost;

        // Output the shipping cost and total price
        System.out.printf("Shipping cost: $%.2f%n", shippingCost);
        System.out.printf("Total price: $%.2f%n", totalPrice);
    }
}
