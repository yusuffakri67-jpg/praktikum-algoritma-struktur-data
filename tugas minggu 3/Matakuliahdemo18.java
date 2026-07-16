import java.util.Scanner;
public class Matakuliahdemo18 {
    public static void main(String[] args) {
        Matakuliahdemo18 demo = new Matakuliahdemo18();
        Scanner sc = new Scanner(System.in);
        Matakuliah18[] arrayMatakuliah = new Matakuliah18[5];
        String kode, nama, dummy;
        int sks, jumlahjam;
        for (int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.println("kode \t: ");
            kode = sc.nextLine();
            System.out.println("nama \t: ");
            nama = sc.nextLine();
            System.out.println("Sks \t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.println("Jumlah jam \t: ");
            dummy = sc.nextLine();
            jumlahjam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------------");

            arrayMatakuliah[i] = new Matakuliah18(kode, nama, sks, jumlahjam);
        }
    }
}
