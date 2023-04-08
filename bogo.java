import java.util.*;

public class bogo{
    public static void main(String[] args) {
        int[] arr = generateRandomArray(15); // Change the size of the array here
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        long iterationCount = bogoSort(arr);
        if (iterationCount == Long.MAX_VALUE){ // If iterationCount overflows, the program will terminate
            System.out.println("Overflow; Max iteration count reached");
            System.exit(1);
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Iteration count: " + iterationCount);
    }

    public static long bogoSort(int[] arr) { // Calls shuffle() until isSorted() returns true
        long iterationCount = 0;
        while (!isSorted(arr)) {
            shuffle(arr);
            System.out.println("Iteration" + (iterationCount+ 1)+ ": "+Arrays.toString(arr)); //Comment out this line to stop the program from printing every iteration and get right to the final iteration count
            iterationCount++;
            if (iterationCount == Long.MAX_VALUE){
                break;
           }
        }
        return iterationCount;
    }

    public static boolean isSorted(int[] arr) { // Is sorted? T/F
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void shuffle(int[] arr) { // Shuffles array by swapping two random indices
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static int[] generateRandomArray(int size) { // Populates array elements with random integers
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100); // Change the upper bound of the random integers here
        }
        return arr;
    }
}
