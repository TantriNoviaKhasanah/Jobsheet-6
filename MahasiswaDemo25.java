import java.util.Scanner;

public class MahasiswaDemo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = Integer.parseInt(sc.nextLine());

        MahasiswaBerprestasi25 list = new MahasiswaBerprestasi25(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            System.out.println("----------------------------");
            list.tambah(new Mahasiswa25(nim, nama, kelas, ipk));
        }

        list.tampil();

        // ================= SEQUENTIAL SEARCH =================
        System.out.println("----------------------");
        System.out.println("Pencarian data");
        System.out.println("----------------------");
        System.out.print("Masukkan IPK yang dicari: ");

        double cari = Double.parseDouble(sc.nextLine());

        System.out.println("Menggunakan sequential searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        // ================= BINARY SEARCH =================
        list.bubbleSort(); // WAJIB (descending)

        System.out.println("-----------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------");
        System.out.print("Masukkan IPK yang dicari: ");

        cari = Double.parseDouble(sc.nextLine());

        System.out.println("-----------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-----------------------------");

        int posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);
    }
}

// while (true) {
// try {
// ipk = sc.nextDouble();
// sc.nextLine();
// break;
// } catch (Exception e) {
// System.out.print("Input IPK harus angka! Ulangi: ");
// sc.nextLine();
// }
// }

// System.out.println("------------------------------");

// Mahasiswa25 m = new Mahasiswa25(nim, nama, kelas, ipk);
// list.tambah(m);
// }

// System.out.println("\nData Mahasiswa Sebelum Sorting:");
// list.tampil();

// System.out.println("Data Mahasiswa Setelah Bubble Sort (DESC):");
// list.bubbleSort();
// list.tampil();

// System.out.println("Data Mahasiswa Setelah Selection Sort (ASC):");
// list.SelectionSort();
// list.tampil();

// System.out.println("Data yang sudah terurut menggunakan INSERTION SORT
// (ASC)");
// list.insertionSort();
// list.tampil();
