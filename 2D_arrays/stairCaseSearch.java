import java.util.Scanner;

public class stairCaseSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = sampleArray.array;
        System.out.println("Enter the key: ");
        int key = scanner.nextInt();
        int row = 0, col = arr[0].length - 1;
        while(row < arr.length && col >= 0) {
            if(arr[row][col] == key){
                System.out.println("The number is in: arr[" + row + "]" + "[" + col + "]");
                return;
            }
            else if(key < arr[row][col]){
                col--;
            }
            else if(key > arr[row][col]){
                row++;
            }
        }
        
        scanner.close();
    }
}
