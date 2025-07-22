package Week1_Algorithms_DataStructures.HandsOn3_SortingCustomerOrders.Code;

public class Main {
    public static void main(String[] args) {
        Order[] orders1 = {
            new Order(101, "Alice", 300.0),
            new Order(102, "Bob", 120.0),
            new Order(103, "Charlie", 450.5),
            new Order(104, "David", 200.3)
        };

        Order[] orders2 = orders1.clone();  // For quick sort

        System.out.println("Original Orders:");
        for (Order o : orders1) System.out.println(o);

        System.out.println("\nSorted by Bubble Sort based on totalPrice:");
        BubbleSort.sort(orders1);
        for (Order o : orders1) System.out.println(o);

        System.out.println("\nSorted by Quick Sort based on totalPrice:");
        QuickSort.sort(orders2, 0, orders2.length - 1);
        for (Order o : orders2) System.out.println(o);
    }
}
