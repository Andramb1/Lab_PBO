package Pertemuan3;

import java.util.Scanner;

public class Kalkulator {
    static double hitung(double x, double y, char operator) {
        switch (operator) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                if (y == 0) {
                    throw new Error("tidak boleh dibagi dengan nol");
                }
                return x / y;
            default:
                throw new Error("Operator invalid");
        }
    }

    public static void main(String[] args) {
        System.out.println("kalkulator sederhana");

        double x, y;
        char operator, again = 'Y';

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("input x: ");
            x = scanner.nextDouble();

            System.out.print("input y: ");
            y = scanner.nextDouble();

            System.out.print("input operator: ");
            operator = scanner.next().charAt(0);

            double hasil = hitung(x, y, operator);
            System.out.println("hasil: " + hasil);

            System.out.println("ulang (Y/N)? ");
            again = scanner.next().charAt(0);

        }  while (Character.toUpperCase(again)== 'Y');
    }
}