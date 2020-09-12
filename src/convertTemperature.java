import java.util.Scanner;

public class convertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        System.out.println("Nhập lựa chọn");
        System.out.printf("%s%s%s", "1.Chuyển từ Fahrenheit sang Celcius \n", "2.Chuyển từ Celcius sang Fahrenheit \n", "0.Thoát \n");
        choice = scanner.nextInt();
        double fah,cel,toFah,toCel;

        switch (choice) {
            case 1:
                System.out.print("Nhập Fahrenheit: ");
                fah = scanner.nextDouble();
                toCel = (5.0/9)*(fah-32);
                System.out.printf("%s%.3f","Celcius là: ", toCel);
                break;
            case 2:
                System.out.println("Nhập Celcius: ");
                cel = scanner.nextDouble();
                toFah = (9.0/5)*cel+32;
                System.out.printf("%s%.3f","Fahrenheit là: ",toFah);
                break;
            case 0:
                System.exit(0);
        }
    }
}
