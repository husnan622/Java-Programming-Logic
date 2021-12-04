import java.util.Scanner;

public class MasukanUsia {
    public static void main (String[] args) {
        int usia;
        
        Scanner kbd = new Scanner(System.in); 
        System.out.print("Masukkan usia Anda: ");
        usia = kbd.nextInt();

        System.out.println("Terima kasih. " +
                           "Usia Anda tahun depan: " +
                           (usia + 1));
    }
}    
        