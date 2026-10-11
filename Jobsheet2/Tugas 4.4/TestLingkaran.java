public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkar1 = new Lingkaran();
        
        lingkar1.phi = 3.14;
        lingkar1.r = 10.0;

        System.out.println("Jari-jari lingkaran\t: " + lingkar1.r);
        System.out.println("Luas lingkaran\t\t: " + lingkar1.hitungLuas());
        System.out.println("Keliling lingkaran\t: " + lingkar1.hitungKeliling());
    }
}
