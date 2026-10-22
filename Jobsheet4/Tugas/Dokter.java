package Tugas;

public class Dokter {
    private String nama;
    private String spesialis;

    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public String info() {
        return "Dr. " + nama + " (" + spesialis + ")";
    }
}