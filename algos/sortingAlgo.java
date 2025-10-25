public class sortingAlgo {

    public static void printArr(int arr[]){
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(arr[i] + "\t" );
        }
        System.out.println("\n" + "___________________________________________________");
    }

    public static void select(int arr[]){
        printArr(arr);
        for(int i = 0; i <= arr.length - 2; i++){
            int minValue = i;
            
            for(int j = i + 1; j <= arr.length - 1; j++){
                
                if (arr[j] < arr[minValue]){
                    minValue = j;
                }

            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minValue];
            arr[minValue] = temp;
            printArr(arr); 
        }
        printArr(arr);
    }

    public static void insert(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    while (k >= 0) {
                        
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {8, 9, 1, 6, 2, 5, 10, 16, 25};
        select(arr);
    }
}
