public class diagonal {
    public static void main(String[] args) {
        int[][] arr = sampleArray.array;  // Use the array from sampleArray.java
        int n = arr.length, m = arr[0].length;

        int pSum = 0;
        for (int i = 0; i < n; i++) {
            pSum += arr[i][i];  // Primary diagonal: top-left to bottom-right
        }
        System.out.println(pSum);

        int sSum = 0;
        for (int i = m - 1; i >= 0; i--) {
            sSum += arr[(m - 1) - i][i];  // Secondary diagonal: top-right to bottom-left
        }
        System.out.println(sSum);
    }
}

