package Week1_Algorithms_DataStructures.HandsOn2_ECommercePlatformSearchFunctionality.Code;

import java.util.Arrays;

public class BinarySearch {

    public static int searchById(Product[] products, int searchId) {
        Arrays.sort(products); // Sort before binary search

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int currentId = products[mid].getProductId();

            if (currentId == searchId) {
                return mid;
            } else if (currentId < searchId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

