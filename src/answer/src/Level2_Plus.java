import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Level2_Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入n:");
        int n = scanner.nextInt();
        System.out.println("请输入k:");
        int k = scanner.nextInt();
        BigDecimal headNum = BigDecimal.valueOf(1);//Cnk的上面部分
        BigDecimal bottomNum = BigDecimal.valueOf(1);//Cnk的下面部分
        for (int i = 1; i <= k; i++) {
            headNum = headNum.multiply(BigDecimal.valueOf(n - i + 1));
            bottomNum = bottomNum.multiply(BigDecimal.valueOf(i));
        }
        BigDecimal PR = bottomNum.divide(headNum, 50, RoundingMode.UP);//概率是Cnk分之一，所以是底部除头部
        System.out.println("中奖概率为：" + PR.doubleValue());
    }
}
