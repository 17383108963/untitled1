package object.poly_;
/*
   对象的多态：
   1.一个对象的编译类型和运行类型可以不一致
   2.编译类型在定义对象时就决定了，不能改变
   3.运行类型是可以变化的
   4.编译类型看定义时 = 的左边，运行类型看 = 的右边
 */
public class poly_object {
    public static void main(String[] args) {
        Animal animal = new Cat();//编译类型是Animal，运行类型是Cat
        //1.[向上转型]：编译类型是父类，运行类型是子类
        //2.也可以写成Object obj = new Cat();
        animal.cry();
        animal = new Dog();//运行类型改变，从Cat ==> Dog
        animal.cry();
        //3.编译类型是父类时，可以调用父类的所有成员（仍需遵循访问权限，例如private修饰的不能访问）
        animal.eat();
        //4.但是不能调用子类的特有成员（方法）
        //  例如 : animal.play(); 错误

        //接下来如果想要调用子类的特有成员（方法）就需要引出向下转型
        //1.[向下转型]:编译类型是子类，运行类型也是子类，类似于强转
        Dog dog = (Dog) animal;
        //这里直接把animal强转为Dog类，即可使用Dog类的特有成员
        dog.play();
        //细节：属性没有重写之说，属性的值看编译类型
        System.out.println(dog.a);//编译类型是Dog
        System.out.println(animal.a);//编译类型是Animal

        //说明一个instanceOf : 用于判断对象的运行类型是否是XX类型或它的子类型
        System.out.println(animal instanceof Dog);
        System.out.println(animal instanceof Cat);
        System.out.println(animal instanceof Animal);
        //不能用来判断同等级的不同类
        // System.out.println(dog instanceof Cat);
        System.out.println(dog instanceof Dog);
    }
}
