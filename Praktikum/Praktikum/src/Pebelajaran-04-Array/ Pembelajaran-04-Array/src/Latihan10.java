import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Latihan10 {
    public static void main(String[] args) {
        String[] field = {
            "Nama Lengkap",
            "Alamat",
            "No Telp"
        };

        ArrayList<String> data = new ArrayList<>();

        for (int i = 0; i < field.length; i++) {
            String input = JOptionPane.showInputDialog(
                "Masukkan " + field[i] + ":"
            );

            data.add(input);
        }

        String hasil = "";

        for (int i = 0; i < data.size(); i++) {
            hasil += field[i] + ": " + data.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}