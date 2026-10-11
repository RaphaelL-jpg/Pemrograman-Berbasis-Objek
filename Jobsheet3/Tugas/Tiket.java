package Tugas;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran;

    public Tiket(String judulFilm, double hargaDasar) {
        this.judulFilm = judulFilm;
        if (hargaDasar < 0) {
            this.hargaDasar = 35000;
        } else {
            this.hargaDasar = hargaDasar;
        }
        this.statusPembayaran = false; // Default belum dibayar
    }

    public String getJudulFilm() {
        return judulFilm;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    // Menggunakan standar penamaan is... untuk tipe data boolean (Read-Only)
    public boolean isStatusPembayaran() {
        return statusPembayaran;
    }

    public void lakukanPembayaran() {
        this.statusPembayaran = true;
    }
}