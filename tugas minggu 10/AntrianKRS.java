
public class AntrianKRS {
    MahasiswaKRS[] data;
    int front, rear, size, max;
    int sudahKRS = 0; // Menghitung mahasiswa yang sudah diproses

    public AntrianKRS(int n) {
        max = n;
        data = new MahasiswaKRS[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void tambahAntrian(MahasiswaKRS mhs) {
        if (!isFull()) {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
        } else {
            System.out.println("Antrian sudah penuh!");
        }
    }

    public void prosesKRS() {
        if (size >= 2) {
            for (int i = 0; i < 2; i++) {
                MahasiswaKRS m = data[front];
                System.out.print("Memproses KRS untuk: ");
                m.tampilkanData();
                front = (front + 1) % max;
                size--;
                sudahKRS++;
            }
        } else {
            System.out.println("Minimal harus ada 2 mahasiswa dalam antrian untuk diproses.");
        }
    }

    public void tampilkanSemua() {
        if (!isEmpty()) {
            int temp = front;
            for (int i = 0; i < size; i++) {
                data[temp].tampilkanData();
                temp = (temp + 1) % max;
            }
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void tampilkanDuaTerdepan() {
        if (size >= 1) {
            data[front].tampilkanData();
            if (size >= 2) {
                data[(front + 1) % max].tampilkanData();
            }
        }
    }

    public void tampilkanPalingAkhir() {
        if (!isEmpty()) {
            data[rear].tampilkanData();
        }
    }

    public void cetakStatus(int totalMahasiswaDPA) {
        System.out.println("Jumlah antrian saat ini: " + size);
        System.out.println("Jumlah mahasiswa sudah KRS: " + sudahKRS);
        System.out.println("Mahasiswa belum KRS (dari target " + totalMahasiswaDPA + "): " + (totalMahasiswaDPA - sudahKRS));
    }
    
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }
}

