// Pemeriksaan string kosong

public class StringKosong {
    public static void main (String[] args) {
        System.out.println("Pemeriksaan string kosong");
        System.out.println("-------------------------");

        String teks = "";

        System.out.println("Kosongkah? " + teks.isEmpty());

        teks = "ABC";
        System.out.println("Kosongkah? " + teks.isEmpty());

        teks = "";
        System.out.println("Kosongkah? " + teks.isEmpty());
    }
}    
        