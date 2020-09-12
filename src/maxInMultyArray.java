import java.util.Arrays;

public class maxInMultyArray {
    public static void main(String[] args) {
        int[][] array = {{19,2,5},{31,15,8},{18,14,5}};
        int max = array[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(max<array[i][j]){
                    max = array[i][j];
                    indexCol = j;
                    indexRow =i;
                }
            }
        }
        System.out.println("Mảng đa chiều có phần tử là: " + Arrays.deepToString(array));
        System.out.println("Phần tử lớn nhất mảng là: " + max+" ở vị trí "+indexRow+ ","+indexCol);
    }
}
