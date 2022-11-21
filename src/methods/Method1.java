package methods;

import java.util.Scanner;

public class Method1 {

    public static void main(String[] args) {
        multiply(12, 5);
        multiply(4, 7);

        //verilen iki sayinin toplamini tek sayiysa 2 katini yazdir, cift sayiysa 3 katini yazdir.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iki sayi giriniz : ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = sum(number1, number2);

        if (result % 2 == 0) {
            System.out.println(result * 3);
        } else {
            System.out.println(result * 2);
        }
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static void multiply(int number1, int number2) {
        System.out.println("result : " + number1 * number2);
    }


    public void selam() {
        System.out.println("Merhaba");
    }

    public static void ad() {
        System.out.println("Benim adim Yunus Emre");
    }
}
