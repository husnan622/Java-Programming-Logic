// Perwujudan metode bilPositif()

import java.util.InputMismatchException;
import java.util.Scanner;

public class BilPositif {
    public static void main(String[] args) {
        while (true) {
            try {
                int bilangan = bilPositif();

                // Tampilkan hasilnya
                System.out.println("Bilangan = " + bilangan);
                break; // Keluar dari while
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public static int bilPositif() throws Exception {
        try {
            Scanner kbd = new Scanner(System.in);
            System.out.print("Masukkan bilangan positif: ");
            int bil = kbd.nextInt();

            if (bil < 0)
                 throw new Exception(
                               "Bilangan harus positif");

            return bil;
        }
        catch (InputMismatchException e) {
            throw new Exception("Harus berupa bilangan");
        }
        catch (Exception e) {
            throw e;
        }
    }             
}

