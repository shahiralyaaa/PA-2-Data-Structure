package PA2LinkedList;
import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        
        ManageList daftarBuku = new ManageList(); // Membuat objek linked list
        Scanner input = new Scanner(System.in); // Mengambil input dari user
        
        int pilih = 0;
        while (pilih != 5){ // Penggunaan while untuk menampilkan pilihan menu
            System.out.println("===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");

            System.out.print("Pilih Menu: ");
            pilih = input.nextInt();

            switch (pilih) {
            case 1: { // MENU UNTUK MENAMBAH BUKU
            input.nextLine(); 
            System.out.print("Masukkan Kode Buku: ");
            String kodeBuku = input.nextLine();

            System.out.print("Masukkan Judul Buku: ");
            String judul = input.nextLine();

            System.out.print("Masukkan Penulis: ");
            String penulis = input.nextLine();

            daftarBuku.pushBuku(kodeBuku, judul, penulis);
            break;
            }

            case 2: { // MENU UNTUK MENGHAPUS BUKU
            daftarBuku.popBuku();
            break;
            }

            case 3: { // MENU UNTUK MENCARI BUKU
            input.nextLine();
            System.out.print("Masukkan kode buku yang ingin dicari:");
            String kodeBuku = input.nextLine();
            
            daftarBuku.cariBuku(kodeBuku);
            break;
            }
            
            case 4: { // MENU UNTUK MENAMPILKAN BUKU
            daftarBuku.tampilkanBuku();
            break;
            }
                
            case 5: { // MENU UNTUK KELUAR DARI MENU
                System.out.println("Keluar dari menu pilihan");
                break;
            }
            default:
                System.out.println("Input tidak valid");
            }
            System.out.println();
        }
        input.close();
    }
}