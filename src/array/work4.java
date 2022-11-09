package array;

public class work4 {
    public static void main(String[] args){
        int arr [] = new int[10];
        double sum = 0;
        for(int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * 100 + 1);
            sum += arr[i];
        }
        for(int i = arr.length-1;i >= 0;i--){
            System.out.print(arr[i] + "\t");
        }
        System.out.println("平均值=" + sum/arr.length);
        int max = arr[0];
        int Index = 0;
        for(int i = 1;i < arr.length;i++) {
            if (max < arr[i]) {
                max = arr[i];
                Index = i;
            }
        }
        System.out.println("最大值=" + max + "地标=" + Index);
        int find = 8;
        int a = -1;
        for(int i = 0;i < arr.length;i++) {
            if (find == arr[i]) {
                System.out.println("已找到8，地标为" + i);
                a = 0;
                break;
            }
        }
        if(a == -1){
            System.out.println("未找到该数");
        }
    }
}
