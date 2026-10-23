package Quiz1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DataBuku {
    public static void main(String[] args) {
        ArrayList<String> daftarBuku = new ArrayList<>();
        String pilih = "";

        while (!pilih.equals("4")) {
            pilih = JOptionPane.showInputDialog(
                "1. Input Buku\n" +
                "2. Hapus Buku\n" +
                "3. Output Seluruh Data Buku\n" +
                "4. Keluar\n\n" +
                "Masukkan pilihan:"
            );

            if (pilih == null || pilih.equals("4")) {
                break;
            }

            switch (pilih) {
                case "1":
                    String judul = JOptionPane.showInputDialog("Masukkan judul buku:");

                    if (judul != null && !judul.trim().isEmpty()) {
                        daftarBuku.add(judul);
                        JOptionPane.showMessageDialog(null, "Buku berhasil disimpan!");
                    } else if (judul != null) {
                        JOptionPane.showMessageDialog(null, "Judul tidak boleh kosong!");
                    }
                    break;

                case "2":
                    if (daftarBuku.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Belum ada buku!");
                    } else {
                        String hapus = JOptionPane.showInputDialog(
                            "Daftar Buku:\n" + daftarBuku +
                            "\nMasukkan judul buku yang ingin dihapus:"
                        );

                        if (hapus != null) {
                            if (daftarBuku.remove(hapus)) {
                                JOptionPane.showMessageDialog(null, "Buku berhasil dihapus!");
                            } else {
                                JOptionPane.showMessageDialog(null, "Buku tidak ditemukan!");
                            }
                        }
                    }
                    break;

                case "3":
                    if (daftarBuku.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Belum ada data buku!");
                    } else {
                        JOptionPane.showMessageDialog(
                            null, "Daftar Buku:\n" + String.join("\n", daftarBuku)
                        );
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid!");
            }
        }

        JOptionPane.showMessageDialog(null, "Program selesai.");
    }
}
