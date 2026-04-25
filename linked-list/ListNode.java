package PA2LinkedList;
// Class untuk merepresentasikan node pada linked list
public class ListNode {
    String kodeBuku;   // menyimpan kode buku
    String judul;      // menyimpan judul buku
    String penulis;    // menyimpan nama penulis
    ListNode next;     // pointer ke node berikutnya

    // Constructor untuk inisialisasi data buku
    ListNode (String kodeBuku, String judul, String penulis){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null; // default tidak menunjuk ke node lain
    }
}