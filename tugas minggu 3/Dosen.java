public class Dosen {
    public String kode;
    public String nama;
    public Boolean jenisKelamin; // True = Pria, False = Wanita
    public int usia;

    public Dosen(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
}

