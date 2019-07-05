import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] mainArray;
        mainArray = getIntegers(5);
        printArray(mainArray);
        mainArray = sortIntegers(mainArray);
        printArray(mainArray);

        scanner.close();
    }

    public static int[] getIntegers(int capascity) {
        int[] localArray = new int[capascity];

        for (int i = 0; i < capascity; i++) {
            boolean isTrue = false;

            while (!isTrue) {
                System.out.println("Enter " + i + " integer");
                isTrue = scanner.hasNextInt();
                if (isTrue) {
                    localArray[i] = scanner.nextInt();
                }
                scanner.nextLine();
            }
        }

        return localArray;
    }

    public static void printArray(int[] array) {
        int len = array.length;

        for (int i = 0; i < len; i++) {
            System.out.println("number #" + i + " is " + array[i]);
        }
        System.out.println();
    }

    public static int[] sortIntegers(int[] array) {
        int[] localArray = array;
        int len = localArray.length;
        int buffer;

        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (localArray[i] < localArray[j]) {
                    buffer = localArray[i];
                    localArray[i] = localArray[j];
                    localArray[j] = buffer;
                }
            }
        }

        return localArray;
    }
}
