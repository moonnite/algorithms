import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] iArray = {38, 49, 12, 36, 88, 15, 6, 61};
        System.out.println("Before sorting: "+ Arrays.toString(iArray));
        selectionSort(iArray);
        System.out.println("After sorting: "+Arrays.toString(iArray));
    }

    public static void selectionSort(int[] iarray) {
        int length = iarray.length;

        for (int i = 0; i < length - 1; i++) {
            int minPos = i;
            int min = iarray[minPos];
            // search smalles Element in remaining array (from minPos unil end)
            for (int j = i + 1; j < length; j++) {
                if (iarray[j] < min) {
                    minPos = j;
                    min = iarray[minPos];
                }
            }
            // Swap min and element at i
            if (minPos != i) {
                iarray[minPos] = iarray[i];
                iarray[i] = min;
            }
        }
    }
}