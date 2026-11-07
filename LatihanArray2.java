package array;
import java.util.Scanner;

public class LatihanArray2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] nama = new String[100];
        String[] jurusan = new String[100];
        String[] kelas = new String[100];

        int[] jumlahTiket = new int[100];
        int[] harga = new int[100];
        int[] bayar = new int[100];

        // Array harga tiket
        // Baris 0 = Bisnis
        // Baris 1 = Ekonomi
        // Kolom 0 = Bandung
        // Kolom 1 = Jakarta

        int[][] hargaTiket = {
            {40000, 60000},
            {20000, 40000}
        };

        int n;

        System.out.print("Masukkan jumlah pembeli: ");
        n = input.nextInt();
        input.nextLine();

        // Input data pembeli
        for (int i = 0; i < n; i++) {

            System.out.println("\nData Pembeli ke-" + (i + 1));

            System.out.print("Nama Pembeli : ");
            nama[i] = input.nextLine();

            System.out.print("Jurusan (Bandung/Jakarta): ");
            jurusan[i] = input.nextLine();

            System.out.print("Kelas (Bisnis/Ekonomi): ");
            kelas[i] = input.nextLine();

            System.out.print("Jumlah Tiket : ");
            jumlahTiket[i] = input.nextInt();
            input.nextLine();

            // Menentukan kolom jurusan
            int j;

            if (jurusan[i].equalsIgnoreCase("Bandung")) {
                j = 0;
            } else if (jurusan[i].equalsIgnoreCase("Jakarta")) {
                j = 1;
            } else {
                System.out.println("Jurusan tidak tersedia!");
                i--;
                continue;
            }

            // Menentukan baris kelas
            int k;

            if (kelas[i].equalsIgnoreCase("Bisnis")) {
                k = 0;
            } else if (kelas[i].equalsIgnoreCase("Ekonomi")) {
                k = 1;
            } else {
                System.out.println("Kelas tidak tersedia!");
                i--;
                continue;
            }

            // Mengambil harga dari array 2 dimensi
            harga[i] = hargaTiket[k][j];

            // Menghitung total pembayaran
            bayar[i] = harga[i] * jumlahTiket[i];
        }

        // Menampilkan hasil transaksi
        System.out.println("\n======================================================");
        System.out.printf("%-5s %-15s %-12s %-12s %-10s %-12s %-12s%n",
                "No", "Nama Pembeli", "Jurusan", "Kelas",
                "Jum Tiket", "Harga", "Bayar");

        System.out.println("======================================================");

        for (int i = 0; i < n; i++) {

            System.out.printf("%-5d %-15s %-12s %-12s %-10d Rp%-10d Rp%-10d%n",
                    (i + 1),
                    nama[i],
                    jurusan[i],
                    kelas[i],
                    jumlahTiket[i],
                    harga[i],
                    bayar[i]);
        }

        System.out.println("======================================================");
    }
}

