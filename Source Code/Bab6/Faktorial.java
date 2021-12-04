// Perhitungan n faktorial

import java.util.Scanner;

public class Faktorial {
    public static void main (String[] args) {
        int n;

        System.out.println("Perhitungan n!");
        System.out.println("--------------");

        Scanner kbd = new Scanner(System.in);
        System.out.print("n = ");
        n = kbd.nextInt();

        int hasil = 1;

        for (int bil = 1; bil <= n; bil++)
            hasil = hasil * bil;

        System.out.println(n + "! = " + hasil);
    }
}    
        