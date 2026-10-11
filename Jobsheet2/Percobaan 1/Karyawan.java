public class Karyawan {
    public String id;
    public String nama;
    public String jenisKelamin;
    public String jabatan;
    public int gaji;

    public void tampilDataDiri() {
        System.out.println("ID Karyawan: " + id);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + jenisKelamin);
        System.out.println("Jabatan\t\t: " + jabatan);
        System.out.println("Gaji\t\t: Rp" + gaji);
    }

    public int lihatGaji() {
        return gaji;
    }
}
