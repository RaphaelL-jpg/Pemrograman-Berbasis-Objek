package Praktikum;

public class AlatElektronik {
    public String merk;
    public int konsumsiDayaWatt;

    public void nyalakan() {
        System.out.println("Perangkat " + merk + " dinyalakan. Mengonsumsi " + konsumsiDayaWatt + " Watt.");
    }

    public void matikan() {
        System.out.println("Perangkat " + merk + " dimatikan.");
    }

    public void printInfo() {
        System.out.println("Merk Perangkat : " + merk);
        System.out.println("Konsumsi Daya  : " + konsumsiDayaWatt + " Watt");
    }
}