import java.util.Arrays;
import java.util.Scanner;

public class sumColum {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[][] array = {{19,2,5},{31,15,8},{18,14,5}};
        int total = 0;
        System.out.println("Nhập cột cần tính: ");
        int col = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == col){
                    total += array[i][j];
                }
            }
        }
        System.out.println("Các phàn tử trog mảng gồm: "+ Arrays.deepToString(array));
        System.out.println("Tổng của cột là: "+total);
    }
}
