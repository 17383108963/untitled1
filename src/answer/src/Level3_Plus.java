import java.util.Arrays;
import java.util.Scanner;

public class Level3_Plus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生个数：");
        int m = scanner.nextInt();
        String[][] s = new String[m][2];
        while (true) {
            System.out.println("请输入你要进行的操作：增/删/查/改/查询所有/退出");
            String doWhat = scanner.next();
            if (doWhat.equals("退出")) break;
            else doSomeThing(s, doWhat);
        }
    }

    //增
    public static void addStudent(String[][] s, String name, String id) {
        for (int i = 0; i < s.length; i++) {
            if (s[i][0] == null && s[i][1] == null) {//判空
                s[i][1] = name;
                s[i][0] = id;
                System.out.println("增加成功！");//查到，该方法就直接结束，后面方法的return同理
                return;
            }
        }
        System.out.println("增加失败！");//for循环结束说明没增加成功，后面的方法同理。
    }

    //删
    public static void deleteStudent(String[][] s, String id) {
        for (int i = 0; i < s.length; i++) {
            if (s[i][0] != null && s[i][1] != null) {
                if (s[i][0].equals(id)) {
                    s[i][1] = null;
                    s[i][0] = null;
                    System.out.println("删除成功！");
                    return;
                }
            }
        }
        System.out.println("删除失败！");
    }

    //改
    public static void changeStudent(String[][] s, String oldId, String newName, String newId) {
        for (int i = 0; i < s.length; i++) {
            if (s[i][0] != null && s[i][1] != null) {
                if (s[i][0].equals(oldId)) {
                    s[i][1] = newName;
                    s[i][0] = newId;
                    System.out.println("修改成功！");
                    return;
                }
            }
        }
        System.out.println("修改失败！");
    }

    //查
    public static void queryStudent(String[][] s, String id) {
        for (int i = 0; i < s.length; i++) {
            if (s[i][0] != null && s[i][1] != null) {
                if (s[i][0].equals(id)) {
                    System.out.println(Arrays.toString(s[i]));
                    System.out.println("查询成功！");
                    return;
                }
            }
        }
        System.out.println("查询失败！");
    }

    //操作选择
    public static void doSomeThing(String[][] s, String doWhat) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String id;
        switch (doWhat) {
            case "增":
                System.out.println("请输入你要增加的学生的姓名：");
                name = scanner.next();
                System.out.println("请输入你要增加的学生的学号：");
                id = scanner.next();
                addStudent(s, name, id);
                break;
            case "删":
                System.out.println("请输入你要删除的学生的学号：");
                id = scanner.next();
                deleteStudent(s, id);
                break;
            case "查":
                System.out.println("请输入你要查询的学生的学号：");
                id = scanner.next();
                queryStudent(s, id);
                break;
            case "改":
                System.out.println("请输入你要修改的学生的学号：");
                id = scanner.next();
                System.out.println("请输入修改的姓名：");
                String newName = scanner.next();
                System.out.println("请输入修改的学号：");
                String newId = scanner.next();
                changeStudent(s, id, newName, newId);
                break;
            case "查询所有":
                queryAllPositive(s);
                break;
            default:
                break;
        }
    }

    public static void queryAllPositive(String[][] s) {
        //冒泡排序
        for (int i = 0; i < s.length - 1; i++) {//外层for循环，数组往后移，这里s.length - 1是防止内层的j = i + 1越界
            if (s[i][0] != null && s[i][1] != null) {//判空
                for (int j = i + 1; j < s.length; j++) {//内层for循环将i位置上的数依次与数组后面的数比较，比它小就交换位置。
                    if (s[j][0] != null && s[j][1] != null) {//判空
                        int id = Integer.parseInt(s[i][0]);
                        int nextId = Integer.parseInt(s[j][0]);
                        if (nextId < id) {
                            s[i][0] = String.valueOf(nextId);
                            s[j][0] = String.valueOf(id);
                        }
                    }else break;
                }
            } else break;
        }
        System.out.println("查询所有成功（按学号大小排序）：");
        for (int i = 0; i < s.length; i++) {
            if (s[i][0] != null && s[i][1] != null) {
                System.out.println(Arrays.toString(s[i]));
            }
        }
    }
}
