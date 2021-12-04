// Konversi derajat ke radian

import java.util.Scanner;

public class DerajatKeRadian {
    public static void main (String[] args) {
        double derajat;
        
        Scanner kbd = new Scanner(System.in); 

        System.out.println("Konversi derajat ke radian");
        System.out.println("--------------------------");

        System.out.print("Derajat = ");
        derajat = kbd.nextDouble();

        // Derajat ke radian
        double radian = derajat * 0.017453277;

        // Tampilkan hasilnya
        System.out.println("Radian = " + radian);
    }
}    
        