public class MergeSort {

    public int[] mergeArray(int[] arr1, int[] arr2) {
        int size1 = arr1.length, size2 = arr2.length;
        int[] merged = new int[size1 + size2];
        int i = 0, j = 0, k = 0;

        while (i < size1 && j < size2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Add remaining elements
        while (i < size1)
            merged[k++] = arr1[i++];
        while (j < size2)
            merged[k++] = arr2[j++];

        return merged;
    }

    public int[] divideArray(int[] arr, int startingIndex, int endingIndex) {
        int size = Math.abs(endingIndex-startingIndex)+1;
        int[] newArr = new int[size];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[startingIndex + i];
        }
        return newArr;
    }
    
    public int[] mergeSort(int[] arr, int start, int end) {
        if (start == end) {
            return new int[] { arr[start] };
        }

        int mid = (start + end) / 2;
        int[] leftArr = mergeSort(arr, start, mid);
        int[] rightArr = mergeSort(arr, mid + 1, end);
        int[] sortedArray = mergeArray(leftArr, rightArr);
        return sortedArray;
    }
    
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = { 8, 3, 1, 7, 0, 10, 2 };
        int[] sorted = ms.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("_________________________");
    }
}
