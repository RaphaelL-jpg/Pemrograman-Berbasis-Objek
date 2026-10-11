public class TestKaryawan {
    public static void main(String[] args) {
        Karyawan krywn = new Karyawan();
    
        krywn.id = "EMP-002";
        krywn.nama = "Ahmad Fauzi";
        krywn.jenisKelamin = "Laki-laki";
        krywn.jabatan = "Software Engineer";
        krywn.gaji = 7500000;
        krywn.tampilDataDiri();

        int totalGaji = krywn.lihatGaji();
        System.out.println("Jumlah Gaji\t: Rp " + totalGaji);
    }
}
