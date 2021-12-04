// Contoh pembuatan kelas BilanganBulat

public class KelasBilangan {
    public static void main (String[] args) {
        BilanganBulat bil = new BilanganBulat(2);
        System.out.println(bil.ganjil());
        System.out.println(bil.lebihBesarDaripada(3));
        System.out.println(bil.lebihKecilDaripada(3));
        System.out.println(bil.samaDengan(3));
    }
}    

class BilanganBulat {
    private int bilangan;

    public BilanganBulat(int bilangan) {
        this.bilangan = bilangan;
    }

    public boolean ganjil() {
        return bilangan % 2 == 1;
    }

    public boolean lebihBesarDaripada(int bilangan) {
        return this.bilangan > bilangan;
    }

    public boolean lebihKecilDaripada(int bilangan) {
        return this.bilangan < bilangan;
    }

    public boolean samaDengan(int bilangan) {
        return this.bilangan == bilangan;
    }
}

        