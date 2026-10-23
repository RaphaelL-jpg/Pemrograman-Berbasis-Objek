package Overriding;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan mie instan di kos.");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur setelah begadang mengerjakan coding.");
    }
}