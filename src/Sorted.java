public class Sorted {
    public static void selectionSort(String[] arr1) {
        int n = arr1.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr1[j].compareToIgnoreCase(arr1[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = arr1[minIndex];
            arr1[minIndex] = arr1[i];
            arr1[i] = temp;
        }
    }
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
    public static void sort(String[] array) {
        selectionSort(array);
        insertionSort(array);
    }
}
