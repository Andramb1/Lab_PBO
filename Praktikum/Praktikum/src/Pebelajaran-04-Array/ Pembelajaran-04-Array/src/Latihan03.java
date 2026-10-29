import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(
            JOptionPane.showInputDialog("Masukkan jumlah array:")
        );

        int[] nilai = new int[jumlah];
        String hasil = "Output Array\n";

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Masukkan angka untuk index ke-" + i + ":"
                )
            );
        }

        for (int i = 0; i < nilai.length; i++) {
            hasil += "x[" + i + "] = " + nilai[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}