public class mahasiswaMain {
     public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa(null, null, 0, null);
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2109106048";
        mhs1.kelas = "TI-1A";
        mhs1.ipk = 3.55; 

        mhs1.tampilkaninformasi();
        mhs1.ubahkelas("TI-2B");
        mhs1.updateipk(3.85);
        mhs1.tampilkaninformasi();

        mahasiswa mhs2 = new mahasiswa("Annisa Nabila", "2109106049",3.25, "TI-1B");
        mhs2.tampilkaninformasi();
        mhs2.updateipk(3);
        mhs2.tampilkaninformasi();

        mahasiswa mhs3 = new mahasiswa("sasa", "2109106050",3.25, "TI-2A");
        mhs3.tampilkaninformasi();
        mhs3.updateipk(3);
        mhs3.tampilkaninformasi();
    }
     public static void tampilkaninformasi(mahasiswa mhs){
        System.out.println("Nama: " + mhs.nama);
        System.out.println("NIM: " + mhs.nim);
        System.out.println("IPK: " + mhs.ipk);
        System.out.println("Kelas: " + mhs.kelas);
     }
}
