package array;
import java.util.Scanner;
public class Search {
    public static void main(String[] args){
        String names [] = {"金毛狮王" , "白眉狮王" , "紫衫龙王" , "青翼蝠王"};
        Scanner scanner = new Scanner(System.in);
        int m = -1;
        System.out.println("请输入名称");
        String name = scanner.next();
        for(int i = 0; i < names.length;i++){
            if(name.equals(names[i])){
                System.out.println("已找到结果");
                m = i;
                break;
            }
        }
        if(m == -1){
            System.out.println("未找到结果");
        }
    }
}
