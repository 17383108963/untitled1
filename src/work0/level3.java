package work0;
import java.util.Scanner;
public class level3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = 100;
        String student[][] = new String[m][2];
        do {
            System.out.println("请选择(增/删/查/改)");
            String answer = scanner.next();
            switch (answer) {
                case "增":
                    System.out.println("请输入学号");
                    String ID1 = scanner.next();
                    System.out.println("请输入名字");
                    String name1 = scanner.next();
                    for (int i = 0; i < student.length; i++) {
                        if (student[i][0] == null && student[i][1] == null) {
                            student[i][0] = ID1;
                            student[i][1] = name1;
                            break;
                        }
                    }
                    System.out.println("增加成功");
                    for(int i = 0;i < m;i++){
                        for(int j = 0;j < 2;j++){
                            System.out.print(student[i][j]+" ");
                        }
                    }
                    break;
                case "删":
                    System.out.println("请输入学号");
                    String ID2 = scanner.next();
                    System.out.println("请输入名字");
                    String name2 = scanner.next();
                    for (int i = 0; i < student.length; i++) {
                        if (ID2.equals(student[i][0]) && name2.equals(student[i][1])) {
                            student[i][0] = null;
                            student[i][1] = null;
                            System.out.println("删除成功");
                            break;
                        }
                        //循环结束仍不匹配
                        System.out.println("不存在该账户，无法删除");
                        break;
                    }
                    break;
                case "查":
                    System.out.println("请输入学号");
                    String ID3 = scanner.next();
                    System.out.println("请输入名字");
                    String name3 = scanner.next();
                    for (int i = 0; i < student.length; i++) {
                        if (ID3.equals(student[i][0]) && name3.equals(student[i][1])) {
                            System.out.println("已找到该账户，他为第" + (i+1) + "个元素");
                            break;
                        }
                        //循环结束仍不匹配
                        System.out.println("未查找到该账户");
                        break;
                    }
                    break;
                case "改":
                    System.out.println("请输入学号");
                    String ID4 = scanner.next();
                    System.out.println("请输入名字");
                    String name4 = scanner.next();
                    for (int i = 0; i < student.length; i++) {
                        if (ID4.equals(student[i][0]) && name4.equals(student[i][1])) {
                            System.out.println("已找到该账户,请重新输入学号");
                            String ID = scanner.next();
                            student[i][0] = ID;
                            System.out.println("修改成功");
                            break;
                        }
                        System.out.println("不存在该账户，无法更改");
                        break;
                    }
                    break;
                default:
                    System.out.println("你的输入不正确，没有匹配的");
                    break;
            }
            System.out.println("是否继续 yes/no");
            String answer1 = scanner.next();
            if (answer1.equals("no")) {
                break;
            }
        }while(true);
    }
}
