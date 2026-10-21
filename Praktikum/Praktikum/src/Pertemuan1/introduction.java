package Pertemuan1;

public class Introduction {
public static void main(String[] args) {
        Dog mydog = new Dog();
           System.out.println("Hello World");
        
        //variables 
        int angka1 = 20;
        int angka2 = 32;

        //tipe data
        String nama ="radit"; // bedanya kalau di java S nya gede

        //Operator
        int HasilPenjumlahan = angka1 + angka2; //Pertambahan
        HasilPenjumlahan++; //increment

        //Operator Perbandingan 
        boolean pembanding = angka1 > angka2;
        boolean tesNama = nama == "Andra";

        //Operator kondisional
        boolean kondisional = (true || false) && (true && true);

        //operator assignment
        angka1 *=angka2; // angka1 dikali angka2 
                        // hasilnya disimpan di angka 1 
                        // atau sama aja dengan angka1 = angka1 * angka2
        mydog.hungry();
        String name= "Tomi";
        mydog.puppyName(name);
    }
}

