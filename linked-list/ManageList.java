package PA2LinkedList;
// Class untuk mengelola linked list data buku

public class ManageList {
    ListNode head; // pointer ke node pertama (awal list)

    // Constructor untuk inisialisasi list kosong
    ManageList() {
        head = null;
    }

    // Method untuk menambahkan buku di akhir linked list (push ke belakang)
    public void pushBuku(String kodeBuku, String judul, String penulis) {
        // Validasi kode buku maksimal 5 karakter
        if (kodeBuku.length() > 5) {
            System.out.println("Kode Invalid");
            return;
        }

        // Membuat node baru
        ListNode newNode = new ListNode(kodeBuku, judul, penulis);

        // Jika list kosong, node baru jadi head
        if (head == null) {
            head = newNode;
        } else {
            // Traversal ke node terakhir
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Menambahkan node di akhir
            current.next = newNode;
        }
        System.out.println("Data buku berhasil ditambahkan");
    }

    // Method untuk menghapus buku terakhir (pop dari belakang)
    public void popBuku(){
        // Validasi minimal jumlah data
        if (size() < 5) {
            System.out.println("Data minimal harus 5 buku!");
            return;
        } else if (head == null) {
            System.out.println("Tidak ada data untuk dihapus");
            return;
        } else if (head.next == null) {
            // Jika hanya 1 node
            head = null;
        } else {
            // Mencari node sebelum terakhir
            ListNode current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            // Menghapus node terakhir
            current.next = null;
        }
        System.out.println("Data buku berhasil dihapus");
    }

    // Method untuk mencari buku berdasarkan kode buku
    public void cariBuku(String kodeBuku) {
        ListNode current = head;

        while (current != null) {
            if (current.kodeBuku.equalsIgnoreCase(kodeBuku)) {
                System.out.println("Buku ditemukan!");
                System.out.println("Kode Buku: " + current.kodeBuku);
                System.out.println("Judul Buku: " + current.judul);
                System.out.println("Penulis: " + current.penulis);
                return;
            }
            current = current.next;
        }
        System.out.println("Buku tidak ditemukan");
    }
    
    // Method untuk menampilkan seluruh data buku
    public void tampilkanBuku() {
        ListNode current = head;
        int noUrut = 1;

        System.out.println("Daftar Buku");
        while (current != null) {
            System.out.println("No. " + noUrut + 
                " | Kode: " + current.kodeBuku + 
                " | Judul: " + current.judul + 
                " | Penulis: " + current.penulis);
            current = current.next;
            noUrut++;
        }
        System.out.println("Total Buku: " + size());
    }

    // Method untuk menghitung jumlah node (jumlah buku)
    public int size() {
        int jumlah = 0;
        ListNode current = head;

        while (current != null) {
            jumlah++;
            current = current.next;
        }
        return jumlah;
    }
}