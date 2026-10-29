import java.util.Scanner;

public class Lat6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap Anda: ");
        String nama = scanner.nextLine();

        // Mengganti huruf vokal dengan X (case-insensitive)
        String hasil = nama.replaceAll("[AaIiUuEeOo]", "X");

        System.out.println("Hasil Ubah Vokal: " + hasil);

        scanner.close();
    }
}