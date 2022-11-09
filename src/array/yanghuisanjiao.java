package array;

public class yanghuisanjiao {
    public static void main(String[] args){
        int yanghui[][] = new int [10][];
        for(int i = 0;i < yanghui.length;i++){//遍历所有一维数组
            yanghui[i] = new int[i+1];//给每个一维数组空间
            //给每个一维数组赋值
            for(int j = 0;j < yanghui[i].length;j++){
                if(j == 0 || j == yanghui[i].length - 1){
                    yanghui[i][j] = 1;
                }else{
                    yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
                }
            }
        }
        //输出杨辉三角
        for(int i = 0;i < yanghui.length;i++){
            for(int j = 0;j < yanghui[i].length;j++){
                System.out.print(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
