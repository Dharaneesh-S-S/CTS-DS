import java.util.HashMap;
import java.util.Scanner;

class Product {

    private int productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "\nProduct ID : " + productId +
               "\nProduct Name : " + productName +
               "\nQuantity : " + quantity +
               "\nPrice : ₹" + price;
    }
}

class InventoryManager {

    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {

        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product ID already exists!");
            return;
        }

        inventory.put(product.getProductId(), product);
        System.out.println("Product Added Successfully.");
    }

    public void updateProduct(int id, String name, int quantity, double price) {

        if (inventory.containsKey(id)) {

            Product p = inventory.get(id);

            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);

            System.out.println("Product Updated Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    public void deleteProduct(int id) {

        if (inventory.containsKey(id)) {
            inventory.remove(id);
            System.out.println("Product Deleted Successfully.");
        } else {
            System.out.println("Product Not Found.");
        }
    }

    public void searchProduct(int id) {

        if (inventory.containsKey(id)) {
            System.out.println(inventory.get(id));
        } else {
            System.out.println("Product Not Found.");
        }
    }

    public void displayProducts() {

        if (inventory.isEmpty()) {
            System.out.println("Inventory is Empty.");
            return;
        }

        System.out.println("\n===== INVENTORY DETAILS =====");

        for (Product p : inventory.values()) {
            System.out.println(p);
            System.out.println("--------------------------");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();

        int choice;

        do {

            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Search Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Product p = new Product(id, name, quantity, price);
                    manager.addProduct(p);
                    break;

                case 2:
                    System.out.print("Enter Product ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Product Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Quantity: ");
                    int newQuantity = sc.nextInt();

                    System.out.print("Enter New Price: ");
                    double newPrice = sc.nextDouble();

                    manager.updateProduct(updateId, newName, newQuantity, newPrice);
                    break;

                case 3:
                    System.out.print("Enter Product ID to Delete: ");
                    int deleteId = sc.nextInt();

                    manager.deleteProduct(deleteId);
                    break;

                case 4:
                    System.out.print("Enter Product ID to Search: ");
                    int searchId = sc.nextInt();

                    manager.searchProduct(searchId);
                    break;

                case 5:
                    manager.displayProducts();
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}