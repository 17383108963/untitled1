package array;

public class Twodimensional {
    public static void main(String[] args){
        int arr[][]= { {4,6} , {1,4,5,7} , {-2} };
        int sum1 = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                sum1 += arr[i][j];
            }
        }
        System.out.println("总和=" + sum1);
    }
}
