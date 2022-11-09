import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 7; i++) sum += scanner.nextInt();
        double average = sum / 7.0;
        if (average > 10.0) {
            System.out.println("你怎么睡的着的");
        } else {
            System.out.println("熬夜有害身体，差不多得了");
        }
    }
}
