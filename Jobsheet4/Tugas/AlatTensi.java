package Tugas;

public class AlatTensi {
    private String merk;

    public AlatTensi(String merk) {
        this.merk = merk;
    }

    public void ukurTensi(String namaPasien) {
        System.out.println("Mengukur tensi " + namaPasien + " menggunakan alat merk " + merk);
    }
}