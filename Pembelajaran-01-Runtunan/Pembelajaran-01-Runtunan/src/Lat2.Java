public class Lat2 {

    static final double PHI = 3.14;

    public static double hitungVolumeKerucut(double r, double t) {
        double volume = (1.0 / 3.0) * PHI * r * r * t; 
        return volume;
    }

    public static void hitungTabung(double r, double t) {
        double luasPermukaan = 2 * PHI * r * (r + t); 
        double volume = PHI * r * r * t;
        System.out.println("=== TABUNG ===");
        System.out.println("Luas Permukaan : " + luasPermukaan);
        System.out.println("Volume Tabung  : " + volume);
    }

    public static void main(String[] args) {
      
        double jariJariKerucut = 7.0;
        double tinggiKerucut = 12.0;

        double volK = hitungVolumeKerucut(jariJariKerucut, tinggiKerucut);
        System.out.println("Volume Kerucut : " + volK);
        System.out.println();

        hitungTabung(7.0, 10.0);
    }
}