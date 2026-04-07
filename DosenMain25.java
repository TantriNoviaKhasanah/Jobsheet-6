import java.util.Scanner;

public class DosenMain25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen25 list = new DataDosen25();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection Sort)");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode  : ");
                    String kode = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Jenis Kelamin (L/P): ");
                    char jk = sc.next().charAt(0);
                    sc.nextLine();
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');

                    System.out.print("Usia  : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen25 d = new Dosen25(kode, nama, jenisKelamin, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (pilih != 5);
    }
}
