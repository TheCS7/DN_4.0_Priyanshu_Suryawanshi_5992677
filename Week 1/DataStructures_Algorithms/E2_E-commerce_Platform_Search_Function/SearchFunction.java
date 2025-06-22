import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " (" + category + ")";
    }
}

class LinearSearch {
    public static Product search(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
}

class BinarySearch {
    public static Product search(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}

public class SearchFunction {
    public static void main(String[] args) {
        Product[] unsortedProducts = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Footwear"),
            new Product(104, "T-Shirt", "Clothing"),
            new Product(105, "Watch", "Accessories")
        };

        // Sorted PRoduct array for binary search
        Product[] sortedProducts = Arrays.copyOf(unsortedProducts, unsortedProducts.length);
        Arrays.sort(sortedProducts, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println(" Linear Search:");
        Product linearResult = LinearSearch.search(unsortedProducts, "Shoes");
        System.out.println(linearResult != null ? linearResult : "Product not found");

        System.out.println("\n Binary Search:");
        Product binaryResult = BinarySearch.search(sortedProducts, "Shoes");
        System.out.println(binaryResult != null ? binaryResult : "Product not found");
    }
}
