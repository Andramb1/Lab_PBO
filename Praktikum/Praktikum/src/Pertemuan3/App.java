package Pertemuan3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("masukan sisi a: ");
        a = scanner.nextInt();

        System.out.println("masukan sisi b: ");
        b = scanner.nextInt();

        System.out.println("masukan sisi c: ");
        c = scanner.nextInt();


        int hasil = (a,b,c);
        
        if(segitiga.a * segitiga.a + segitiga.b * segitiga.b == segitiga.c * segitiga.c) {
            System.out.println("Sempurna");
        } else {
            System.out.println("tidak sempurna");
        }

        Segitiga segitiga  = new Segitiga(a, b, c);
    }
}