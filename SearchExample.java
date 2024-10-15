package popo2;

public class SearchExample {

    // Method to perform binary search on an array of integers
    public static int search(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the key is present at mid
            if (array[mid] == key) {
                return mid; // Key found
            }

            // If key is greater, ignore left half
            if (array[mid] < key) {
                left = mid + 1;
            } else {
                // If key is smaller, ignore right half
                right = mid - 1;
            }
        }

        return -1; // Key not found
    }

    // Method to perform binary search on an array of doubles
    public static int search(double[] array, double key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the key is present at mid
            if (array[mid] == key) {
                return mid; // Key found
            }

            // If key is greater, ignore left half
            if (array[mid] < key) {
                left = mid + 1;
            } else {
                // If key is smaller, ignore right half
                right = mid - 1;
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        // Example integer array
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int intKey = 5;
        int intResult = search(intArray, intKey);
        if (intResult != -1) {
            System.out.println("Integer key " + intKey + " found at index: " + intResult);
        } else {
            System.out.println("Integer key " + intKey + " not found.");
        }

        // Example double array
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        double doubleKey = 3.3;
        int doubleResult = search(doubleArray, doubleKey);
        if (doubleResult != -1) {
            System.out.println("Double key " + doubleKey + " found at index: " + doubleResult);
        } else {
            System.out.println("Double key " + doubleKey + " not found.");
        }
    }
}
