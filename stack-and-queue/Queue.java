package PA2StackNQueue;
// Class Queue untuk mengelola antrian pelanggan

public class Queue {

    // Pointer ke elemen depan (front) dan belakang (rear)
    SnQNode front;
    SnQNode rear;

    // Constructor untuk inisialisasi queue kosong
    Queue() {
        front = null;
        rear = null;
    }

    // Method untuk menambahkan pelanggan ke antrian (enqueue)
    public void tambahAntrian(String nomorAntrian, String namaPelanggan, int totalBelanja) {
        
        // Membuat node baru
        SnQNode newNode = new SnQNode(nomorAntrian, namaPelanggan, totalBelanja);

        // Jika antrian masih kosong
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Method untuk melayani pelanggan (dequeue)
    public void layaniPelanggan(Stack stack) {

        // Cek apakah antrian kosong
        if (front == null) {
            System.out.println("Tidak ada pelanggan");
            return;
        }

        // Cek apakah jumlah pelanggan sudah minimal 5
        if (size() < 5) {
            System.out.println("Minimal harus ada 5 pelanggan");
            return;
        }

        // Ambil data dari depan (FIFO)
        SnQNode dilayani = front;
        front = front.next;

        // Jika setelah dequeue antrian menjadi kosong
        if (front == null) {
            rear = null;
        }

        // Tampilkan pelanggan yang sedang dilayani
        System.out.println("Melayani pelanggan " + dilayani.nomorAntrian +
            " (" + dilayani.namaPelanggan + ")");

        // Simpan data ke stack sebagai riwayat transaksi
        stack.push(dilayani.nomorAntrian, dilayani.namaPelanggan, dilayani.totalBelanja);
        System.out.println("Transaksi disimpan ke riwayat");
    }

    // Method untuk menampilkan seluruh antrian
    public void tampilkanAntrian() {
        SnQNode current = front;
        int noAntri = 1;

        // Jika antrian kosong
        if (front == null) {
            System.out.println("Daftar antrian kosong");
            return;
        }

        System.out.println("Daftar Antrian");

        // Traversal dari front ke rear
        while (current != null) {
            System.out.println("No. " + noAntri +
                " | No. Antrian: " + current.nomorAntrian +
                " | Nama: " + current.namaPelanggan +
                " | Total Belanja: " + current.totalBelanja);

            current = current.next;
            noAntri++;
        }
    }

    // Method untuk menghitung jumlah pelanggan dalam antrian
    public int size() {
        int jumlah = 0;
        SnQNode current = front;

        // Hitung jumlah node
        while (current != null) {
            jumlah++;
            current = current.next;
        }
        return jumlah;
    }
}