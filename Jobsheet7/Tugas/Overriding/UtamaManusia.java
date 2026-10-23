package Tugas.Overriding;

public class UtamaManusia {
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();

        System.out.println("=== Demonstrasi Objek Dosen ===");
        m1.bernafas();
        m1.makan(); // Memanggil method makan() versi Dosen (Overriding)

        System.out.println("\n=== Demonstrasi Objek Mahasiswa ===");
        m2.bernafas();
        m2.makan(); // Memanggil method makan() versi Mahasiswa (Overriding)
    }
}