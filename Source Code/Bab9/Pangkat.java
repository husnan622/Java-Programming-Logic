// Contoh penyelesaian x pangkat n
//     menggunakan pendekatan rekursif

public class Pangkat {
    public static void main(String[] args) {
        System.out.println("5^2 = " + pangkat(5, 2));
        System.out.println("2^8 = " + pangkat(2, 8));
    }

    public static int pangkat(int x, int n) {
        if (n == 1)
            return x;
        else
            return x * pangkat(x, n - 1);
    }
}
