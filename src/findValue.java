import java.util.Scanner;

public class findValue {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập từ cần tìm");
        String findName = scanner.next();
        boolean isName = false;
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (findName.equals(students[i])) {
                isName = true;
                index = i+1;
                break;
            }
        }

        if (isName) {
            System.out.println("Vị trí của học sinh trong danh sách là: " + index);
        } else {
            System.out.println("Không có học sinh trong danh sách.");
        }

    }
}
