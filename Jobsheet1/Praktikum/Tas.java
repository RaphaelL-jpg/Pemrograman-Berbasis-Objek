package Praktikum;

public class Tas {
    public String warna;
    public int kapasitasBuku;

    public void masukkanBuku(int jumlah) {
        kapasitasBuku += jumlah;
        System.out.println(jumlah + " buku dimasukkan ke dalam tas.");
    }

    public void keluarkanBuku(int jumlah) {
        kapasitasBuku -= jumlah;
        if (kapasitasBuku < 0) kapasitasBuku = 0;
        System.out.println(jumlah + " buku dikeluarkan dari tas.");
    }

    public void printInfo() {
        System.out.println("--- Info Tas ---");
        System.out.println("Warna       : " + warna);
        System.out.println("Isi Tas     : " + kapasitasBuku + " buku");
    }
}