import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> angka = new ArrayList<>();

        angka.add(new ArrayList<>()); // Menambah row
        angka.get(angka.size() - 1).add(10);

        angka.add(new ArrayList<>(Arrays.asList(1, 2, 3)));

        System.out.println(angka.get(0).get(0)); //output 1

        for (int i = 0; i < angka.size(); i++) {
            for (int j = 0; j < angka.get(i).size(); j++) {
                System.out.print(angka.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}