
public class MahasiswaDemo {
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        Mahasiswa18 m1 = new Mahasiswa18("123", "Zidan", "2A", "3.2");
        Mahasiswa18 m2 = new Mahasiswa18("124", "Ayu", "2A", "3.5");
        Mahasiswa18 m3 = new Mahasiswa18("125", "Sofi", "2A", "3.1");
        Mahasiswa18 m4 = new Mahasiswa18("126", "Budi", "2A", "3.8");
        Mahasiswa18 m5 = new Mahasiswa18("127", "Ani", "2A", "3.9");

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebulum sorting");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.selectionSort();
        list.tampil();
    }
}
