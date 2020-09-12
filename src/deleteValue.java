import java.util.Arrays;
import java.util.Scanner;

public class deleteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println();
        System.out.println("Nhập số cần xóa: ");
        int delValue = scanner.nextInt();
        System.out.printf("%-30s%s", "Mảng trước khi xóa là: ", Arrays.toString(array));
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            if (delValue == array[j]) {
                delValue = j;
            }
        }

        for (int k = delValue; k < array.length - 1; k++) {
            array[k] = array[k + 1];
        }
        array[array.length - 1] = 0;
        System.out.printf("%-30s%s", "Mảng sau khi xóa là: ", Arrays.toString(array));
    }
}

