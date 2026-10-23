package Praktikum4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListApp {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();

        nama.add("alok"); // input data awal
        System.out.println(nama.get(0));

        JOptionPane jop = new JOptionPane();

        nama.add(jop.showInputDialog(null, "Input Nama: "));

        jop.showMessageDialog(
            null, "Nama: " + nama.get(nama.size() - 1));

        nama.remove(0);
        System.out.println("Nama Setelah Dihapus: " + nama.get(0));

        //pertanyaan
        // System.out.println(nama.get(1));

        nama.add("Ade");
        nama.add("Eman");
        for (int i = 0; i <nama.size(); i++) {
            nama.get(i);
            System.out.println(nama.get(i));
        }

        nama.clear(); //menghapus semua data
        System.out.println("Jumlah Nama Setelah Dihapus: " + nama.size());
    }
}