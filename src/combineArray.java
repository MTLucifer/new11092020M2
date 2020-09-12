import java.util.Arrays;
import java.util.Scanner;

public class combineArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Nhập phần tử mảng I thứ " + i  + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
        int[] array2 = new int[4];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Nhập phần tử mảng II thứ " + j + ": ");
            array2[j] = scanner.nextInt();
            j++;
        }
        int[] combineArr = new int[(array1.length+array2.length)];
        for (int k = 0; k < array1.length; k++) {
            combineArr[k] = array1[k];
        }
        for (int l = array1.length; l < array1.length+array2.length; l++) {
            combineArr[l] = array2[l-array1.length];
        }
        System.out.println();
        System.out.printf("%-30s%s", "Mảng I là: ", Arrays.toString(array1));
        System.out.println();
        System.out.printf("%-30s%s", "Mảng II là: ", Arrays.toString(array2));
        System.out.println();
        System.out.printf("%-30s%s", "Mảng gộp là: ", Arrays.toString(combineArr));
    }
}

