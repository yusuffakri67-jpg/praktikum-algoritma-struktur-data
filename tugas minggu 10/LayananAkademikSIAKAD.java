
import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void menu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int n = sc.nextInt();
        AntrianLayanan antri = new AntrianLayanan(n);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine(); // membersihkan buffer
            switch (pilih) {
                case 1 -> {
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antri.enqueue(mhs);
                }
                case 2 -> {
                    Mahasiswa dataKeluar = antri.dequeue();
                    if (dataKeluar != null) {
                        System.out.println("Antrian keluar: " + dataKeluar.nim + " " + dataKeluar.nama);
                    }
                }
                case 3 -> antri.peek();
                case 4 -> antri.print();
            }
        } while (pilih > 0 && pilih < 5);
    }
}