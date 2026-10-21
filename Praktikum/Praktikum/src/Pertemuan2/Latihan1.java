package Pertemuan2;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        System.out.println("Program menghitung volume balok"); // bedanya prinln dengan print, println auto enter baris

        Balok balok = new Balok();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan panjang balok : ");
        balok.panjang = scanner.nextDouble();
        
        System.out.println("masukan lebar balok :");
        balok.lebar = scanner.nextDouble();

        System.out.println("masukan tinggi balok :");
        balok.tinggi = scanner.nextDouble();

        System.out.println("Volume dari balok :" + balok.getVolume());
    }
}