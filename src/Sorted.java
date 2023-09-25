public class Sorted {
    public static void selectionSort(String[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareToIgnoreCase(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
