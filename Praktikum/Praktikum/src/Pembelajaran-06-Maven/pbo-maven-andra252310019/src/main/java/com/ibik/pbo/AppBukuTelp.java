package com.ibik.pbo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppBukuTelp {
    public static void main(String[] args) {
        // ArrayList 2 dimensi untuk menyimpan data tabel buku telepon
        ArrayList<String[]> daftarKontak = new ArrayList<>();

        // Memasukkan data awal sesuai tabel soal latihan
        daftarKontak.add(new String[]{"Septian Cahyadi", "Dramaga cantik residance II, Bogor", "+62 899-9506-210"});
        daftarKontak.add(new String[]{"Isnan Mulia", "Jl.Manunggal, Bogor", "+62 819-3208-0875"});
        daftarKontak.add(new String[]{"Edi Nurachmand", "Taman Cimanggu Permai, Bogor", "+62 856-9380-0384"});

        boolean lanjut = true;

        while (lanjut) {
            String menu = "--- APLIKASI BUKU TELEPON ---\n" +
                          "1. Lihat Daftar Kontak\n" +
                          "2. Tambah Kontak Baru\n" +
                          "3. Keluar\n\n" +
                          "Pilih menu (1-3):";

            String pilihan = JOptionPane.showInputDialog(null, menu);

            // Jika tombol Cancel / Close ditekan
            if (pilihan == null) {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (konfirmasi == JOptionPane.YES_OPTION) {
                    break;
                }
                continue;
            }

            switch (pilihan) {
                case "1":
                    StringBuilder sb = new StringBuilder("DAFTAR KONTAK:\n\n");
                    for (int i = 0; i < daftarKontak.size(); i++) {
                        String[] kontak = daftarKontak.get(i);
                        sb.append((i + 1) + ". Nama : ").append(kontak[0]).append("\n")
                          .append("   Alamat : ").append(kontak[1]).append("\n")
                          .append("   No Telp: ").append(kontak[2]).append("\n\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                    break;

                case "2":
                    String nama = JOptionPane.showInputDialog(null, "Masukkan Nama Lengkap:");
                    if (nama == null) break;
                    String alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat:");
                    if (alamat == null) break;
                    String telp = JOptionPane.showInputDialog(null, "Masukkan No Telp:");
                    if (telp == null) break;

                    daftarKontak.add(new String[]{nama, alamat, telp});
                    JOptionPane.showMessageDialog(null, "Kontak berhasil ditambahkan!");
                    break;

                case "3":
                    int keluar = JOptionPane.showConfirmDialog(null, "Apakah anda ingin keluar?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (keluar == JOptionPane.YES_OPTION) {
                        lanjut = false;
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
}