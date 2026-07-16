
public class StackSurat {
    Surat[] tumpukan;
    int size, top;

    public StackSurat(int size) {
        this.size = size;
        tumpukan = new Surat[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat s) {
        if (!isFull()) {
            top++;
            tumpukan[top] = s;
            System.out.println("Surat " + s.idSurat + " berhasil diterima.");
        } else {
            System.out.println("Tumpukan surat penuh!");
        }
    }

    public Surat pop() {
        if (!isEmpty()) {
            Surat s = tumpukan[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            Surat s = tumpukan[top];
            System.out.println("Surat Terakhir: " + s.idSurat + " - " + s.namaMahasiswa);
        } else {
            System.out.println("Tumpukan kosong.");
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan pada posisi tumpukan ke-" + (top - i + 1));
                System.out.println("ID: " + tumpukan[i].idSurat + ", Jenis: " + tumpukan[i].jenisIzin);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
    }
}