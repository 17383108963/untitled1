package object.poly_.parameter;

public class Test {
    public static void main(String[] args) {
        works xm = new works("小明", 5000);
        Manage dm = new Manage("大明", 20000, 50000);
        Test test = new Test();
        test.showEmpAnnual(xm);
        test.showEmpAnnual(dm);
        System.out.println(xm.equals(dm));
    }
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
        if(e instanceof Manage){
            ((Manage) e).manage();
        } else if (e instanceof works) {
            ((works) e).work();
        }
    }
}
