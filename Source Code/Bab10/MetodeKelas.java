// Contoh pembuatan kelas yang mengandung
//     metode statis

public class MetodeKelas {
    public static void main(String[] args) {
        String strUji = "Tes..Abutilion.";

        System.out.println(Teks.keKapital(strUji));
    }
}

class Teks {
    public static String keKapital(String st) {
        return st.toUpperCase();
    }
 }

