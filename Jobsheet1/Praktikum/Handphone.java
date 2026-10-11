package Praktikum;

public class Handphone {
    public String merk;
    public int persentaseBaterai;

    public void isiDaya(int jumlah) {
        persentaseBaterai += jumlah;
        if (persentaseBaterai > 100) persentaseBaterai = 100;
        System.out.println("Daya diisi. Baterai sekarang: " + persentaseBaterai + "%");
    }

    public void bukaAplikasi(String namaApp) {
        persentaseBaterai -= 5;
        System.out.println("Membuka aplikasi " + namaApp + ". Baterai berkurang 5%.");
    }

    public void printInfo() {
        System.out.println("--- Info Handphone ---");
        System.out.println("Merk    : " + merk);
        System.out.println("Baterai : " + persentaseBaterai + "%");
    }
}