// Pembuatan huruf A

import java.lang.Math;

public class HurufA {
    public static void main (String[] args) {
        char[] huruf = {
            0x3C, 0x24, 0x24, 0x7E,
            0x62, 0x62, 0x62, 0x00
        };

        for (int baris = 0; baris < 8; baris++) {
            int data = huruf[baris];
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

            System.out.println();
        }
    }
}    
        