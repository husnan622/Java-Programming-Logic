// Penanganan bilangan kompleks

public class Kompleks {
    public static void main(String[] args) {
        BilKompleks bkX = new BilKompleks(2, 1);
        BilKompleks bkY = new BilKompleks(3, -2);

        BilKompleks hasil = bkX.penjumlahan(bkY);
        System.out.println("PENJUMLAHAN");
        System.out.println("Bagian real    : " +
                           hasil.perolehReal());
        System.out.println("Bagian imajiner: " +
                           hasil.perolehImajiner());

        hasil = bkX.pengurangan(bkY);
        System.out.println();
        System.out.println("PENGURANGAN");
        System.out.println("Bagian real    : " +
                           hasil.perolehReal());
        System.out.println("Bagian imajiner: " +
                           hasil.perolehImajiner());
    }
}

class BilKompleks {
    private double real;
    private double imaj;
   
    public BilKompleks(double x, double y) {
        real = x;
        imaj = y;
    }

    public double perolehReal() {
        return real;
    }

    public double perolehImajiner() {
        return imaj;
    }

    BilKompleks penjumlahan(BilKompleks x) {
        BilKompleks perantara = new BilKompleks(0, 0);

        perantara.real = real + x.perolehReal();
        perantara.imaj = imaj + x.perolehImajiner();

        return perantara;
    }

    BilKompleks pengurangan(BilKompleks x) {
        BilKompleks perantara = new BilKompleks(0, 0);

        perantara.real = real - x.perolehReal();
        perantara.imaj = imaj - x.perolehImajiner();

        return perantara;
    }
}
