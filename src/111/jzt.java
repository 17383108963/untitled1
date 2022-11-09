public class jzt {
    public static void main(String[] args){
        int d = 10;
        for(int a = 1;a <= d;a++){
            for(int c = 1;c <= d-a;c++) {
                System.out.print(" ");
            }
            for(int b = 1;b <= 2*a - 1;b++) {
                if(b == 1 || b == 2*a-1 || a == d) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
