public class TestPeminjaman {
    public static void main(String[] args) {
        // Instansiasi object baru dari class Peminjaman
        Peminjaman pinjam1 = new Peminjaman();
        
        // Mengisi nilai atribut
        pinjam1.id = 1001;
        pinjam1.namaMember = "Andi";
        pinjam1.namaGame = "FIFA 2024";
        pinjam1.lamaSewa = 3;
        pinjam1.harga = 15000;
        
        // Memanggil method untuk menampilkan data
        pinjam1.tampilDataPeminjaman();
    }
}