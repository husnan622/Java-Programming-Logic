// Contoh pembuatan kelas Segitiga

import java.lang.Math;

public class KelasSegitiga {
    public static void main (String[] args) {
        Segitiga segitigaX = new Segitiga(50, 40, 30);
        System.out.println("SegitigaX:");
        System.out.println("Luas     = " + 
                           segitigaX.perolehLuas());
        System.out.println("Keliling = " +
                           segitigaX.perolehKeliling());

        Segitiga segitigaY = new Segitiga
                                 (0, 40, 0, 0, 30, 0);
        System.out.println();
        System.out.println("segitigaY:");
        System.out.println("Luas     = " + 
                           segitigaY.perolehLuas());
        System.out.println("Keliling = " + 
                           segitigaY.perolehKeliling());
    }
}    

class Segitiga {
    private double sisiA, sisiB, sisiC;

    public Segitiga(double sisi1, double sisi2,
                    double sisi3) {
        sisiA = sisi1;
        sisiB = sisi2;
        sisiC = sisi3;
    }

    public Segitiga(int x1, int y1, int x2, int y2,
                   int x3, int y3) {
        sisiA = Math.sqrt((x1 - x2) * (x1 - x2) +
                          (y1 - y2) * (y1 - y2) );

        sisiB = Math.sqrt((x2 - x3) * (x2 - x3) +
                          (y2 - y3) * (y2 - y3) );

        sisiC = Math.sqrt((x1 - x3) * (x1 - x3) +
                          (y1 - y3) * (y1 - y3) );
    }

    public double perolehLuas() {
        double s = (sisiA + sisiB + sisiC) / 2;
        double luas = Math.sqrt(s * (s - sisiA) *
                               (s - sisiB) * (s - sisiC));

        return luas;
    }

    public double perolehKeliling() {
        return sisiA + sisiB + sisiC;
    }
}
