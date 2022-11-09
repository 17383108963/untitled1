package array;
public class array1 {
    public static void main(String[] args){
        char word [] = new char[26];
        for(int i = 0;i <= word.length;i++){
            word[i] = (char)('A' + i);
            System.out.print(word[i]+" ");
        }
    }
}
