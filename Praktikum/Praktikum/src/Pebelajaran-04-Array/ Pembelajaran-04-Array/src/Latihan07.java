import javax.swing.JOptionPane;

public class Latihan07 {
    public static void main(String[] args) {
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                A[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Matriks A [" + i + "][" + j + "]:"
                    )
                );
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                B[i][j] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                        "Matriks B [" + i + "][" + j + "]:"
                    )
                );
            }
        }

        String operasi = JOptionPane.showInputDialog(
            "Pilih operasi:\n1. Penjumlahan\n2. Pengurangan"
        );

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (operasi.equals("1")) {
                    C[i][j] = A[i][j] + B[i][j];
                } else {
                    C[i][j] = A[i][j] - B[i][j];
                }
            }
        }

        String hasil = "Matriks C:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += C[i][j] + "\t";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}