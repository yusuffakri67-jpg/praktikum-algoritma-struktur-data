public class TugasAntrianMain {
    public static void main(String[] args) {
        TugasQueueLinkedList antrian = new TugasQueueLinkedList();

        // Mendaftarkan data mahasiswa [cite: 319]
        antrian.enqueue(new TugasMahasiswa("22417201", "fakri"));
        antrian.enqueue(new TugasMahasiswa("22417202", "Budi"));
        antrian.enqueue(new TugasMahasiswa("22417203", "Siti"));

        antrian.display();
        System.out.println("--------------------");
        
        antrian.peek();
        System.out.println("--------------------");

        antrian.dequeue();
        System.out.println("--------------------");

        antrian.display();
    }
}
