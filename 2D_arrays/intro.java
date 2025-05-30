public class intro {
    public static void rowIncreasing(int arr[][], int i, int n, int m){
        int start = i;
        while(start < n-i){
            System.out.print(arr[start][m-i]+"\t");
            start++;
        }
    }

    public static void colIncreasing(int arr[][], int i, int m){
        int start = i;
        while(start < m-i){
            System.out.print(arr[i][start]+"\t");
            start++;
        }
        
    }

    public static void rowDecreasing(int arr[][], int i, int n, int m){
        int start = m-i;
        while(start > i){
            System.out.print(arr[start][i]+"\t");
            start--;
        }
    }
    
    public static void colDecreasing(int arr[][], int i, int m, int n){
        int start = m-i;
        while(start >= 0){
            System.out.print(arr[n-i][start]+"\t");
            start--;
        }
    }
    public static void main(String args[]){
        int[][] arr = {{1, 2, 3, 4, 5}, 
                       {6, 7, 8, 9, 10},
                       {11, 12, 13, 14, 15},
                       {16, 17, 18, 19, 20}};
        int n = arr.length - 1, m = arr[0].length - 1;
        //            ^                ^
        //            |                |
        //          rows            colomns
        /*int max = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){ //find and store the maximum value
            int j = 0;
            while (j < m) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                else if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                j++;
            }
        }
        System.out.println("The largest int is: " + max);
        System.out.println("The smallest int is: " + min);    
        */
        int rowMid = n/2 + 1;
        System.out.println("\nn: " + n + "\tm: " + m + "rowmid:" + rowMid + "\n");
        for(int i = 0; i < rowMid; i++){
            colIncreasing(arr, i, m);
            rowIncreasing(arr, i, n, m);
            colDecreasing(arr, i, m, n);
            rowDecreasing(arr, i, n, m);
        }
    }
}
