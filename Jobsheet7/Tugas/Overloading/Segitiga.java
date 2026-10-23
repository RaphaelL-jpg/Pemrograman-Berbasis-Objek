package Tugas.Overloading;

public class Segitiga {
    private int sudut;

    // Overloading totalSudut dengan 1 parameter
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    // Overloading totalSudut dengan 2 parameter
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    // Overloading keliling dengan 3 parameter sisi (Segitiga sembarang/umum)
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloading keliling dengan 2 parameter sisi (Segitiga siku-siku, mencari sisi miring dengan Pythagoras)
    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
        return sisiA + sisiB + sisiC;
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();
        System.out.println("Total Sudut (sudutA=60) : " + s.totalSudut(60));
        System.out.println("Total Sudut (sudutA=60, sudutB=30) : " + s.totalSudut(60, 30));
        System.out.println("Keliling Segitiga (3, 4, 5) : " + s.keliling(3, 4, 5));
        System.out.println("Keliling Siku-siku (3, 4) : " + s.keliling(3, 4));
    }
}