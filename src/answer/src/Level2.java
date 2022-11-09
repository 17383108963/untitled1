import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n:");
        int n = scanner.nextInt();
        System.out.println("请输入k:");
        int k = scanner.nextInt();
        double headNum = 1;//Cnk的上面部分
        double bottomNum = 1;//Cnk的下面部分
        for (int i = 1; i <= k; i++) {
            headNum *= n - i + 1;
            bottomNum *= i;
        }
        double PR = bottomNum / headNum;//概率是Cnk分之一，所以是底部除头部
        System.out.println("中奖概率为：" + PR);
    }
}
