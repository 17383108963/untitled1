package object;

public class hanuota {
    public static void main(String[] args){
        Tower tower = new Tower();
        tower.move(5,'A','B','C');
    }
}
class Tower{
    //方法：num表示汉诺塔中圆盘的个数，a,b,c分别表示A,B,C塔
    public void move(int num,char a,char b,char c){
        if(num == 1){
            System.out.println(a + "->" + c);
        }else{
            move(num - 1, a, c, b);//将A塔上面的所有圆盘移到B
            System.out.println(a + "->" + c);//再将A塔最后一个圆盘移到C
            move(num - 1, b, a, c);//最后将B塔上的移到C
        }
    }
}