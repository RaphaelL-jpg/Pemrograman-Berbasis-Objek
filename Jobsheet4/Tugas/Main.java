package Tugas;

public class Main {
    public static void main(String[] args) {
        // Membuat objek part untuk Aggregation
        Dokter drBudi = new Dokter("Budi Santoso", "Umum");
        
        // Membuat objek whole, Dokter di-inject (Aggregation), RuangPeriksa otomatis dibuat di dalam (Composition)
        Klinik klinikSehat = new Klinik("Sehat Selalu", drBudi);
        
        // Membuat objek untuk Dependency
        AlatTensi omron = new AlatTensi("Omron");
        
        // Eksekusi Dependency
        klinikSehat.periksaPasien("Andi", omron);
    }
}