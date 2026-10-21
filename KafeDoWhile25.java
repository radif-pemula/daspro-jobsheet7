import java.util.Scanner;
public class KafeDoWhile25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, hargaKopi = 12000, teh, hargaTeh = 7000, roti, hargaRoti = 20000, totalHarga;
        String namaPelanggan;
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batalkan' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batalkan")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.println("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga: Rp" + totalHarga);
            sc.nextLine();
        } while (true); 
     }   
}

