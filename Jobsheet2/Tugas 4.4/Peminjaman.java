public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaSewa;
    public int harga;

    public int hitungHargaBayar() {
        int total = lamaSewa * harga;
        return total;
    }

    public void tampilDataPeminjaman() {
        System.out.println("Id Peminjaman : " + id);
        System.out.println("Nama Member   : " + namaMember);
        System.out.println("Nama Game     : " + namaGame);
        System.out.println("Lama Sewa     : " + lamaSewa);
        System.out.println("Harga/hari    : " + harga);
        System.out.println("Total Bayar   : " + hitungHargaBayar());
    }
}
