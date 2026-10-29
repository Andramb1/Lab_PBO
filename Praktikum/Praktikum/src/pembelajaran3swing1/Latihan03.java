
import javax.swing.JOptionPane;

public class Latihan03 {
    public static void main(String[] args) {
        Biodata data = new Biodata();

        while (true) {
            String fullname = JOptionPane.showInputDialog(
                null, "Masukkan Fullname:");

            if (fullname == null || fullname.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null, "Field fullname tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            String usiaInput = JOptionPane.showInputDialog(
                null, "Masukkan Usia:");

            if (usiaInput == null || usiaInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null, "Field usia tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            int usia;
            try {
                usia = Integer.parseInt(usiaInput.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                    null, "Isian usia harus angka",
                    "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            String alamat = JOptionPane.showInputDialog(
                null, "Masukkan Alamat:");

            if (alamat == null || alamat.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null, "Field alamat tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(
                    null, "Masukan alamat minimum 10 karakter",
                    "Warning", JOptionPane.WARNING_MESSAGE);
                continue;
            }

            data.setFullname(fullname.trim());
            data.setUsia(usia);
            data.setAlamat(alamat.trim());

            JOptionPane.showMessageDialog(
                null,
                "Fullname: " + data.getFullname()
                + "\nUsia: " + data.getUsia()
                + "\nAlamat: " + data.getAlamat(),
                "Data Biodata",
                JOptionPane.INFORMATION_MESSAGE
            );

            break;
        }
    }
}
