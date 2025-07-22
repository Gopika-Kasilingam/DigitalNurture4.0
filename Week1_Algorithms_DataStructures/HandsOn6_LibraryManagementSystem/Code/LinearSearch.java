package Week1_Algorithms_DataStructures.HandsOn6_LibraryManagementSystem.Code;

public class LinearSearch {
    public static int searchByTitle(Book[] books, String targetTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(targetTitle)) {
                return i;
            }
        }
        return -1;
    }
}
