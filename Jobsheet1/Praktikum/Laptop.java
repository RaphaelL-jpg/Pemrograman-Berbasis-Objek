package Praktikum;

public class Laptop extends AlatElektronik {
    public String jenisVGA;
    public boolean modePerformaAktif = false;

    public void tekanFnQ() {
        modePerformaAktif = !modePerformaAktif;
        if (modePerformaAktif) {
            System.out.println("Shortcut Fn+Q ditekan: Mode Performa AKTIF!");
        } else {
            System.out.println("Shortcut Fn+Q ditekan: Mode Quiet/Normal AKTIF.");
        }
    }

    public void mainkanGame(String judul) {
        System.out.println("Sedang merender game " + judul + " menggunakan VGA " + jenisVGA);
    }

    @Override
    public void printInfo() {
        System.out.println("--- Info Laptop Gaming ---");
        super.printInfo();
        System.out.println("Kartu Grafis   : " + jenisVGA);
        System.out.println("Status Mode    : " + (modePerformaAktif ? "Performance" : "Normal"));
    }
}