public class SelectionSort {
    public static int[] sort(int[] sortedArray){
        int initialPoint = 0;
        int minIndex = 0;
        int transit;
        while(initialPoint < sortedArray.length - 1) {
            if(sortedArray.length - (initialPoint + 1) == 1){
                if (sortedArray[initialPoint] < sortedArray[initialPoint + 1]){
                    break;
                }
                else {
                    transit = sortedArray[initialPoint];
                    sortedArray[initialPoint] = sortedArray[initialPoint + 1];
                    sortedArray[initialPoint + 1] = transit;
                }
            }
            int minElement = sortedArray[initialPoint];
            minIndex = initialPoint;
            for (int i = initialPoint + 1; i < sortedArray.length; i++) {
                if (sortedArray[i] < minElement) {
                    minElement = sortedArray[i];
                    minIndex = i;
                }
            }
            sortedArray[minIndex] = sortedArray[initialPoint];
            sortedArray[initialPoint] = minElement;
            initialPoint++;
        }
        return sortedArray;
    }
}
