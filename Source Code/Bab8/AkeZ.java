// Pembentukan string berisi A hingga Z

public class AkeZ {
    public static void main (String[] args) {
        System.out.println("String ABCD..Z");
        System.out.println("--------------");

        String teks = ""; // String kosong

        for (char kar = 'A'; kar <= 'Z'; kar++) {
            teks = teks + kar;
        }

        System.out.println("teks = " + teks);
    }
}    
        