package PA2StackNQueue;
import java.util.Scanner;

// Class utama untuk menjalankan program Stack dan Queue
public class StackNQueue {
    public static void main(String[] args) {
        
        Queue antrian = new Queue(); // Membuat objek Queue (antrian pelanggan)
        Stack riwayat = new Stack(); // Membuat objek Stack (riwayat transaksi)
        Scanner input = new Scanner(System.in); // Scanner untuk input user

        int pilih = 0;

        // Perulangan menu sampai user memilih keluar (5)
        while (pilih != 5) {
            System.out.println("=== SISTEM KASIR TOKO ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Pelanggan");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");

            System.out.print("Pilih Menu: ");
            
            // Input pilihan menu
            pilih = input.nextInt();

            switch (pilih) {

                case 1: {
                    input.nextLine();

                    // Input data pelanggan
                    System.out.print("Masukkan Nomor Antrian: ");
                    String nomorAntrian = input.nextLine();

                    System.out.print("Masukkan Nama Pelanggan: ");
                    String namaPelanggan = input.nextLine();

                    System.out.print("Masukkan Total Harga: ");
                    int totalBelanja = input.nextInt();

                    // Tambahkan ke antrian
                    antrian.tambahAntrian(nomorAntrian, namaPelanggan, totalBelanja);
                    break;
                }
                
                case 2: {
                    // Layani pelanggan (dequeue + masuk ke stack)
                    antrian.layaniPelanggan(riwayat);
                    break;
                }
                
                case 3: {
                    // Tampilkan semua antrian
                    antrian.tampilkanAntrian();
                    break;
                }

                case 4: {
                    // Tampilkan riwayat transaksi (stack)
                    riwayat.tampilkanRiwayat();
                    break;
                }
            
                case 5: {
                    // Keluar dari program
                    System.out.println("Keluar dari menu pilihan");
                    break;
                }

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

            System.out.println(); 
        }

        input.close(); // menutup scanner
    }
}