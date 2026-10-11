import java.util.Scanner;

public class Lat1 {
    public static void main(String[] args) {
     
        double celcius, fahrenheit, reamur, kelvin;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celcius: ");
        celcius = scanner.nextDouble();

   
        fahrenheit = (celcius * 9 / 5) + 32;
        reamur = celcius * 4 / 5;
        kelvin = celcius + 273.15;

        System.out.println("\n=== HASIL KONVERSI SUHU ===");
        System.out.println("Suhu dalam Celcius   : " + celcius + " °C");
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit + " °F");
        System.out.println("Suhu dalam Reamur    : " + reamur + " °R");
        System.out.println("Suhu dalam Kelvin    : " + kelvin + " K");
        
        scanner.close();
    }
}