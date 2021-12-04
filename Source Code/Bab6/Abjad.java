// Penyajian huruf A hingga Z
//    menggunakan do..while

public class Abjad {
    public static void main (String[] args) {
        char huruf;

        huruf = 'A';
        do {
            System.out.print(huruf + " ");

            huruf = (char) ((int) huruf + 1);
        } while (huruf <= 'Z');

        System.out.println(); // Pindah baris
    }
}    
        