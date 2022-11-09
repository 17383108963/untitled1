package array;

public class max {
    public static void main(String[] args){
        int arr [] = {5 ,8 ,7 ,55 ,42};
        int max = arr[0];
        int maxIndex = 0;
        for(int i = 1;i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值=" + max);
    }
}
