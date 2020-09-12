import java.util.Scanner;

public class maxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập số lượng phần tử: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Nhập lại, không qúa 20 phần tử.");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-40s", "Giá trị trong mảng là: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }
        int max = array[0];
        int index = 0;
        for (int k = 0; k < array.length; k++) {
            if (max < array[k]) {
                max = array[k];
                index = k ;
            }
        }
        System.out.println();
        System.out.printf("%-40s%d", "Phần tử lớn nhất trong mảng là: ",max);
        System.out.println();
        System.out.printf("%-40s%d", "Nó ở vị trí: ",index);
    }
}
