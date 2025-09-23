public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 25;
        numbers[1] = -3;
        numbers[2] = 5;
        numbers[3] = 10;
        numbers[4] = 38;
        numbers[5] = 62;
        numbers[6] = 20;
        numbers[7] = -8;
        numbers[8] = 173;
        numbers[9] = 65;

        System.out.println("Before Sort:");
        printArrayElements(numbers);

        System.out.println("\n\nAfter Sort:");
        selectionSort(numbers);

        printArrayElements(numbers);
    }

    private static void selectionSort(int[] arr) {
        // In-place algorithm
        // Unstable algorithm
        // O(n^2)
        // n^2 - 2n + 1 iterations (total)
        // n-1 iterations (outer for-loop)
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int smallest = 0;

            // n-1 iterations (inner for-loop)
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] < arr[smallest]) {
                    smallest = i;
                }
            }

            if (smallest  != lastUnsortedIndex) {
                int temp = arr[smallest];
                arr[smallest] = arr[lastUnsortedIndex];
                arr[lastUnsortedIndex] = temp;
            }
        }
    }

    private static void bubbleSort(int[] arr) {
        // In-place algorithm
        // Stable algorithm
        // 0(n^2)
        // n^2 - 2n + 1 iterations (total)
        // outer for-loop (n-1) iterations
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            // inner for-loop (n-1) iterations
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void printArrayElements(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
