import java.util.*;

public class ArrayBackTracking {

    public static int[] changeArray(int arr[], int index, int value) {
        if (index == (arr.length-1)) {
            return arr;
        }
        return arr;
    }

    public static void printMatrix (int[] arr) {
        System.out.println("The array...");
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n"+"_____________________________"+"\n");
    }

    public static void arrayDecrement (int[] arr, int index) {
        if (index == 0) {
            arr[index] -= 2;
            System.out.println("The array after backward traversal is...\n" + "_____________________________");
            printMatrix(arr);
            return;
        }
        arr[index] -= 1;
    }

    public static int[] arrIncrement (int[] arr, int index) {
        if(index == (arr.length-1)) {
            arr[index] = (index + 1);
            System.out.println("The array after forward traversal is...\n" + "_____________________________");
            printMatrix(arr);
            return arr;
        }
        arr[index] = (index+1);
        return arr;
    }

    public static void arrayBacktrack(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            arr = arrIncrement(arr, i);
        }
        for (int i = (arr.length-1); i >= 0; i--) {
            arrayDecrement(arr, i);;
        }
    }
    public static void main (String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arr...");
        int arrLength = sc.nextInt();*/
        int[] arr = new int[5];
        arrayBacktrack(arr);
    }
}
