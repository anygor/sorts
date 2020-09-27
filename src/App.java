import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int size;
        int[] array;
        int[] newArray;
        long nanoTime;

        System.out.println("Hello, this is the sorting app");
        System.out.println("Type help for list of commands");
        System.out.println("Type quit to abort the app");

        String command;
        Scanner scanner = new Scanner(System.in);

        loop:
        while(true){
            System.out.println("Type a command:");
            command = scanner.nextLine();
            switch (command) {
                case "help" : {
                    System.out.println("help - duh");
                    System.out.println("quit - abort the app");
                    System.out.println("demo - to see the app in its glory");
                    break;
                }
                case "quit" : {
                    break loop;
                }
                case "demo" : {
                    System.out.println("Here you will create an array of any size\n" +
                            "And you will see the difference between the different sort implementations");
                    System.out.println("Type a size, the app will generate an array of that size" +
                            "with random elements in range [-1000, 999]");
                    size = scanner.nextInt();
                    scanner = new Scanner(System.in);
                    array = new int[size];

                    for (int i = 0; i < size; i++) {
                        Random random = new Random();
                        array[i] = random.nextInt(2000) - 1000;
                    }
                    System.out.println(Arrays.toString(array));
                    newArray = Arrays.copyOf(array, array.length);
                    System.out.println("-----------------------------------------------------");

                    System.out.println("Selection sort");
                    //System.out.println(Arrays.toString(array));
                    nanoTime = System.nanoTime();
                    newArray = SelectionSort.sort(newArray);
                    System.out.println("Time elapsed: " + (System.nanoTime() - nanoTime));
                    //System.out.println(Arrays.toString(newArray) + " \n -----------------------------------------------------");
                    System.out.println("-----------------------------------------------------");

                    System.out.println("Cocktail sort");
                    newArray = Arrays.copyOf(array, array.length);
                    //System.out.println(Arrays.toString(newArray));
                    nanoTime = System.nanoTime();
                    newArray = CocktailSort.sort(newArray);
                    System.out.println("Time elapsed: " + (System.nanoTime() - nanoTime));
                    System.out.println("-----------------------------------------------------");
                    //System.out.println(Arrays.toString(newArray) + " \n -----------------------------------------------------");

                    System.out.println("Quick sort");
                    newArray = Arrays.copyOf(array, array.length);
                    //System.out.println(Arrays.toString(newArray));
                    nanoTime = System.nanoTime();
                    newArray = QuickSort.sort(newArray);
                    System.out.println("Time elapsed: " + (System.nanoTime() - nanoTime));
                    System.out.println("-----------------------------------------------------");
                    //System.out.println(Arrays.toString(newArray) + " \n -----------------------------------------------------");

                    System.out.println("Counting sort");
                    newArray = Arrays.copyOf(array, array.length);
                    //System.out.println(Arrays.toString(newArray));
                    nanoTime = System.nanoTime();
                    newArray = CountingSort.sort(newArray);
                    System.out.println("Time elapsed: " + (System.nanoTime() - nanoTime));
                    //System.out.println(Arrays.toString(newArray) + " \n -----------------------------------------------------");
                    System.out.println("-----------------------------------------------------");

                    System.out.println("INTERNAL JAVA SORT");
                    newArray = Arrays.copyOf(array, array.length);
                    //System.out.println(Arrays.toString(newArray));
                    nanoTime = System.nanoTime();
                    Arrays.sort(newArray);
                    System.out.println("Time elapsed: " + (System.nanoTime() - nanoTime));
                    //System.out.println(Arrays.toString(newArray) + " \n -----------------------------------------------------");
                    System.out.println("-----------------------------------------------------");
                    break;

                }
                default: {
                    System.out.println("Unknown command");
                    break ;
                }
                    // TODO
            }
        }

    }

    // TODO menu: size, elements, file, to syo pyatoe desyatoe
}
