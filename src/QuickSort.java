public class QuickSort {
    public static int[] sort(int[] sortedArray) {
        qsort(sortedArray, 0, sortedArray.length - 1);
        return sortedArray;
    }

    private static int[] qsort(int[] sortedArray, int begin, int end) {
        if (begin >= end) return sortedArray;
        int pivotal = sortedArray[begin + (end - begin) / 2];

        int i = begin, j = end;
        while (i <= j) {
            while (sortedArray[i] < pivotal) {
                i++;
            }
            while (sortedArray[j] > pivotal) {
                j--;
            }
            if (i <= j) {
                int transit = sortedArray[i];
                sortedArray[i] = sortedArray[j];
                sortedArray[j] = transit;
                i++;
                j--;
            }
        }
        if (begin < j) {
            qsort(sortedArray, begin, j);
        }
        if (end > i) {
            qsort(sortedArray, i, end);
        }
        return sortedArray;
    }
}
