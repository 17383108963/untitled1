import java.util.Scanner;
public class work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 3:
                case 5:
                case 4:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬季");
            }
        } else System.out.println("输入错误");
    }
}
