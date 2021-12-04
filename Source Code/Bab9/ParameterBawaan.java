// Contoh parameter bawaan
//     yang diwujudkan dengan
//     pemuatan berlebih

public class ParameterBawaan {
    public static void main(String[] args) {
        System.out.println("Hasil pemisahBaris():");
        pemisahBaris();

        System.out.println("Hasil pemisahBaris(\"*\"):");
        pemisahBaris("*");

        System.out.println(
            "Hasil pemisahBaris(\"*--\", 5):");
        pemisahBaris("*--", 10);
    }

    public static void pemisahBaris(String pemisah, 
                                    int n) {
        for (int j = 0; j < n; j++)
            System.out.print(pemisah);

        System.out.println(); // Pindah baris
    } 

    public static void pemisahBaris(String pemisah) {
        int n = 10;  // Sebagai nilai bawaan
        for (int j = 0; j < n; j++)
            System.out.print(pemisah);

        System.out.println(); // Pindah baris
    } 

    public static void pemisahBaris() {
        String pemisah = "="; // Sebagai nilai bawaan
        int n = 10;           // Sebagai nilai bawaan
        for (int j = 0; j < n; j++)
            System.out.print(pemisah);

        System.out.println(); // Pindah baris
    } 

}
