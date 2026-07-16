public class mahasiswa {
        static String nama = "Dimas";
        static String nim = "123456789";
        static String jurusan = "Teknik Informatika";
        static double ipk = 3.75;
        static String kelas = "TI-1B";
    public static void tampilkaninformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
        System.out.println("Jurusan: " + jurusan);
    }
    public static void ubahkelas(String kelasBaru){
        kelas = kelasBaru;
    }
    static void updateipk(double ipkBaru){
        ipk = ipkBaru;
        if (ipk > 4.0) {
            ipk = 4.0;
        } else if (ipk < 0.0) {
            ipk = 0.0;
        }
    }
    static String nilaikinerja(){
        if (ipk >= 3.5) {
            return "Kinerja Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Kinerja Baik";
        } else if (ipk >= 2.5) {
            return " Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }
    }
    public mahasiswa( String nm,String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
   public static void main(String[] args) {
    tampilkaninformasi();

    ubahkelas("TI-1B");
            
    updateipk(3.85);
    System.out.println("Kinerja: " + nilaikinerja());

   }
}