
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> data = new ArrayList<>();

        // Data awal sesuai soal
        String[][] dataAwal = {
            {"Septian Cahyadi", "Dramaga cantik residence II, Bogor", "+62 899-9506-210"},
            {"Isnan Mulia", "Jl. Manunggal, Bogor", "+62 819-3208-0875"},
            {"Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384"}
        };

        for (int i = 0; i < 3; i++) {

            ArrayList<String> baris = new ArrayList<>();

            String nama = JOptionPane.showInputDialog(
                "Masukkan Nama Lengkap:",
                dataAwal[i][0]
            );

            String alamat = JOptionPane.showInputDialog(
                "Masukkan Alamat:",
                dataAwal[i][1]
            );

            String telp = JOptionPane.showInputDialog(
                "Masukkan No Telp:",
                dataAwal[i][2]
            );

            baris.add(nama);
            baris.add(alamat);
            baris.add(telp);

            data.add(baris);
        }
        
        String hasil = "DATA MAHASISWA\n\n";

        for (int i = 0; i < data.size(); i++) {
            hasil += "Nama Lengkap : " + data.get(i).get(0) + "\n";
            hasil += "Alamat       : " + data.get(i).get(1) + "\n";
            hasil += "No Telp      : " + data.get(i).get(2) + "\n";
            hasil += "-----------------------------\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}
