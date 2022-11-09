public class break3 {
    public static void main(String[] args){
        double money = 100000;
        int i = 0;
        while(money > 50000){
            money -= money/20;
            i++;
            if(money <= 50000){
                break;
            }
        }
        while(money <= 50000){
            money -= 1000;
            i++;
            if(money < 1000){
                break;
            }
        }
        System.out.println("剩余：" + money);
        System.out.println("可以经过" + i + "次路口");
    }
}
