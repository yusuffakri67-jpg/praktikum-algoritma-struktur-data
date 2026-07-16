

public class AntrianLayanan {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan(int n) {
        max = n;
        data = new Mahasiswa[max];
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

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = mhs;
            size++;
        }
    }

    public Mahasiswa dequeue() {
        Mahasiswa mhs = null;
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            mhs = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return mhs;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nim + " " + data[front].nama);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nim + " " + data[i].nama + " " + data[i].prodi + " " + data[i].kelas);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nim + " " + data[i].nama + " " + data[i].prodi + " " + data[i].kelas);
            System.out.println("Jumlah elemen = " + size);
        }
    }
}
