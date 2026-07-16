import java.util.Scanner;
public class Mahasiswademo18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Mahasiswa18[] arrayOfMahasiswa04 = new Mahasiswa18[3];
            String dummy;

            for(int i = 0; i < 3; i++){
                arrayOfMahasiswa04[i] = new Mahasiswa18();

                System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
                System.out.println("NIM  : ");
                arrayOfMahasiswa04[i].nim = sc.nextLine();
                System.out.println("Nama : ");
                arrayOfMahasiswa04[i].nama = sc.nextLine();
                System.out.println("Kelas : ");
                arrayOfMahasiswa04[i].kelas = sc.nextLine();
                System.out.println("IPK : ");
                dummy = sc.nextLine();
                arrayOfMahasiswa04[i].ipk = Float.parseFloat(dummy);
                System.out.println("---------------------------------");
            }
               
                for(int i = 0; i < 3; i++){
                System.out.println("DATA MAHASISWA KE- : " + (i + 1));
               arrayOfMahasiswa04[i].cetakInfo();
                System.out.println("---------------------------------");

            }
        }

    }
}

