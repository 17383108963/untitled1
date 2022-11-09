public class sum {
    public static void main(String[] args){
        int sum1 = 0;
        int sum2 = 0;
        int i = 1;
        for(;i <= 100;i++){
            sum1 += i;
            sum2 += sum1;
        }
        System.out.println(sum2);
    }
}
