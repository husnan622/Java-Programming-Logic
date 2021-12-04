// Contoh pembuatan kelas PersegiPanjang

public class KelasPersegi {
    public static void main (String[] args) {
        PersegiPanjang x = new PersegiPanjang(10, 20);
        System.out.println("PersegiPanjang(10, 20)");
        System.out.println("Luas     = " + 
                           x.perolehLuas());
        System.out.println("Keliling = " + 
                           x.perolehKeliling());

        PersegiPanjang y = new PersegiPanjang(10);
        System.out.println();
        System.out.println("PersegiPanjang y(10)");
        System.out.println("Luas     = " + 
                           y.perolehLuas());
        System.out.println("Keliling = " + 
                           y.perolehKeliling());

        PersegiPanjang z = new PersegiPanjang();
        System.out.println();
        System.out.println("PersegiPanjang z()");
        System.out.println("Luas     = " + 
                           z.perolehLuas());
        System.out.println("Keliling = " + 
                           z.perolehKeliling());
    }
}

class PersegiPanjang {
    private double lebar, tinggi;
    
    public PersegiPanjang(double lebar, double tinggi) {
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public PersegiPanjang(double lebar) {
        this.lebar = lebar;
        this.tinggi = lebar;
    }

    public PersegiPanjang() {
        this.lebar = 1;
        this.tinggi = 1;
    }

    public double perolehLuas() {
        return lebar * tinggi;
    }

    double perolehKeliling() {
        return 2 * (lebar + tinggi);
    }
}
