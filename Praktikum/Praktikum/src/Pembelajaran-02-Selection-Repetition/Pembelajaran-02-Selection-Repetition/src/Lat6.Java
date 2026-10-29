import java.util.Scanner;

public class Lat6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Resto resto = new Resto();
        char ulang;
        do {
            resto.chooseMenu();
            System.out.print("Apakah anda akan memesan kembali ? (y/n): ");
            ulang = in.next().toLowerCase().charAt(0);
            System.out.println();
        } while (ulang == 'y');
        System.out.println("Terimakasih telah memesan.");
    }
}