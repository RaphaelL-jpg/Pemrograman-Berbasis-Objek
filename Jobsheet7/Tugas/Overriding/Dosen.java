package Tugas.Overriding;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan siang di kantin kampus.");
    }

    public void lembur() {
        System.out.println("Dosen sedang memeriksa tugas mahasiswa hingga larut malam.");
    }
}