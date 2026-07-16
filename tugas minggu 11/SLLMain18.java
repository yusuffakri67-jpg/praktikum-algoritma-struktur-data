public class SLLMain18 {
    public static void main(String[] args) {
        SingleLingkedList18 sll = new SingleLingkedList18();

        Mahasiswa18 mhs1 = new Mahasiswa18("21212203", "Dirga", "4O", 3.6);
        Mahasiswa18 mhs2 = new Mahasiswa18("22212202", "Cintia", "3C", 3.5);
        Mahasiswa18 mhs3 = new Mahasiswa18("23212201", "Bimon", "2B", 3.8);
        Mahasiswa18 mhs4 = new Mahasiswa18("24212200", "Alvaro", "1A", 4.0);

        // Percobaan 1
        System.out.println("--- Percobaan 1 ---");
        sll.print(); 
        
        sll.addFirst(mhs1);
        sll.addLast(mhs4);
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        // Percobaan 2
        System.out.println("--- Percobaan 2 (Akses & Hapus) ---");
        System.out.println("Data pada index 1: ");
        sll.getData(1);
        
        int idx = sll.indexOf("Bimon");
        System.out.println("Mahasiswa bernama Bimon berada pada index: " + idx);
        System.out.println();

        System.out.println("Menghapus data pertama dan terakhir...");
        sll.removeFirst();
        sll.removeLast();
        sll.print();

        System.out.println("Menghapus data pada index 0...");
        sll.removeAt(0);
        sll.print();
    }
}
