
import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {
        Biodata data = new Biodata();

        String fullname = JOptionPane.showInputDialog(
            null, "Masukkan Fullname:");
        String usia = JOptionPane.showInputDialog(
            null, "Masukkan Usia:");
        String alamat = JOptionPane.showInputDialog(
            null, "Masukkan Alamat:");

        data.setFullname(fullname);
        data.setUsia(Integer.parseInt(usia));
        data.setAlamat(alamat);

        JOptionPane.showMessageDialog(
            null,
            "Fullname: " + data.getFullname()
            + "\nUsia: " + data.getUsia()
            + "\nAlamat: " + data.getAlamat(),
            "Data Biodata",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
