public class CocktailSort {
    public static int[] sort(int[] sortedArray) {
        //TODO don't swap but move them
        int lastRightIndex = 0, lastLeftIndex = 0;
        int movedElement;
        int leftBorder = 1;
        int rightBorder = sortedArray.length - 1;
        while (leftBorder <= rightBorder) {
            for (int i = rightBorder; i >= leftBorder; i--) {
                if (sortedArray[i - 1] > sortedArray[i]) {
                    movedElement = sortedArray[i];
                    sortedArray[i] = sortedArray[i - 1];
                    sortedArray[i - 1] = movedElement;
                    lastRightIndex = i;
                }
            }
            if (lastRightIndex != 0 && lastRightIndex > leftBorder) {
                leftBorder = lastRightIndex;
            } else {
                leftBorder++;
            }
            for (int i = leftBorder; i <= rightBorder; i++) {
                if (sortedArray[i - 1] > sortedArray[i]) {
                    movedElement = sortedArray[i];
                    sortedArray[i] = sortedArray[i - 1];
                    sortedArray[i - 1] = movedElement;
                    lastLeftIndex = i;
                }
            }
            if (lastLeftIndex != 0 && lastLeftIndex < rightBorder) {
                rightBorder = lastLeftIndex;
            } else {
                rightBorder--;
            }
        }
        return sortedArray;
    }
}
