import java.util.Scanner;

public class Dosendemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen[] daftarDosen = new Dosen[3]; // Contoh 3 dosen sesuai output [cite: 423]

        for (int i = 0; i < daftarDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (P/W): ");
            char jk = sc.nextLine().toUpperCase().charAt(0);
            boolean jenisKelamin = (jk == 'P');
            System.out.print("Usia          : ");
            int usia = Integer.parseInt(sc.nextLine());
            System.out.println("--------------------------------");

            daftarDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
        }

        // Memanggil method dari class DataDosen
        Datadosen helper = new Datadosen();
        helper.dataSemuaDosen(daftarDosen);
        helper.jumlahDosenPerJenisKelamin(daftarDosen);
        helper.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        helper.infoDosenPalingTua(daftarDosen);
        helper.infoDosenPalingMuda(daftarDosen);
    }
}

