package Week1_Algorithms_DataStructures.HandsOn6_LibraryManagementSystem.Code;

import java.util.Arrays;

public class BinarySearch {
    public static int searchByTitle(Book[] books, String targetTitle) {
        Arrays.sort(books); // Sort by title before searching

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase(targetTitle);

            if (cmp == 0) {
                return mid;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
