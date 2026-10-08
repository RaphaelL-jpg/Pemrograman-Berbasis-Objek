package Percobaan5;

public class Manager extends Karyawan{
    public int tunjangan;

    public Manager() {

    }
    public void tampilDatamanager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan\t: " + tunjangan);
        System.out.println("Total Gaji\t: " + (super.gaji + tunjangan));
        System.out.println();
    }
}
