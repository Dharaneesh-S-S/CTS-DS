import java.util.Arrays;

class Product {

    int productId;
    String productName;
    String category;

    public Product(int productId,
                   String productName,
                   String category) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {

        return "Product ID : " + productId +
               "\nProduct Name : " + productName +
               "\nCategory : " + category;
    }
}

public class Main1 {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {

            if (product.productId == targetId) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }

            else if (products[mid].productId < targetId) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shirt", "Fashion"),
                new Product(105, "Shoes", "Fashion")
        };

        System.out.println("===== LINEAR SEARCH =====");

        Product result1 = linearSearch(products, 104);

        if (result1 != null)
            System.out.println(result1);
        else
            System.out.println("Product Not Found");


        System.out.println("\n===== BINARY SEARCH =====");

        Product result2 = binarySearch(products, 104);

        if (result2 != null)
            System.out.println(result2);
        else
            System.out.println("Product Not Found");
    }
}