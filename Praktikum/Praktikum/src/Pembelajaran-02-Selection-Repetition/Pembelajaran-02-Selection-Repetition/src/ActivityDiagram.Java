import java.util.Scanner;

public class Latihan10 {

    static final String PIN = "252310019";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long saldo = 0;

        String input;
        do {
            System.out.print("Masukkan PIN: ");
            input = in.next();
            if (!input.equals(PIN)) {
                System.out.println("PIN salah, silakan coba lagi.");
            }
        } while (!input.equals(PIN));

        char lanjut;
        do {
            System.out.println("\n=== MENU ATM ===");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = in.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;
                case 2:
                    System.out.print("Masukkan nominal setor tunai: ");
                    long setor = in.nextLong();
                    saldo += setor;
                    System.out.println("Saldo anda: Rp " + saldo);
                    break;
                case 3:
                    System.out.print("Masukkan nominal tarik tunai: ");
                    long tarik = in.nextLong();
                    if (tarik <= saldo) {
                        saldo -= tarik;
                        System.out.println("Saldo anda: Rp " + saldo);
                    } else {
                        System.out.println("Saldo tidak cukup");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }

            System.out.print("Masukkan konfirmasi (y = kembali ke menu / n = keluar aplikasi): ");
            lanjut = in.next().toLowerCase().charAt(0);
        } while (lanjut == 'y');

        System.out.println("Terimakasih.");
    }
}