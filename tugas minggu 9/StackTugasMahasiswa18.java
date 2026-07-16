

public class StackTugasMahasiswa18 {
    Mahasiswa18[] stack;
    int size, top;

    // Konstruktor untuk inisialisasi kapasitas [cite: 55, 60]
    public StackTugasMahasiswa18(int size) {
        this.size = size;
        stack = new Mahasiswa18[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1; 
    }

    public boolean isEmpty() {
        return top == -1; 
    }

    // Menambahkan tugas ke tumpukan [cite: 86]
    public void push(Mahasiswa18 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs; 
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    // Mengambil tugas teratas untuk dinilai [cite: 96, 104]
    public Mahasiswa18 pop() {
        if (!isEmpty()) { 
            Mahasiswa18 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // Melihat tugas teratas tanpa menghapus [cite: 115, 116]
    public Mahasiswa18 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    // Menampilkan semua daftar tugas dalam stack [cite: 123]
    public void print() {
        for (int i = top; i >= 0; i--) { // Menampilkan dari atas ke bawah
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas); 
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
    StackKonversi18 stack = new StackKonversi18();
    while (nilai > 0) {
        int sisa = nilai % 2;
        stack.push(sisa);
        nilai = nilai / 2;
    }
    
    String biner = "";
    while (!stack.isEmpty()) {
        biner += stack.pop();
    }
    return biner;
}
}
