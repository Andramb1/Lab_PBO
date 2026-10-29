import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime sekarang = LocalDateTime.now();
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println("=================================================");
        System.out.println("             TOKO SERBAGUNA IBIK                 ");
        System.out.println("=================================================");
        System.out.print("Masukkan jumlah produk yang dibeli : ");
        int qty = scanner.nextInt();

        double hargaSatuan = 6300;
        double totalHarga = qty * hargaSatuan;
        double diskon = 0;

        if (qty >= 3) {
            diskon = totalHarga * 0.10; 
        double subTotal = totalHarga - diskon;

        System.out.println("\n" + sekarang.format(formatWaktu));
        System.out.println("ITEM\t\tQTY\tHARGA\t\tTOTAL");
        System.out.println("=================================================");
        System.out.println("ROTI ENAK.\t" + qty + "\tRp " + hargaSatuan + ",\tRp " + totalHarga);
        System.out.println("-------------------------------------------------");
        System.out.println("Diskon : 10%");
        System.out.println("Sub Total : Rp " + subTotal + ",-");
        System.out.println("=================================================");

        scanner.close();
    }
}