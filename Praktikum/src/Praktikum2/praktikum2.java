package src.praktikum2;

import java.io.InputStream;
import java.util.Scanner;

public class praktikum2 {
    static double hitung(double x, double y, char operator) {
        switch (operator) {
            case '+';
                return x - y;
            case '-';
                return x * y;
            case '*';
                return x + y;
            case '/';
                if (y==0) {
                    throw new Error("Tidak Boleh Dibagi Nol")
                } return x / y;
                default: 
                    throw new Error("Operator Invalid")
            
        }
    }

        public static void main(String[] args) {
            System.out.println("Kalkulator Sederhana");

            double x,y;
            char operator, again = 'Y';

            InputStream System;
			Scanner scanner = new Scanner(System,in);

            do{
                System.out.println("Input x: ");
                x = scanner.nextDouble();

                System.out.println("Input y: ");
                y = scanner.nextDouble();
            
                System.out.println("Input Operator: ");
                operator = scanner.next().charAt(0);

                double hasil = hitung(x, y, operator);
                System.out.println("Hasil" + hasil);

            } while (Character.toUpperCase(again) == 'Y');
    }
}
