package Week1_Algorithms_DataStructures.HandsOn2_ECommercePlatformSearchFunctionality.Code;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Electronics"),
            new Product(103, "Shirt", "Clothing"),
            new Product(104, "Keyboard", "Electronics"),
            new Product(105, "Shoes", "Footwear")
        };

        int searchId = 104;

        System.out.println("----- Linear Search by ID -----");
        int linearIndex = LinearSearch.searchById(products, searchId);
        if (linearIndex != -1) {
            System.out.println("Product found at index " + linearIndex + ": " + products[linearIndex]);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\n----- Binary Search by ID -----");
        int binaryIndex = BinarySearch.searchById(products, searchId);
        if (binaryIndex != -1) {
            System.out.println("Product found at index " + binaryIndex + ": " + products[binaryIndex]);
        } else {
            System.out.println("Product not found.");
        }
    }
}

