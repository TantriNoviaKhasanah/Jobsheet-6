import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25();

        System.out.println("=== INPUT DATA MAHASISWA ===");

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = 0;

            // biar ga error kayak tadi
            while (true) {
                try {
                    ipk = sc.nextDouble();
                    sc.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.print("Input IPK harus angka! Ulangi: ");
                    sc.nextLine();
                }
            }

            System.out.println("------------------------------");

            Mahasiswa25 m = new Mahasiswa25(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData Mahasiswa Sebelum Sorting:");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Bubble Sort (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Selection Sort (ASC):");
        list.SelectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}