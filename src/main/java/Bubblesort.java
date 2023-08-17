import java.util.Arrays;

public class Bubblesort {
    static void bubbleSort(int[] arr) {
        System.out.println("sorting....");
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

    }
    public static void main(String[] args) {
        int arr[] ={8, 1, 3, 2, 5, 4, 7, 6};

        System.out.println("Array before Bubble Sort");
        System.out.println(Arrays.toString(arr));
        System.out.println();

        bubbleSort(arr);
        System.out.println();
        System.out.println("Array after Bubble Sort");
        System.out.println(Arrays.toString(arr));

    }
}