import java.util.Scanner;
public class tugas1PengelolaKafe {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;
        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, silakan masukkan ulang.");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            double hargaKotor = jumlahTiket * HARGA_TIKET;
            double potongan = hargaKotor * diskon;
            double hargaBayar = hargaKotor - potongan;
            System.out.printf("Diskon: %.0f%%%n", diskon * 100);
            System.out.printf("Total bayar pelanggan: Rp%.0f%n%n", hargaBayar);
            totalTiket += jumlahTiket;
            totalPenjualan += hargaBayar;
        } while (jumlahTiket != 0);
        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.printf("Total penjualan: Rp%.0f%n", totalPenjualan);
    }
}