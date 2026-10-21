package Pertemuan2;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        System.out.println("Sinta ingin membeli Tanah");

        Tanah tanah = new Tanah();
        Scanner scanner = new Scanner (System.in);
        int harga_tanah = 500000;

        System.out.println("masukan berapa meter :");
        tanah.luas = scanner.nextInt();

        int total_harga = tanah.getLuas() * harga_tanah;

        System.out.println("Total harga :" + total_harga);
    }
}