package Tugas;

import java.util.Scanner;

public class TestLogistikDinamis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nomor Resi: ");
        String resi = scanner.nextLine();
        System.out.print("Masukkan Nama Pemilik: ");
        String pemilik = scanner.nextLine();
        System.out.print("Masukkan Kapasitas Maksimal (kg): ");
        double kapasitas = scanner.nextDouble();

        Kontainer kontainer = new Kontainer(resi, pemilik, kapasitas);

        System.out.println("\nNama Pemilik Kontainer: " + kontainer.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainer.getKapasitasMaksimal() + " kg");

        // Contoh penambahan muatan dinamis
        System.out.print("\nMasukkan berat muatan yang ingin ditambahkan (kg): ");
        double tambah = scanner.nextDouble();
        System.out.println("Memasukkan muatan baru seberat " + tambah + " kg...");
        kontainer.tambahMuatan(tambah);
        System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");

        // Contoh penurunan muatan dinamis
        System.out.print("\nMasukkan berat muatan yang ingin diturunkan/dibongkar (kg): ");
        double turun = scanner.nextDouble();
        System.out.println("Membongkar muat/menurunkan barang seberat " + turun + " kg...");
        kontainer.turunkanMuatan(turun);
        System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");

        scanner.close();
    }
}