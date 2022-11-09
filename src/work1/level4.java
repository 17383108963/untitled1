package work1;
import java.util.Scanner;
public class level4 {
    public static void main(String[] args){
    Prop p1 = new Prop();//创建道具对象
    p1.output();//输出道具列表
    Store store = new Store();//创建商店对象
    store.name = "畅想未来";//商店名字
    System.out.println(store.welcome("进店") + "<" + store.name + ">");//输出欢迎仪式
    store.buy();//进行购物
    System.out.println(store.welcome("出店"));//输出离店的问候
    }
}
class Prop {
    String name[] = {"《3G是怎样练成的》", "《java开发实战经典》", "《美丽新重邮》    ",
            "《仿生RedRocker》", "《南山伯爵》         "};
    int Num[] = {1, 2, 3, 4, 5};
    int price[] = {33, 88, 40, 20, 30};
    int xiude[] = {1, 1, 4, 1, 0};
    int boxue[] = {5, 2, 3, 1, 0};
    int qiushi[] = {5, 5, 1, 0, 0};
    int chuangxin[] = {5, 1, 1, 0, 0};
    public void output() {
        System.out.println("序号" + "\t  " + "名字" + "\t\t\t\t" + "价格" +
                "\t"+ "修德" + "\t" + "博学" + "\t" + "求实" + "\t" + "创新");
        for (int i = 0; i < 5; i++) {
            System.out.println(Num[i] + "\t" + name[i] + "\t" + price[i] + "\t" + xiude[i] + "\t" +
                    boxue[i] + "\t" + qiushi[i] + "\t" + chuangxin[i]);
        }
    }
}
class Store{
    String name;
    public void buy() {
        Scanner scanner = new Scanner(System.in);
        Prop p1 = new Prop();
        String arr[] = new String[1];
        int total = 0;//总价
        int xiude = 0;//修德
        int boxue = 0;//博学
        int qiushi = 0;//求实
        int chuangxin = 0;//创新
        do {
            System.out.println("请输入要购买的序号");
            int Num = scanner.nextInt();
            arr[arr.length-1] = p1.name[Num - 1];
            total += p1.price[Num-1];
            xiude += p1.xiude[Num-1];
            boxue += p1.boxue[Num-1];
            qiushi += p1.qiushi[Num-1];
            chuangxin += p1.chuangxin[Num-1];
            System.out.print("你一共购买了：");
            //遍历已经购买的书籍
            for(int j = 0;j < arr.length;j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
            System.out.println("是否继续购买,y/n");
            char ch = scanner.next().charAt(0);
            if(ch == 'n'){
                break;
            }
            String arrnew[] = new String[arr.length+1];
            for(int i = 0;i < arr.length;i++){
                arrnew[i] = arr[i];
            }
            arr = arrnew;
        }while(true);

        System.out.println("总计=" + total);
        System.out.println("小邮子的属性提高了；修德 " + xiude + " 博学 " + boxue
         + " 求实 " + qiushi + " 创新 " + chuangxin);
    }
    public String welcome(String order){
        if(order == "进店"){
            return "欢迎光临";
        } else if (order == "出店") {
            return "谢谢惠顾";
        }
        return "";
    }
}
class uu{
    String name;
    int xiude;
    int boxue;
    int qiushi;
    int chuangxin;
}