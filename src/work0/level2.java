package work0;
import java.util.Scanner;
public class level2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long s1 = 1, s2 = 1;//s1为分母，s2为分子
        System.out.println("请输入总数n");
        int n = scanner.nextInt();
        System.out.println("请输入抽取个数k");
        int k = scanner.nextInt();
        for(int i = 0;i < k;i++){
            s1 *= n - i;
            s2 *= (i+1);
        }
        System.out.println("s1=" + s1);
        System.out.println("s2=" + s2);
        double p = (double)s2/s1;//p为中奖概率
        System.out.println("中奖概率=" + p);
    }
}
