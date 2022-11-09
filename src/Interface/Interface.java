package Interface;

public class Interface {
    public static void main(String[] args) {

    }
}
/*
接口细节
1.接口不能被实例化
2.接口中所有方法都是public abstract,都可以省略不用写，但不能修改成其他修饰符
3.一个普通类实现接口需要将该接口所有方法实现
4.抽象类实现接口，可以不用实现接口方法
 */
interface IA{

    //6.接口中的属性修饰符都是public static final
    int n1 = 10;//这里等价于public static final int n1 = 10;
    void say();
    void hi();
}

//7.这里接口之间可以继承
//8.接口的修饰符与类一样，只能是public 或 默认
interface IB extends IA {
    void m();
}

//5.一个类可以实现多个接口
class AA implements IA,IB{
    public AA() {
        super();
    }
    @Override
    public void say() {
    }
    @Override
    public void hi() {
    }
    @Override
    public void m() {
    }
}