public class DoubleLinkedList18 {
    Node06 head;
    Node06 tail;

    public DoubleLinkedList18() {
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Mahasiswa06 data){
        Node06 newNode = new Node06(data);
        if (isEmpty()){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa06 data){
        Node06 newNode = new Node06(data);
        if (isEmpty()){
            head =tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void inserAfter(String keynim, Mahasiswa06 data){
        Node06 current = head;
        while (current != null && !current.data.nim.equals(keynim)){
            current = current.next;
        }
        if (current == null){
            System.out.println("Data dengan NIM" + keynim + "Tidak ditemukan");
            return;
        }

        Node06 newNode = new Node06(data);

        if (current == tail){
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keynim); 
    }
    public void print(){
            if (isEmpty()){
                System.out.println("Linked List masih kosong. ");
                return;
            }

            Node06 current = head;
            while (current != null){
                current.data.tampil();
                current = current.next;
            }

    }

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked List Kosong");
            return;
        }

        if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked List Kosong");
            return;
        }

        if (head == tail){
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
        
}
