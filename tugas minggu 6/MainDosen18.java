import java.util.Scanner;

public class MainDosen18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen18 data = new DataDosen18();
        int pilih;

        // Data dummy untuk mempercepat pengujian (Opsional)
        data.tambah(new Dosen18("D01", "Dr. Budi", true, 45));
        data.tambah(new Dosen18("D02", "Siti Aminah", false, 30));
        data.tambah(new Dosen18("D03", "Andi Wijaya", true, 38));

        do {
            System.out.println("\n=== MENU DATA DOSEN 18 ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data");
            System.out.println("3. Sorting Usia ASC (Bubble Sort)");
            System.out.println("4. Sorting Usia DESC (Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("Kode Dosen    : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama Dosen    : ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkStr = sc.nextLine();
                    boolean jk = jkStr.equalsIgnoreCase("L");
                    System.out.print("Usia          : ");
                    int usia = sc.nextInt();
                    data.tambah(new Dosen18(kd, nm, jk, usia));
                    break;
                case 2:
                    System.out.println("\n--- Daftar Dosen ---");
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("\nData berhasil diurutkan (Termuda -> Tertua).");
                    data.tampil();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("\nData berhasil diurutkan (Tertua -> Termuda).");
                    data.tampil();
                    break;
                case 5:
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}