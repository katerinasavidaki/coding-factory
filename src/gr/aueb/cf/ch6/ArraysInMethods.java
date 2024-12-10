package gr.aueb.cf.ch6;

/**
 * Demo with arrays and methods
 */
public class ArraysInMethods {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);       // mono to onoma tou pinaka pername ws pragmatiki parametro pou einai deiktis

        printArray(arr, 0, arr.length - 1);
        printArray(arr, 1, 4);        // 1 k 4 einai oi theseis toy pinaka

    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    /**
     * Overloaded version of printArray. Prints the elements of
     * the array from low to high.
     *
     * @param arr    the input array
     * @param low    the start index
     * @param high   the end index
     */
    public static void printArray(int [] arr, int low, int high) {
        if (low < 0 || high > arr.length - 1) {
            return;
        }

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}