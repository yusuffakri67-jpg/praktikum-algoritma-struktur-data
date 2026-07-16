public class TugasQueueLinkedList {
    /**
 * Tugas XI - Linked List
 * Deskripsi: Implementasi Queue (Antrian) menggunakan struktur data Linked List
 */
    TugasNode head, tail;
    int size = 0;

    // Cek antrian kosong [cite: 320]
    boolean isEmpty() {
        return head == null;
    }

    // Menambahkan antrian (Enqueue) [cite: 321]
    void enqueue(TugasMahasiswa data) {
        TugasNode newNode = new TugasNode(data, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Memanggil antrian (Dequeue) [cite: 322]
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Memanggil mahasiswa: ");
            head.data.tampil();
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
        }
    }

    // Menampilkan antrian terdepan dan paling akhir [cite: 323]
    void peek() {
        if (!isEmpty()) {
            System.out.println("Antrian Terdepan: ");
            head.data.tampil();
            System.out.println("Antrian Terakhir: ");
            tail.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    // Menampilkan daftar mahasiswa dan jumlah yang mengantre [cite: 324]
    void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            TugasNode temp = head;
            System.out.println("Daftar Antrian Saat Ini:");
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
            System.out.println("Jumlah mahasiswa mengantre: " + size);
        }
    }

    // Mengosongkan antrian [cite: 320]
    void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

}
