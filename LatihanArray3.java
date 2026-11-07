package array;
import java.util.Scanner;

public class LatihanArray3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaPembeli, kodeBarang;
        String namaBarang = "";
        int jumlah;
        long harga = 0, total;

        System.out.print("Masukkan jumlah pembeli: ");
        int banyak = input.nextInt();
        input.nextLine();

        System.out.println("\n========== INPUT DATA PENJUALAN ==========");

        for (int i = 1; i <= banyak; i++) {
            System.out.println("\nData Pembeli ke-" + i);

            System.out.print("Nama Pembeli : ");
            namaPembeli = input.nextLine();

            System.out.print("Kode Barang  : ");
            kodeBarang = input.nextLine().toUpperCase();

            System.out.print("Jumlah       : ");
            jumlah = input.nextInt();
            input.nextLine();

            if (kodeBarang.equals("A01")) {
                namaBarang = "Hardisk";
                harga = 700000;
            } else if (kodeBarang.equals("B02")) {
                namaBarang = "Monitor";
                harga = 800000;
            } else if (kodeBarang.equals("C02")) {
                namaBarang = "Mouse";
                harga = 50000;
            } else {
                namaBarang = "Kode tidak ditemukan";
                harga = 0;
            }

            total = harga * jumlah;

            System.out.println("\n========== HASIL PENJUALAN ==========");
            System.out.println("Nama Pembeli : " + namaPembeli);
            System.out.println("Kode Barang  : " + kodeBarang);
            System.out.println("Nama Barang  : " + namaBarang);
            System.out.println("Jumlah       : " + jumlah);
            System.out.println("Harga Satuan : Rp" + harga);
            System.out.println("Total Harga  : Rp" + total);
        }

        input.close();
    }
}