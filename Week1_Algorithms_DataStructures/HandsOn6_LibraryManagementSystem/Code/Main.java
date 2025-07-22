package Week1_Algorithms_DataStructures.HandsOn6_LibraryManagementSystem.Code;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee"),
            new Book(3, "1984", "George Orwell"),
            new Book(4, "Pride and Prejudice", "Jane Austen"),
            new Book(5, "Moby Dick", "Herman Melville")
        };

        String searchTitle = "1984";

        System.out.println("----- Linear Search -----");
        int indexLinear = LinearSearch.searchByTitle(books, searchTitle);
        if (indexLinear != -1) {
            System.out.println("Book found at index " + indexLinear + ": " + books[indexLinear]);
        } else {
            System.out.println("Book not found.");
        }

        System.out.println("\n----- Binary Search -----");
        int indexBinary = BinarySearch.searchByTitle(books, searchTitle);
        if (indexBinary != -1) {
            System.out.println("Book found at index " + indexBinary + ": " + books[indexBinary]);
        } else {
            System.out.println("Book not found.");
        }
    }
}
