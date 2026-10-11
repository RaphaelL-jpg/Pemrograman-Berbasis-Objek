public class BarangTugas {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        float nilaiDiskon = (diskon / 100) * hargaDasar;
        float hargaJual = hargaDasar - nilaiDiskon;
        
        return (int) hargaJual;
    }
    public void tampilData() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: Rp " + hargaDasar);
        System.out.println("Diskon\t   : " + diskon + "%");
        System.out.println("Harga Jual : Rp " + hitungHargaJual());
    }
}
