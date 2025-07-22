package Week1_Algorithms_DataStructures.HandsOn3_SortingCustomerOrders.Code;

public class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String toString() {
        return "OrderID: " + orderId + ", Name: " + customerName + ", Total: $" + totalPrice;
    }
}
