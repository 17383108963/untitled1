public class jjcfb {
    public static void main(String[] args){
        for(int a = 1;a <=9 ;a++){
            for(int b = 1;b <= a && b <= 9;b++){
                System.out.print(b + "*" + a + "=" + a*b + "\t");
            }
            System.out.println();
        }
    }
}
