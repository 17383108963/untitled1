import java.util.Scanner;

public class Level1_Plus {
    public static void main(String[] args) {
        while (true) {//死循环除了while(ture)还有for(;;)哦~
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            System.out.println("请输入7天每天的睡眠时间：");
            for (int i = 0; i < 7; i++) sum += scanner.nextInt();
            double average = sum / 7.0;
            if (average > 10) {
                System.out.println("你怎么睡的着的");
            } else {
                System.out.println("熬夜有害身体，差不多得了");
            }
            System.out.println("是否还要再玩一轮？yes/no：");
            String isTry = scanner.next();
            if (isTry.equals("no")) break;
            else if (isTry.equals("yes")){
                System.out.println("再来一次……");
            } else System.out.println("输入错误，程序结束。");
        }
    }
}
