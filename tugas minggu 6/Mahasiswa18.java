public class Mahasiswa18 {
    String nim, nama, kelas, ipk;

    Mahasiswa18(){

    }
    Mahasiswa18(String nim, String nama, String kelas, String ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi(){
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
