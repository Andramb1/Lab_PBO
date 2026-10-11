import java.util.Scanner;

public class Resto {
    private long harga;

    public void chooseMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu Sarapan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu: ");
        int pilihan = in.nextInt();

        harga = getPrices(pilihan);
        switch (pilihan) {
            case 1:
                System.out.println("Anda memesan Nasi Goreng dengan harga Rp " + harga + ",-");
                break;
            case 2:
                System.out.println("Anda memesan Bubur Ayam dengan harga Rp " + harga + ",-");
                break;
            case 3:
                System.out.println("Anda memesan Soto Ayam dengan harga Rp " + harga + ",-");
                break;
            default:
                System.out.println("Maaf menu yang anda masukan salah.");
        }
    }

    private long getPrices(int menu) {
        switch (menu) {
            case 1: return 22000;
            case 2: return 15000;
            case 3: return 25000;
            default: return 0;
        }
    }
}