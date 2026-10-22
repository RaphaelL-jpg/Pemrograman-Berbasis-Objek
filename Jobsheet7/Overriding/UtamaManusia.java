package Overriding;

class Manusia {
    public void bernafas() {
        System.out.println("Manusia sedang bernafas...");
    }

    public void makan() {
        System.out.println("Manusia sedang makan...");
    }
}

class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan siang di kantin kampus.");
    }

    public void lembur() {
        System.out.println("Dosen sedang memeriksa tugas mahasiswa hingga larut malam.");
    }
}

class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan mie instan di kos.");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur setelah begadang mengerjakan coding.");
    }
}

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