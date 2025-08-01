package GuviAssignment2;

import java.util.Scanner;

// Main class to handle product operations
public class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // a. Accept five product information from user and store in an array
        System.out.println("Enter details for 5 products:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + (i + 1) + ":");
            System.out.print("Enter PID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // b. Find PID of the product with the highest price
        int maxPid = products[0].getPid();
        double maxPrice = products[0].getPrice();
        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > maxPrice) {
                maxPrice = products[i].getPrice();
                maxPid = products[i].getPid();
            }
        }
        System.out.println("PID of product with highest price: " + maxPid);

        // c. Calculate total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }

    // Method to calculate total amount spent
    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }
}
