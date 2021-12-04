// Cara memperoleh bilangan terkecil dan terbesar
//     dari sejumlah bilangan

import java.util.Scanner;

public class MinMax {
    public static void main (String[] args) {
        System.out.println("Bilangan terkecil dan terbesar");
        System.out.println("==============================");

        float bilangan;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Bilangan (0 untuk mengakhiri) = ");
        bilangan = kbd.nextInt();

        float terkecil = 0, terbesar = 0;

        boolean pertama = true;
	    while (bilangan != 0) {
            if (pertama) {
                pertama = false;
                terkecil = bilangan;
                terbesar = bilangan;
            }
            else {
                if (terkecil > bilangan)
                    terkecil = bilangan;

                if (terbesar < bilangan)
                    terbesar = bilangan;
            }

            System.out.print("Bilangan = ");
            bilangan = kbd.nextFloat();
	    }

	    if (pertama)
            System.out.println("Data tidak ada");
        else {
	        System.out.println();
	        System.out.println("Terkecil = " + terkecil);
	        System.out.println("Terbesar = " + terbesar);
        }
    }
}    
        