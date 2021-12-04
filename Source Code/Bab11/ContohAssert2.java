// Contoh penggunaan assert
//     Versi 2

import java.util.Scanner;

public class ContohAssert2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Usia anda: ");
        int usia = kbd.nextInt();

        assert usia >= 17;

        System.out.println("Usia Anda " + usia);
    }
}

