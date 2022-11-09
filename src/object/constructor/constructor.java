package object.constructor;

public class constructor {
    public static void main(String[] agrs) {
        Person p1 = new Person();
        System.out.println("p1的信息；姓名=" + p1.name + " 年龄=" + p1.age);
        //hashCode是把对象的地址转化为一串整数，可以简单的堪为地址
        System.out.println("p1的hashCode=" + p1.hashCode());
        Person p2 = new Person("小明", 18);
        System.out.println("p2的信息；姓名=" + p2.name + " 年龄=" + p2.age);
    }
}

class Person {
    int age;
    String name;

    //创建构造器细节：
    //1.构造器名要与类名相同
    //2.构造器没有返回值，也不能加void
    //3.构造是对对象的初始化，不是创造对象
    //4.如果没有定义构造器会存在一个默认构造器，比如Person() {}
    //5.一旦定义了构造器，原来的默认构造器将不复存在，除非再显示的定义一下
    public Person() {
        age = 18;
    }

    public Person(String name, int age) {
        //this关键字,this 就代表这个类
        this.age = age;
        this.name = name;
    }
}