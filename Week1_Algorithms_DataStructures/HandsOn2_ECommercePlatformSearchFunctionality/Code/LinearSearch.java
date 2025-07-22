package Week1_Algorithms_DataStructures.HandsOn2_ECommercePlatformSearchFunctionality.Code;

public class LinearSearch {

    public static int searchById(Product[] products, int searchId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == searchId) {
                return i;
            }
        }
        return -1;
    }
}

