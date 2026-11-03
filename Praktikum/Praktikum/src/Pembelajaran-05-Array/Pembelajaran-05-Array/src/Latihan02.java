
import javax.swing.JOptionPane;

public class Latihan02 {
    public static void main(String[] args) {

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        JOptionPane.showMessageDialog(null, "Masukkan nilai Matriks A");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Matriks A [" + i + "][" + j + "]"
                    )
                );
            }
        }

        JOptionPane.showMessageDialog(null, "Masukkan nilai Matriks B");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Matriks B [" + i + "][" + j + "]"
                    )
                );
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        String hasil = "MATRIKS A:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += A[i][j] + "\t";
            }
            hasil += "\n";
        }

        hasil += "\nMATRIKS B:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += B[i][j] + "\t";
            }
            hasil += "\n";
        }

        hasil += "\nHASIL PERKALIAN MATRIKS C = A x B:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += C[i][j] + "\t";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}
