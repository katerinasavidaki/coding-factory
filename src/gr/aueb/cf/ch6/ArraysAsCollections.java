package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {12, 22, 32, 8, 9};

    }

    public static int[] getEvens(int[] arr) {
        int count = 0;
        int pivot = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }

        int[] evens = new int[count];

        for (int el : arr) {
            if (el % 2 == 0) {
                evens[pivot] = el;
                pivot++;
            }
        }
        return evens;
    }

    public static int[] mapToDouble(int[] arr) {

       int[] doubleArray = new int[arr.length];

      for (int i = 0; i < arr.length; i++) {
          doubleArray[i] = arr[i] * 2;
      }
        return doubleArray;
    }

    //Reducing
    public static int sum(int[] arr) {
        int sum = 0;

        for (int el : arr) {
            sum += el;
        }

//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
        return sum;
    }

    public static double average(int[] arr) {
//        double avg = 0.0;
//        int sum = 0;
//
//        for (int el : arr) {
//            sum += el;
//        }
//        avg = (double) sum / arr.length;


        return sum(arr) / (double) arr.length;
    }

    public static boolean anyEven(int[] arr) {
        boolean isAnyEven = false;

        for (int el : arr) {
            if (el % 2 == 0) {
                isAnyEven = true;
                break;
            }
        }
        return isAnyEven;
    }

    public static boolean moreThanTwoEvens(int[] arr) {
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                count++;
                break;
            }
        }
        return count >= 1;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr) {
        int[] endings = new int[10];
        boolean isSameEnding = false;

        //        for (int i = 0; i < arr.length; i++) {
//            endings[arr[i] % 10]++;
//        }

        for (int num : arr) {
            endings[num % 10]++;
        }

        for (int count : endings) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return isSameEnding;

    }

    public static boolean allAreEven(int[] arr) {

//        return getEvens(arr).length == arr.length;

        boolean allEven = false;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count == arr.length;
    }
}
