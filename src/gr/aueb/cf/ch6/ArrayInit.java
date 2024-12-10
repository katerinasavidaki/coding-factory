package gr.aueb.cf.ch6;


/**
 * Δηλωση και αρχικοποίηση ενός πίνακα
 * Populate ενός πίνακα:
 * - new
 * - unsized initialization
 * - array initializer
 * - print τα στοιχεια ενος πινακα
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr = new int[3];              // declare and initialize
        int[] arr2 = { 1, 2, 3, 4, 5 };      // unsized init
        int [] arr3;
        arr3 = new int[] {1, 2, 3, 4, 5};  ///array initializer


        // Populate (dwsame times)
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // traverse (diasxisi tou pinaka)
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        //enhanced for
        for (int el : arr3) {
            System.out.print(el + " ");
        }
    }
}
