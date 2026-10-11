import java.util.Scanner;
 
public class Lat3 {
   
    static final long NPM = 252310019;
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int factor;
        do {
            System.out.print("Masukkan nilai factor (minimal 20): ");
            factor = in.nextInt();
            if (factor < 20) {
                System.out.println("Nilai tidak boleh kurang dari 20!");
            }
        } while (factor < 20);
 
        if (NPM % 2 != 0) {
            System.out.print("ASC: Faktor " + factor + " adalah ");
            boolean first = true;
            for (int i = 1; i <= factor; i++) {
                if (factor % i == 0) {
                    System.out.print((first ? "" : ", ") + i);
                    first = false;
                }
            }
        } else { 
            System.out.print("DESC: Faktor " + factor + " adalah ");
            boolean first = true;
            for (int i = factor; i >= 1; i--) {
                if (factor % i == 0) {
                    System.out.print((first ? "" : ", ") + i);
                    first = false;
                }
            }
        }
        System.out.println();
    }
}