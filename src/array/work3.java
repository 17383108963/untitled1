package array;
import java.util.Scanner;
public class work3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arr[] = {10 ,12 ,45 ,90};
        int arr2[] = new int[arr.length+1];
        for(int i = 0;i < arr.length;i++){
            arr2[i] = arr[i];
            int b = scanner.nextInt();
            arr2[arr.length] = b;
            arr = arr2;
            int temp = 0;
            for(int j = 0;j < arr.length-1;j++){
                if(arr[arr.length-1] >= arr[j] && arr[arr.length-1] <=arr[j+1] ){
                    temp = arr[arr.length-1];

                }
            }
        }
    }
}
