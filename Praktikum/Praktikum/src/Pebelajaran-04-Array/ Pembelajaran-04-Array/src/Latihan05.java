import javax.swing.JOptionPane;

public class Latihan05 {
    public static void main(String[] args) {
        String[] field = {
            "Nama Lengkap",
            "Alamat",
            "No Telp"
        };

        String[] data = new String[field.length];

        for (int i = 0; i < field.length; i++) {
            data[i] = JOptionPane.showInputDialog(
                "Masukkan " + field[i] + ":"
            );
        }

        String hasil = "";

        for (int i = 0; i < field.length; i++) {
            hasil += field[i] + ": " + data[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}