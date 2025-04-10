public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 1, 3, 7, 0};
        sortAscending(numbers);

        System.out.print("Sorted array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void sortAscending(int[] array) {
        int n = array.length;
        boolean swapped;

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if no swaps were made in this pass
            if (!swapped) {
                break;
            }
        }
    }
}
