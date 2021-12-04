// Dua metode dengan nama sama
//     untuk menggabungkan string

public class Penggabungan {
    public static void main(String[] args) {
        System.out.println(gabungkan(12, 34));
        System.out.println(gabungkan("12", "34"));
    }

    public static String gabungkan(int a, int b) {
        return String.valueOf(a) + String.valueOf(b);
    }

    public static String gabungkan(String a, String b) {
        return a + b;
    }
}
