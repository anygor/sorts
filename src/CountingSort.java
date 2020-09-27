public class CountingSort {
    private static int maxElement(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    private static int minElement(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int[] sort(int[] array){
        int max = maxElement(array);
        int min = minElement(array);

        int[] countingArray = new int[max - min + 1];
        int[] sortedArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            countingArray[array[i] - min]++;
        }

        int counter = 0;
        for(int i = 0; i < countingArray.length; i++){
            int count = countingArray[i];
            for(int j = 0; j < count; j++){
                sortedArray[counter] = i + min;
                counter++;
            }
        }
        return sortedArray;
    }


}
