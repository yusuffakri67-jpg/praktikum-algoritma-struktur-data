import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList resto = new DoubleLinkedList();
        int pilihan;

        // Inisialisasi data awal contoh
        resto.tambahAntrian("Ainra", "08224500000");
        resto.tambahAntrian("Danra", "08224511111");

        do {
            System.out.println("\n===== MENU ROYAL DELISH =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    String hp = sc.nextLine();
                    resto.tambahAntrian(nama, hp);
                    break;
                case 2:
                    resto.cetakAntrian();
                    break;
                case 3:
                    System.out.print("Kode Pesanan: ");
                    int kode = sc.nextInt(); sc.nextLine();
                    System.out.print("Nama Pesanan: ");
                    String menu = sc.nextLine();
                    System.out.print("Harga: ");
                    int harga = sc.nextInt();
                    resto.hapusDanPesan(kode, menu, harga);
                    break;
                case 4:
                    resto.laporanPesanan();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }
}