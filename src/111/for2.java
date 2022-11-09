public class for2 {
    public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    int a = 5, b = 150, c = 7;
        for(int i = a;  i <= b;i++){
            if(i % c == 0) {
                System.out.println(i);
                count++;
                sum+=i;
            }
        }System.out.println(count);
        System.out.println(sum);
    }
}
