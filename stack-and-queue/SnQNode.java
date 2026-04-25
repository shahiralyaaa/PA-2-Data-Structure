package PA2StackNQueue;
// Class node untuk Queue (Stack and Queue)
// Digunakan untuk menyimpan data setiap pelanggan dalam antrian
public class SnQNode {
    String nomorAntrian; // Nomor antrian pelanggan
    String namaPelanggan; // Nama pelanggan
    int totalBelanja; // Total belanja pelanggan
    SnQNode next; // Pointer ke node berikutnya (linked list)

    // Constructor untuk inisialisasi data node
    SnQNode (String nomorAntrian, String namaPelanggan, int totalBelanja) {
        this.nomorAntrian = nomorAntrian;
        this.namaPelanggan = namaPelanggan;
        this.totalBelanja = totalBelanja;
        this.next = null; // default: belum terhubung ke node lain
    }
}