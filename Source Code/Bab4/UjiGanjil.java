// Pengujian bilangan sebagai genap atau ganjil
//     dinyatakan dengan nilai logika

import java.util.Scanner;

public class UjiGanjil {
    public static void main (String[] args) {
        int bilangan;
        Scanner kbd = new Scanner(System.in);

        System.out.println(
           "Penentuan bilangan ganjil atau bukan");
        System.out.print("Bilangan bulat = ");
        bilangan = kbd.nextInt();

        boolean ganjil = bilangan % 2 == 1;
        System.out.println("Ganjil? " + ganjil);
    }
}    
        