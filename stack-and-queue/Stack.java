package PA2StackNQueue;
// Class Stack untuk menyimpan riwayat transaksi (menggunakan linked list)

public class Stack {
    
    // Pointer ke node paling atas (top of stack)
    SnQNode top;

    // Constructor untuk inisialisasi stack kosong
    Stack () {
        top = null;
    }

    // Method untuk menambahkan data ke stack (push)
    public void push(String nomorAntrian, String namaPelanggan, int totalBelanja) {
        
        // Membuat node baru
        SnQNode newNode = new SnQNode(nomorAntrian, namaPelanggan, totalBelanja);
        
        // Node baru menunjuk ke node sebelumnya
        newNode.next = top;
        
        // Top dipindahkan ke node baru
        top = newNode;
    }

    // Method untuk menampilkan seluruh isi stack (riwayat transaksi)
    public void tampilkanRiwayat() {
        SnQNode current = top;
        int no = 1;

        System.out.println("===== Riwayat Transaksi =====");
        
        // Jika stack kosong
        if (top == null) {
            System.out.println("Data transaksi kosong");
            return;
        }

        // Traversal dari top ke bawah
        while (current != null) {
            System.out.println("No. " + no +
                " | No. Antrian: " + current.nomorAntrian +
                " | Nama: " + current.namaPelanggan +
                " | Total Belanja: " + current.totalBelanja);
            
            current = current.next; // pindah ke node berikutnya
            no++;
        }
    }
}