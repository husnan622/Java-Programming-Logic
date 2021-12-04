// Pembuatan huruf A, B, dan C
//     menggunakan larik tiga dimensi

import java.lang.Math;

public class TigaHuruf {
    public static void main (String[] args) {
        char[][] huruf = {
            {0x3C, 0x24, 0x24, 0x7E,
             0x62, 0x62, 0x62, 0x00},             
            {0x7C, 0x24, 0x24, 0x3E,
             0x32, 0x32, 0x7E, 0x00},
            {0x3E, 0x22, 0x20, 0x60,
             0x60, 0x62, 0x7E, 0x00}
        };

        for (int kolom = 0; kolom < 8; kolom++) {
            for (int baris = 0; baris <3; baris++) {
                int data = huruf[baris][kolom];

                for (int posBit = 7; posBit >= 0; posBit--) {
                    int pembagi = (int) Math.pow(2, posBit);
                    int bit = data / pembagi;
                    if (bit == 1)
                        data = data - pembagi;

                    if (bit == 1)
                        System.out.print('\u2588');
                    else
                        System.out.print((char) 32);
                }

                // Beri jarak
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}    
        