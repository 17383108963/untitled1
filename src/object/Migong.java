package object;

public class Migong {
    public static void main(String[] args){
        //迷宫问题
        //先创建一个数组，8行7列，int [][]map = new map[8][7]
        //令元素1为障碍物，0为无障碍，画出地图
        int map [][] = new int[8][7];
        for(int i = 0;i < map.length;i++){
            //第一列和最后一列都设障碍
            map[i][0] = 1;
            map[i][6] = 1;
        }
        for(int i = 0;i < map[i].length;i++){
            //第一行和最后一行设障碍
            map[0][i] = 1;
            map[7][i] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][5] = 1;
        System.out.println("\n============迷宫地图");
        for(int i = 0;i < map.length;i++){
            for(int j =0;j < map[i].length;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n============迷宫路径");
        //使用M类中的findway
        M m = new M();
        m.findway(map,1,1);//输入迷宫的初始位置
        for(int i = 0;i < map.length;i++){
            for(int j =0;j < map[i].length;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class M{
        /*
        1.findway是用来找出迷宫的路径
        2.如果找到返回true，没有找到返回false
        3.map是二维数组表示迷宫，(i,j)是老鼠的位置，初始位置是（1，1）
        4.0表示无障碍，1表示有障碍，2表示路径，3表示走不通是死路
        5.当map[6][5]=2时表示找到路，否则继续找
        6.注意：返回ture代表能走，返回false代表不能走
         */
    public boolean findway(int map[][],int i,int j){
        if(map[6][5] == 2){
            return true;
        }else{
            if(map[i][j] == 0){
                map[i][j] = 2;
                //选择↑→↓←顺序
                if(findway(map,i-1,j)){
                    return true;
                } else if (findway(map,i,j+1)) {
                    return true;
                } else if (findway(map,i+1,j)) {
                    return true;
                } else if (findway(map,i,j-1)) {
                    return true;
                }else{
                    map[i][j] = 3;
                    return false;
                }
            }else{//只要map[i][j]不是0就不能走
                return false;
            }
        }
    }
}