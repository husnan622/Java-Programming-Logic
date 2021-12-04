// Pembuatan metode untuk menghitung n!

public class NFaktorial {
    public static void main(String[] args) {
        System.out.println("4! = " + faktorial(4));
        System.out.println("6! = " + faktorial(6));
    }

    public static int faktorial(int n) {
        int hasil = 1;
        for (int bil = 1; bil <= n; bil++)
            hasil = hasil * bil;

        return hasil;
    }
}
