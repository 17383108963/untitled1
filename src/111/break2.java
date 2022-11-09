import java.util.Scanner;
public class break2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String user = "";
        String password = "";
        for(int i = 2;i <= 2 && i >= 0;i--){
            System.out.println("请输入用户名");
            user = scanner.next();
            System.out.println("请输入密码");
            password = scanner.next();
            if("丁真".equals(user) && "666".equals(password)){
                System.out.println("登陆成功");
                break;
            }
            else{
                System.out.println("账户或密码错误");
                System.out.println("你还有" + i + "次机会");
            }
        }

    }
}
