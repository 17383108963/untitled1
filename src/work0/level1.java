package work0;
import java.util.Scanner;
public class level1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int sum = 0;
            for (int day = 1; day <= 7; ) {
                System.out.println("请输入第" + day + "天的睡觉时间[7,12]");
                int time = scanner.nextInt();
                if(time > 12 || time < 7){
                    System.out.println("输入错误，请重新输入");
                    continue;
                }
                sum += time;
                day++;
            }
            double avetime = (double) (sum / 7);
            if (avetime <= 10) {
                System.out.println("平均每天睡眠=" + avetime + "个小时");
                System.out.println("你是怎么睡得着的");
            } else {
                System.out.println("熬夜有害身体，差不多得了");
            }
            System.out.println("是否要继续 y/n");
            char answer = scanner.next().charAt(0);
            if (answer == 'n'){
                break;
            }
        }while(true);
    }
}
