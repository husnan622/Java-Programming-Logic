// Penentuan tahun kabisat

import java.util.Scanner;

public class SikuSiku {
    public static void main (String[] args) {
        double a, b, c;

        Scanner kbd = new Scanner(System.in);
        System.out.print("Masukkan tiga nilai sisi segitiga: ");
        a = kbd.nextDouble();
        b = kbd.nextDouble(); 
        c = kbd.nextDouble();

        boolean segitigaSikuSiku = false;
        double toleransi = 0.00001;

        double jumlahKuadrat = a * a + b * b;
        double cKuadrat = c * c;
        if (jumlahKuadrat >= cKuadrat - toleransi &&
            jumlahKuadrat <= cKuadrat + toleransi)
            segitigaSikuSiku = true;
        else {
            jumlahKuadrat = a * a + c * c;
            double bKuadrat = b * b;
            if (jumlahKuadrat >= bKuadrat - toleransi &&
                jumlahKuadrat <= bKuadrat + toleransi)
                segitigaSikuSiku = true;
            else {
                jumlahKuadrat = b * b + c * c;
                double aKuadrat = a * a;
                if (jumlahKuadrat >= aKuadrat - toleransi &&
                    jumlahKuadrat <= aKuadrat + toleransi)
 	                segitigaSikuSiku = true;
            }
        }

        if (segitigaSikuSiku)
            System.out.println("Segitiga siku-siku");
        else
            System.out.println("Bukan segitiga siku-siku");
    }
}    
        