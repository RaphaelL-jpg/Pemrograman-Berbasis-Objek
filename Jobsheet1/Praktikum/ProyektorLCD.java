package Praktikum;

public class ProyektorLCD extends AlatElektronik {
    public String resolusiMaksimal;
    public int kecerahanLumens;

    public void aturFokus() {
        System.out.println("Cincin fokus diputar. Tampilan proyeksi sekarang menjadi lebih tajam.");
    }

    public void gantiSumberInput(String sumberBari) {
        System.out.println("Sumber input proyektor dialihkan ke port: " + sumberBari);
    }

    @Override
    public void printInfo() {
        System.out.println("--- Info Proyektor LCD ---");
        super.printInfo();
        System.out.println("Resolusi Max   : " + resolusiMaksimal);
        System.out.println("Kecerahan      : " + kecerahanLumens + " Lumens");
    }
}