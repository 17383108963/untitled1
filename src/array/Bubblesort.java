package array;

public class Bubblesort {
    public static void main(String[] args) {
        int arr[] = {123, 52, 6, 45, 75 ,125 ,4 ,87 ,65};
        int temp = 0;
        for (int j = arr.length; j > 1;j-- ) {
            for (int i = 0; i < j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
