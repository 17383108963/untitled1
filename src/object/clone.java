package object;

public class clone {
    public static void main(String[] args){
        Person p = new Person();
        p.name = "小红";
        p.age = 18;
        Mytools tools = new Mytools();
        Person p2 = tools.copyPerson(p);
        //p和p2都是Person对象，但是是两个独立的对象，属性相同
        System.out.print(p2.name + "\t" + p2.age);
    }
}
class Person {
    String name;
    int age;
}
class Mytools {
    //    编写方法的思路
    //    1.方法的返回类型 Person
    //    2.方法的名字 copyPerson
    //    3.方法的形参 (Person p)
    //    4.方法体，创建一个新对象，并复制属性,返回即可
    public Person copyPerson(Person p) {
        //创建一个新对象
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}