// Contoh penggunaan equals() dan
//     equalsIgnoreCase()

public class PembandinganString {
    public static void main (String[] args) {
        String stA = "Bravo";
        String stB = "BRAVO";

        System.out.println("Pembandingan dengan equals(): ");
        System.out.println(stA + " sama dengan " + stB +
                           " -> " + stA.equals(stB));

        System.out.println();
        System.out.println(
            "Pembandingan dengan equalsIgnoreCase(): ");
        System.out.println(stA + " sama dengan " + stB +
                           " -> " + stA.equalsIgnoreCase(stB));
    }
}    
        