import java.util.Scanner;

public class Lat9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Students myBio = new Students();

        System.out.print("Masukkan NPM (Integer)      : ");
        int vNpm = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        System.out.print("Masukkan Fullname (String)  : ");
        String vName = scanner.nextLine();

        System.out.print("Masukkan ClassName (String) : ");
        String vClass = scanner.nextLine();

        System.out.print("Masukkan Semester (Integer) : ");
        int vSem = scanner.nextInt();

        System.out.print("Masukkan GPA (Float)        : ");
        float vGpa = scanner.nextFloat();

        System.out.println("\n=== MEMANGGIL METHOD CLASS STUDENTS ===");
        System.out.println("NPM      : " + myBio.getNPM(vNpm));
        System.out.println("Fullname : " + myBio.getFullname(vName));
        System.out.println("ClassName: " + myBio.getClassName(vClass));
        System.out.println("Semester : " + myBio.getSemester(vSem));
        System.out.println("GPA      : " + myBio.getGPA(vGpa));

        scanner.close();
    }
}