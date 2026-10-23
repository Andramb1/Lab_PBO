package Praktikum2;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        
        segitiga segitiga = new segitiga()

        System.out.println("Input A : ");
        a = scanner.nextInt();

        System.out.println("Input B : ");
        b = scanner.nextInt();

         System.out.println("Input C : ");
        c = scanner.nextInt();

        if (segitiga.a * segitiga.a + segitiga.b * segitiga.b == segitiga.c * segitiga.c) {
            System.out.println("Sempurna");

        } else {
            System.out.println( "Tidak Sempurna");
        }

    }
}
