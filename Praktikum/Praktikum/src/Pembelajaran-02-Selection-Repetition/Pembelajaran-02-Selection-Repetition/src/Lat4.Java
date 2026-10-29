import java.util.Scanner;
 
public class Lat4 {
    
    static final long NPM = 252310019;
 
    
    static boolean bintang(int r, int c, int n) {
        int tengah = n - 1;
        return Math.abs(r - tengah) + Math.abs(c - tengah) >= n - 1;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();
        int size = 2 * n - 1;
 
        if (NPM % 2 != 0) { 
            int r = 0;
            while (r < size) {
                int c = 0;
                while (c < size) {
                    System.out.print(bintang(r, c, n) ? "* " : "  ");
                    c++;
                }
                System.out.println();
                r++;
            }
        } else { 
            for (int r = 0; r < size; r++) {
                for (int c = 0; c < size; c++) {
                    System.out.print(bintang(r, c, n) ? "* " : "  ");
                }
                System.out.println();
            }
        }
    }
}
 