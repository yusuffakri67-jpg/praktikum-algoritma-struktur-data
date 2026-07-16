import java.util.Scanner;

public class DoubleLinkedListMain {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DoubleLinkedList18 list = new DoubleLinkedList18();
            int pilihan;

            do {
                System.out.println("\n === Menu Double Linked List");
                System.out.println("1. Tambah data di awal");
                System.out.println("2. Tambah data di akhir");
                System.out.println("3. Sisipkan dat ditengah (setealah NIM)");
                System.out.println("4. Hapus data di awal");
                System.out.println("5. Hapus data di akhir");
                System.out.println("6. Tampilkan data");
                System.out.println("0. Keluar");
                System.out.print("Pilih Menu : ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1 -> {
                        Mahasiswa06 mhsAwal = inputMahasiswa(scanner);
                        list.addFirst(mhsAwal);
                    }
                    case 2 -> {
                        Mahasiswa06 mhsAkhir = inputMahasiswa(scanner);
                        list.addLast(mhsAkhir);
                    }
                    case 3 -> {
                        System.out.print("Masukkan NIM yang dicari : ");
                        String keynim = scanner.nextLine();
                        System.out.println("Masukkan data baru : ");
                        Mahasiswa06 databaru = inputMahasiswa(scanner);
                        list.inserAfter(keynim, databaru);
                    }
                    case 4 -> list.removeFirst();
                    case 5 -> list.removeLast();
                    case 6 -> list.print();
                    case 0 -> {
                        System.out.println("Program selesai");
                        return;
                    }
                    default -> System.out.println("Pilihan tidak valid");
                }
            } while (pilihan != 0);
        }
    }

    public static Mahasiswa06 inputMahasiswa(Scanner scanner) {
        System.out.print("Masukkan NIM : ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Jurusan : ");
        String jurusan = scanner.nextLine();
        System.out.print("Masukkan IPK : ");
        double ipk = scanner.nextDouble();
        scanner.nextLine();
        return new Mahasiswa06(nim, nama, jurusan, ipk);
    }
}
