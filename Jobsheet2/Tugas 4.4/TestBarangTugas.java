public class TestBarangTugas {
    public static void main(String[] args) {
        BarangTugas brg = new BarangTugas();

        brg.kode = "2001";
        brg.namaBarang = "Sepatu Sneakers";
        brg.hargaDasar = 200000;
        brg.diskon = 15.0f;
        brg.tampilData();
    }
}
