// Contoh pelewatan dengan nilai

public class PelewatanDenganNilai {
    public static void main(String[] args) {
        String warnaKesukaan = "Biru";

        System.out.println("Warna = " + warnaKesukaan);

        ubahArgumen(warnaKesukaan);
    
        System.out.println("Warna = " + warnaKesukaan);
    }

    public static void ubahArgumen(String warna) {
        System.out.println(
            "Warna semula di ubahArgumen() = " +
            warna);

        warna = "Merah";
        System.out.println(
            "Warna kini di ubahArgumen()   = " +
             warna);
    }
}
