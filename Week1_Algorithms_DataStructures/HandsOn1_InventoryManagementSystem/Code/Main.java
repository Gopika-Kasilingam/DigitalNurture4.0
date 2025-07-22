public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        System.out.println("Adding products to inventory...");
        manager.addProduct(new Product(101, "Laptop", 10, 75000.0));
        manager.addProduct(new Product(102, "Mouse", 50, 500.0));
        manager.addProduct(new Product(103, "Keyboard", 30, 1200.0));

        System.out.println("\nInitial Inventory:");
        manager.displayInventory();

        System.out.println("\nUpdating product with ID 102...");
        manager.updateProduct(102, "Wireless Mouse", 45, 650.0);

        System.out.println("\nDeleting product with ID 103...");
        manager.deleteProduct(103);

        System.out.println("\nUpdated Inventory:");
        manager.displayInventory();
    }
}
