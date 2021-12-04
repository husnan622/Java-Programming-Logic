// Penyajian huruf A hingga Z
//    menggunakan while

public class WhileAbjad {
    public static void main (String[] args) {
        char huruf;

        huruf = 'A';
        while (huruf <= 'Z') {
            System.out.print(huruf + " ");

            huruf = (char) ((int) huruf + 1);
        }

        System.out.println(); // Pindah baris
    }
}    
        