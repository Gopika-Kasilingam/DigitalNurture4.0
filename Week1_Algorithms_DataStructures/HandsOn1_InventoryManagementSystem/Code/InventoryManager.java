import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update Product
    public void updateProduct(int productId, String name, int quantity, double price) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setProductName(name);
            p.setQuantity(quantity);
            p.setPrice(price);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    // Display Inventory
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }
}
