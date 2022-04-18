import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] iArray = {38, 49, 12, 36, 88, 15, 6, 61};
        System.out.println("Before sorting: "+Arrays.toString(iArray));
        insertionSort(iArray);
        System.out.println("After sorting: "+Arrays.toString(iArray));
    }

    public static void insertionSort(int[] iarray){
        int n = iarray.length;
        for (int j = 1; j < n; j++) {
            int currentValue = iarray[j];
            int i = j-1;
            while ( (i >= 0) && ( iarray [i] > currentValue ) ) {
                iarray [i+1] = iarray [i];
                i--;
            }
            iarray[i+1] = currentValue;
        }
    }
}