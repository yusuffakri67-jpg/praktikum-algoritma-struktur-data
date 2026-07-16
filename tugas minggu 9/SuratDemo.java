
import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat stack = new StackSurat(10);
        int pilih;

        do {
            System.out.println("\n--- Menu Admin Prodi ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin (Pop)");
            System.out.println("3. Lihat Surat Izin Terakhir (Peek)");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): "); char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): "); int dur = sc.nextInt();
                    stack.push(new Surat(id, nama, kls, jns, dur));
                    break;
                case 2:
                    Surat diproses = stack.pop();
                    if (diproses != null) System.out.println("Memproses surat milik " + diproses.namaMahasiswa);
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;
            }
        } while (pilih != 5);
    }
}
