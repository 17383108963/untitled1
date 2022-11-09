package object;

public class VarParameter {
    public static void main(String[] args){
    HspMethod m = new HspMethod();
    System.out.println(m.showCore("liming",25,65,753,1.8));
    }
}
class HspMethod{
    public String showCore(String name,double... core){
        int totalcore = 0;
        for(int i = 0;i < core.length;i++){
            totalcore += core[i];
        }
        return name + " 有 " + core.length + "门课程的总得分=" + totalcore;
    }
}