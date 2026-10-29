import javax.swing.JOptionPane;

public class Latihan06 {
    public static void main(String[] args) {
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];

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

        String hasil = "Matriks A:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += A[i][j] + "\t";
            }
            hasil += "\n";
        }

        hasil += "\nMatriks B:\n";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil += B[i][j] + "\t";
            }
            hasil += "\n";
        }

        JOptionPane.showMessageDialog(null, hasil);
    }
}