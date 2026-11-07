package array;
import java.util.Scanner;

public class LatihanArray1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] nim = new String[100];
        String[] nama = new String[100];
        double[] uts = new double[100];
        double[] uas = new double[100];
        double[] nilaiAkhir = new double[100];
        String[] index = new String[100];

        int n;

        System.out.print("Masukkan jumlah mahasiswa: ");
        n = input.nextInt();
        input.nextLine();

        // Input data mahasiswa
        for (int i = 0; i < n; i++) {

            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            nim[i] = input.nextLine();

            System.out.print("Nama: ");
            nama[i] = input.nextLine();

            System.out.print("Nilai UTS: ");
            uts[i] = input.nextDouble();

            System.out.print("Nilai UAS: ");
            uas[i] = input.nextDouble();
            input.nextLine();

            // Menghitung nilai akhir
            nilaiAkhir[i] = (uts[i] * 0.5) +
                            (uas[i] * 0.5);

            // Menentukan index
            if (nilaiAkhir[i] >= 80) {
                index[i] = "A";
            } else if (nilaiAkhir[i] >= 70) {
                index[i] = "B";
            } else if (nilaiAkhir[i] >= 60) {
                index[i] = "C";
            } else if (nilaiAkhir[i] >= 50) {
                index[i] = "D";
            } else {
                index[i] = "E";
            }
        }

        
        // Menampilkan hasil sesuai soal
        System.out.println();
        System.out.println("==============================================================");

        System.out.printf("%-5s %-10s %-15s %-8s %-8s %-15s %-8s%n",
                "No", "Nim", "Nama", "UTS", "UAS",
                "Nilai Akhir", "Index");

        System.out.println("==============================================================");

        for (int i = 0; i < n; i++) {

            System.out.printf("%-5d %-10s %-15s %-8.0f %-8.0f %-15.1f %-8s%n",
                    (i + 1),
                    nim[i],
                    nama[i],
                    uts[i],
                    uas[i],
                    nilaiAkhir[i],
                    index[i]);
        }

        System.out.println("==============================================================");

        input.close();
    }
}

