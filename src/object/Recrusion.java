package object;

public class Recrusion {
    public static void main(String[] args){
        T t1 = new T();
        int a = t1.fibonacci(7);
        System.out.println(a);
    }
}
class T {
    //用递归的方式写出斐波那契数1，1，2，3，5，8，13.....
    //给一个整数n，求出他是多少斐波那契数
    //1.n = 1,斐波那契数1
    //2.n = 2,斐波那契数1
    //3.n >= 3,斐波那契数等于前两个数的和
    public int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1 ;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}