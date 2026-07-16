
public class DoubleLinkedList {
    Node headAntrean, tailAntrean;
    Node headPesanan, tailPesanan;
    int antreanCounter = 0;

    // Fitur: Tambah Antrian (Otomatis No Antrean)
    public void tambahAntrian(String nama, String hp) {
        antreanCounter++;
        Pembeli p = new Pembeli(antreanCounter, nama, hp);
        Node newNode = new Node(p);
        if (headAntrean == null) {
            headAntrean = tailAntrean = newNode;
        } else {
            tailAntrean.next = newNode;
            newNode.prev = tailAntrean;
            tailAntrean = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + antreanCounter);
    }

    // Fitur: Cetak Antrian yang ada saat ini
    public void cetakAntrian() {
        if (headAntrean == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("----------------------------------------------");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("----------------------------------------------");
        System.out.printf("%-12s | %-15s | %-12s\n", "No Antrean", "Nama", "No HP");
        Node curr = headAntrean;
        while (curr != null) {
            System.out.printf("%-12d | %-15s | %-12s\n", 
                curr.pembeli.noAntrean, curr.pembeli.namaPembeli, curr.pembeli.NoHp);
            curr = curr.next;
        }
    }

    // Fitur: Proses Antrean (FIFO) dan Masukkan ke Data Pesanan
    public void hapusDanPesan(int kode, String menu, int harga) {
        if (headAntrean == null) {
            System.out.println("Tidak ada antrean untuk diproses.");
            return;
        }
        
        System.out.println(headAntrean.pembeli.namaPembeli + " telah memesan " + menu);
        
        // Simpan ke List Pesanan
        Pesanan ps = new Pesanan(kode, menu, harga);
        Node newNode = new Node(ps);
        if (headPesanan == null) {
            headPesanan = tailPesanan = newNode;
        } else {
            tailPesanan.next = newNode;
            newNode.prev = tailPesanan;
            tailPesanan = newNode;
        }

        // Hapus antrean terdepan (head)
        headAntrean = headAntrean.next;
        if (headAntrean != null) {
            headAntrean.prev = null;
        } else {
            tailAntrean = null;
        }
    }

    // Fitur: Laporan Pesanan dengan Sorting Manual (Selection Sort)
    public void laporanPesanan() {
        if (headPesanan == null) {
            System.out.println("Belum ada pesanan masuk.");
            return;
        }

        int count = 0;
        Node curr = headPesanan;
        while (curr != null) { count++; curr = curr.next; }

        Node[] arr = new Node[count];
        curr = headPesanan;
        for (int i = 0; i < count; i++) {
            arr[i] = curr;
            curr = curr.next;
        }

        // Sorting manual berdasarkan Nama Pesanan (A-Z)
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i].pesanan.namaPesanan.compareToIgnoreCase(arr[j].pesanan.namaPesanan) > 0) {
                    Node temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("----------------------------------------------");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("----------------------------------------------");
        System.out.printf("%-15s | %-20s | %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        for (Node n : arr) {
            System.out.printf("%-15d | %-20s | %-10d\n", 
                n.pesanan.kodePesanan, n.pesanan.namaPesanan, n.pesanan.harga);
        }
    }
}
