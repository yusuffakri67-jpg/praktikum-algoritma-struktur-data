class Mahasiswa {
    String nama;
    int nim;
    int tahunMasuk;
    int nilaiUTS;
    int nilaiUAS;

    Mahasiswa(String nama, int nim, int tahun, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahun;
        this.nilaiUTS = uts;
        this.nilaiUAS = uas;
    }

}
/**
 * Class NilaiAlgoritma untuk pengolahan nilai menggunakan BF dan DC
 */
class NilaiAlgoritma {
    
    /**
     * Mencari UTS Tertinggi menggunakan Divide and Conquer
     */
    int cariMaxUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int kiri = cariMaxUTS(mhs, l, mid);
        int kanan = cariMaxUTS(mhs, mid + 1, r);
        return (kiri > kanan) ? kiri : kanan;
    }

    /**
     * Mencari UTS Terendah menggunakan Divide and Conquer
     */
    int cariMinUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int kiri = cariMinUTS(mhs, l, mid);
        int kanan = cariMinUTS(mhs, mid + 1, r);
        return (kiri < kanan) ? kiri : kanan;
    }

    /**
     * Menghitung Rata-rata UAS menggunakan Brute Force
     */
    double hitungRataUAS(Mahasiswa[] mhs) {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS;
        }
        return total / mhs.length;
    }
}
