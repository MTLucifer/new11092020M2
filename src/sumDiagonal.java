import java.util.Arrays;

public class sumDiagonal {
    public static void main(String[] args) {
        int[][] array = {{19,2,5},{31,15,8},{18,14,5}};
        int totalLeft = 0;
        int totalRight = 0;
        for (int i = 0; i < array.length; i++) {
                    totalLeft += array[i][i];
        }
        for (int i = 0; i < array.length; i++) {
                    totalRight += array[i][array.length-1-i];
        }
        System.out.println("Các phàn tử trog mảng gồm: "+ Arrays.deepToString(array));
        System.out.println("Tổng của đường chéo đầu bên trái là: "+totalLeft);
        System.out.println("Tổng của đường chéo đầu bên phải là: "+totalRight);
    }
}
