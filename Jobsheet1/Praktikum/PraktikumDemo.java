package Praktikum;

public class PraktikumDemo {
    public static void main(String[] args) {
        
        // Instansiasi Objek 1
        Handphone hp = new Handphone();
        hp.merk = "Samsung Galaxy";
        hp.persentaseBaterai = 45;
        hp.isiDaya(20);
        hp.bukaAplikasi("Gojek");
        hp.printInfo();
        System.out.println();

        // Instansiasi Objek 2
        Tas tas = new Tas();
        tas.warna = "Hitam";
        tas.kapasitasBuku = 2;
        tas.masukkanBuku(3);
        tas.keluarkanBuku(1);
        tas.printInfo();
        System.out.println();

        // Instansiasi Objek 3 (Pewarisan)
        Laptop legion = new Laptop();
        legion.merk = "Lenovo Legion 5";
        legion.konsumsiDayaWatt = 230; 
        legion.jenisVGA = "RTX 3060";
        legion.nyalakan();
        legion.tekanFnQ();
        legion.mainkanGame("Cyberpunk 2077");
        legion.printInfo();
        System.out.println();

        // Instansiasi Objek 4 (Pewarisan)
        ProyektorLCD epson = new ProyektorLCD();
        epson.merk = "Epson EB-E500";
        epson.konsumsiDayaWatt = 327;
        epson.resolusiMaksimal = "XGA (1024 x 768)";
        epson.kecerahanLumens = 3300;
        epson.nyalakan();
        epson.aturFokus();
        epson.gantiSumberInput("HDMI");
        epson.printInfo();
    }
}