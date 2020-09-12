import java.util.Arrays;
import java.util.Scanner;

public class insertValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println();
        System.out.println("Nhập số cần thêm: ");
        int insValue = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm: ");
        int insIndex = scanner.nextInt();
        System.out.printf("%-30s%s", "Mảng trước khi thêm là: ", Arrays.toString(array));
        System.out.println();

        if(insIndex < 0 || insIndex > array.length-1) {
            System.out.println("Không thể thêm số vào vị trí này");
        } else{
            for (int j = array.length; j >insIndex+1; j--) {
                array[j-1] = array[j-2];
            }
            array[insIndex] = insValue ;
            System.out.printf("%-30s%s", "Mảng sau khi thêm là: ", Arrays.toString(array));
        }
    }
}
