import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class Latihan09 {
    public static void main(String[] args) {
        ArrayList<Integer> nilai = new ArrayList<>();

        int jumlah = Integer.parseInt(
            JOptionPane.showInputDialog("Masukkan jumlah data:")
        );

        for (int i = 0; i < jumlah; i++) {
            int angka = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Masukkan angka ke-" + i + ":"
                )
            );

            nilai.add(angka);
        }

        int terbesar = Collections.max(nilai);
        int terkecil = Collections.min(nilai);

        String hasil = "Output ArrayList:\n";

        for (int i = 0; i < nilai.size(); i++) {
            hasil += "x[" + i + "] = " + nilai.get(i) + "\n";
        }

        hasil += "\nNilai terbesar adalah " + terbesar;
        hasil += "\nNilai terkecil adalah " + terkecil;

        JOptionPane.showMessageDialog(null, hasil);
    }
}