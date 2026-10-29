package Pertemuan4.Pertemuan4.src;

import javax.swing.JOptionPane;

public class Latihan04 {

    public static boolean konfirmasiKeluar() {
        int pilihan = JOptionPane.showConfirmDialog(
            null,
            "Apakah anda ingin keluar ?",
            "Konfirmasi",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        return pilihan == JOptionPane.YES_OPTION;
    }

    public static String inputData(String field) {
        while (true) {
            String input = JOptionPane.showInputDialog(
                null, "Masukkan " + field + ":");

            if (input == null) {
                if (konfirmasiKeluar()) {
                    System.exit(0);
                }
                continue;
            }

            if (input.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "Field " + field.toLowerCase()
                    + " tidak boleh kosong",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
                continue;
            }

            return input.trim();
        }
    }

    public static void main(String[] args) {
        Biodata data = new Biodata();

        while (true) {
            String fullname = inputData("Fullname");

            int usia;

            while (true) {
                String usiaInput = inputData("Usia");

                try {
                    usia = Integer.parseInt(usiaInput);
                    break;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Isian usia harus angka",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                    );
                }
            }

            String alamat;

            while (true) {
                alamat = inputData("Alamat");

                if (alamat.length() >= 10) {
                    break;
                }

                JOptionPane.showMessageDialog(
                    null,
                    "Masukan alamat minimum 10 karakter",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE
                );
            }

            data.setFullname(fullname);
            data.setUsia(usia);
            data.setAlamat(alamat);

            JOptionPane.showMessageDialog(
                null,
                "Fullname: " + data.getFullname()
                + "\nUsia: " + data.getUsia()
                + "\nAlamat: " + data.getAlamat(),
                "Data Biodata",
                JOptionPane.INFORMATION_MESSAGE
            );

            if (konfirmasiKeluar()) {
                break;
            }
        }
    }
}