import java.util.Scanner;

public class minInArray {
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
        int min = array[0];

        System.out.println();
        System.out.printf("%-40s%d", "Phần tử lớn nhất trong mảng là: ", findMin(min,array));
    }

    public static int findMin(int min, int arr[]) {
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}
