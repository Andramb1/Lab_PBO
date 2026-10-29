import javax.swing.JOptionPane;

public class Latihan04 {
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(
            JOptionPane.showInputDialog("Masukkan jumlah array:")
        );

        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Masukkan angka index ke-" + i + ":"
                )
            );
        }

        int terbesar = nilai[0];
        int terkecil = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }

            if (nilai[i] < terkecil) {
                terkecil = nilai[i];
            }
        }

        String hasil = "";

        for (int i = 0; i < nilai.length; i++) {
            hasil += "x[" + i + "] = " + nilai[i] + "\n";
        }

        hasil += "\nNilai terbesar adalah " + terbesar;
        hasil += "\nNilai terkecil adalah " + terkecil;

        JOptionPane.showMessageDialog(null, hasil);
    }
}