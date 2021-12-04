// Contoh pengabungan string dengan join()

public class PenggabunganString {
    public static void main (String[] args) {
        System.out.println("Penggabungan string");
        System.out.println("-------------------");

        String kotaA = "Jakarta";
        String kotaB = "Kuala Lumpur";
        String kotaC = "Bangkok";
        String kotaD = "Amsterdam";

        String hasil = kotaA.join("-", kotaB, kotaC, kotaD);

        System.out.println("Hasil join(): " + hasil);
    }
}    
        