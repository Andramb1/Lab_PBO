package com.ibik.pbo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistik {
    public static void main(String[] args) {
        // ArrayList untuk menyimpan data pesanan (Resi, Nama, Berat, Jarak, Total Harga)
        ArrayList<String[]> daftarPesanan = new ArrayList<>();
        boolean adaPesanan = false;

        while (true) {
            String menu = "--- PT. XYZ LOGISTIK ---\n" +
                          "1. Input Pesanan Baru\n" +
                          "2. Tracking Pesanan\n" +
                          "3. Keluar\n\n" +
                          "Pilih menu (1-3):";

            String pilihan = JOptionPane.showInputDialog(null, menu);

            // Validasi jika tombol CANCEL / Close ditekan pada menu utama
            if (pilihan == null) {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (konfirmasi == JOptionPane.YES_OPTION) {
                    break;
                }
                continue;
            }

            switch (pilihan) {
                case "1":
                    // Input Nama Pengirim/Penerima
                    String nama = JOptionPane.showInputDialog(null, "Masukkan Nama Pelanggan:");
                    if (nama == null) break;

                    // Input Berat dengan validasi angka
                    String beratStr = JOptionPane.showInputDialog(null, "Masukkan Berat Barang (gram):");
                    if (beratStr == null) break;
                    if (!isNumeric(beratStr)) {
                        JOptionPane.showMessageDialog(null, "Masukan angka", "Error Info", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    double berat = Double.parseDouble(beratStr);

                    // Input Jarak dengan validasi angka
                    String jarakStr = JOptionPane.showInputDialog(null, "Masukkan Jarak Tempuh (km):");
                    if (jarakStr == null) break;
                    if (!isNumeric(jarakStr)) {
                        JOptionPane.showMessageDialog(null, "Masukan angka", "Error Info", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    double jarak = Double.parseDouble(jarakStr);

                    // Perhitungan Biaya
                    // Berat: kelipatan 100 gram = Rp 5.000
                    double kelipatanBerat = Math.ceil(berat / 100.0);
                    double biayaBerat = kelipatanBerat * 5000;

                    // Jarak: kelipatan per 10 km = Rp 8.000
                    double kelipatanJarak = Math.ceil(jarak / 10.0);
                    double biayaJarak = kelipatanJarak * 8000;

                    double totalBiaya = biayaBerat + biayaJarak;

                    // Generate Nomor Resi Otomatis (Contoh: XYZ-001, XYZ-002, dst)
                    String noResi = "XYZ-" + (100 + daftarPesanan.size() + 1);

                    // Simpan ke ArrayList
                    daftarPesanan.add(new String[]{noResi, nama, String.valueOf(berat), String.valueOf(jarak), String.valueOf(totalBiaya)});
                    adaPesanan = true;

                    JOptionPane.showMessageDialog(null, "Pesanan Berhasil Disimpan!\n" +
                                                      "Nomor Resi Anda : " + noResi + "\n" +
                                                      "Total Biaya     : Rp " + totalBiaya);
                    break;

                case "2":
                    // Validasi: Jika belum melakukan input pesanan
                    if (!adaPesanan) {
                        JOptionPane.showMessageDialog(null, "Jika belum melakukan Input Pesanan, maka tidak bisa mengakses atau melakukan tracking pesanan.", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    }

                    String cariResi = JOptionPane.showInputDialog(null, "Masukkan Nomor Resi yang ingin dilacak:");
                    if (cariResi == null) break;

                    boolean ditemukan = false;
                    for (String[] pesanan : daftarPesanan) {
                        if (pesanan[0].equalsIgnoreCase(cariResi)) {
                            JOptionPane.showMessageDialog(null, "DETAIL PESANAN:\n" +
                                                              "No Resi   : " + pesanan[0] + "\n" +
                                                              "Nama      : " + pesanan[1] + "\n" +
                                                              "Berat     : " + pesanan[2] + " gram\n" +
                                                              "Jarak     : " + pesanan[3] + " km\n" +
                                                              "Total     : Rp " + pesanan[4] + "\n" +
                                                              "Status    : Dalam Perjalanan ke Lokasi Ekspedisi");
                            ditemukan = true;
                            break;
                        }
                    }

                    // Validasi: Jika nomor resi tidak ditemukan
                    if (!ditemukan) {
                        JOptionPane.showMessageDialog(null, "Data tidak ditemukan", "Error Info", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "3":
                    int keluar = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (keluar == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Pilihan menu tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }

    // Method helper untuk mengecek apakah input berupa angka
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}