package object.poly_.parameter;

public class works extends Employee{
    public works(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("员工 " + getName() + "正在工作....");
    }
}
