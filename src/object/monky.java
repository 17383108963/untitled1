package object;

public class monky {
    public static void main(String[] args) {
        A a = new A();
        int day = 5;
        int peachNum = a.peach(day);
        if (peachNum != -1) {
            System.out.println("第" + day + "天的桃子个数为" + peachNum + "个");
        }
    }
}
class A{
    /*
    猴子吃桃：每天吃一半多一个，到第十天的时候(还没吃)，只剩一个了，
    问：最初有多少个桃子。
    规律：前一天的桃子 = （后一天的桃子+1）*2
     */
    public int peach(int day){
        if(day == 10){
            return 1;
        }else if(day >= 1 && day <= 9){
            return (peach(day+1)+1)*2;
        }else
            System.out.println("day输入1-10");
        return -1;
    }
}