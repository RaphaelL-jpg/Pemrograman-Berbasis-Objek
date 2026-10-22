package Tugas;

public class Klinik {
    private String namaKlinik;
    // 1. Aggregation: Atribut dokter di-inject dari luar
    private Dokter dokter; 
    // 2. Composition: Atribut ruang diinstansiasi langsung di dalam Klinik
    private RuangPeriksa ruang; 

    public Klinik(String namaKlinik, Dokter dokter) {
        this.namaKlinik = namaKlinik;
        
        // BUKTI AGGREGATION: Objek dokter dikirim lewat parameter, dibuat di luar class Klinik
        this.dokter = dokter; 
        
        // BUKTI COMPOSITION: Objek RuangPeriksa dibuat sendiri (new) oleh Klinik, tidak lewat parameter
        this.ruang = new RuangPeriksa("R-01"); 
    }

    // 3. BUKTI DEPENDENCY: AlatTensi hanya lewat parameter method, tidak jadi atribut class Klinik
    public void periksaPasien(String namaPasien, AlatTensi alat) {
        System.out.println("Klinik " + namaKlinik + " melayani pasien: " + namaPasien);
        System.out.println("Diperiksa oleh: " + dokter.info() + " di ruang " + ruang.getNomorRuang());
        alat.ukurTensi(namaPasien);
    }
}