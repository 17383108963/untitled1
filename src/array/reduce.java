package array;
import java.util.Scanner;
public class reduce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1, 2, 3, 4, 5};
        for (; true; ) {
            System.out.println("是否继续缩减 y/n");
            char answer = scanner.next().charAt(0);
            if(answer == 'n'){
                break;
            }
        int arr2[] = new int[arr.length - 1];
            for (int i = 0; i < arr.length - 1; i++) {
                arr2[i] = arr[i];//将arr的值全部赋给arr2
            }
            arr = arr2;//将原来的arr数据删除
            for (int a = 0; a < arr.length; a++) {
                System.out.print(arr[a] + "\t");//输出arr的值
            }
            if(arr.length <= 1){
                System.out.println("不能再继续缩减");
                break;
            }
        }
        System.out.println("缩减完毕");
    }
}

