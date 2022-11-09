import java.util.Scanner;
public class Idea1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("岛国芝麻信用分");
        int score = input.nextInt();
        if (score == 100) {
            System.out.println("信用极好");
        } else if (score > 80 && score <= 99) {
            System.out.println("信用优秀");
        } else if (score >= 60 && score <= 80) {
            System.out.println("信用一般");
        } else {
            System.out.println("信用不及格");
        }
    }
}





