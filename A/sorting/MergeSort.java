package sorting;

class MergeSort {
    public static void main(String[] args) {

        MergeSort ms = new MergeSort();
        int[] arr = {5, 4, 3, 2, 1, 6, 7};
        ms.merge(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i);
        }

    }

    void merge(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            merge(array, low, mid);
            merge(array, mid + 1, high);
            sort(array, mid, low, high);
        }
    }

    void sort(int[] array, int m, int l, int high) {
        int len1 = m - l + 1;
        int len2 = high - m;

        int[] n1 = new int[len1];
        int[] n2 = new int[len2];

        for (int i = 0; i < len1; i++) {
            n1[i] = array[i + l];
        }

        for (int i = 0; i < len2; i++) {
            n2[i] = array[m + i +1];
        }

        int i = 0, j = 0, k = l;
        while (i < len1 && j < len2) {
            if (n1[i] < n2[j]) {
                array[k] = n1[i];
                i++;
                k++;
            } else {
                array[k] = n2[j];
                j++;
                k++;
            }
        }

        while(i < len1) {
            array[k] = n1[i];
                i++;
                k++;
        }
        while(j < len2) {
            array[k] = n2[j];
                j++;
                k++;
        }
    }
}