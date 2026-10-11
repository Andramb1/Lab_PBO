import java.util.Scanner;
 
public class Lat1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan NPM: ");
        long npm = in.nextLong();
 
        boolean prima = npm >= 2;
        for (long i = 2; i * i <= npm && prima; i++) {
            if (npm % i == 0) {
                prima = false;
            }
        }
 
        if (prima) {
            System.out.println("Termasuk bilangan PRIMA");
        } else {
            System.out.println("Bukan termasuk bilangan prima karena dapat dibagi dengan 2");
        }
    }
}
 