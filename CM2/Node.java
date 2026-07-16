public class Node {
    Pembeli pembeli;
    Pesanan pesanan;
    Node prev, next;

    // Konstruktor untuk menyimpan data pembeli (antrean)
    public Node(Pembeli p) {
        this.pembeli = p;
        this.next = this.prev = null;
    }

    // Konstruktor untuk menyimpan data pesanan
    public Node(Pesanan ps) {
        this.pesanan = ps;
        this.next = this.prev = null;
    }
}
