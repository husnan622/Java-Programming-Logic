// Resistor paralel

import java.util.InputMismatchException;
import java.util.Scanner;

public class ResistorSub {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        try {
            System.out.print("R1 = ");
            int r1 = kbd.nextInt();

            System.out.print("R2 = ");
            int r2 = kbd.nextInt();

            System.out.print("R3 = ");
            int r3 = kbd.nextInt();

            if (r1 < 0 || r2 < 0 || r3 < 0)
                throw new Exception("Nilai R harus positif");

            if (r1 == 0 || r2 == 0 || r3 == 0)
                throw new Exception("Akan terjadi pembagian " +
                                    "dengan nol");

            int r =  (int) (1.0 / ( 1.0 / r1 + 
                                    1.0 / r2 + 1.0 / r3));

            // Tampilkan hasilnya
            System.out.println();
            System.out.println("R = " + r);
        }
        catch (ArithmeticException e) {
            System.out.println(
                "Terdapat R yang bernilai 0");
        }
        catch (InputMismatchException e) {
            System.out.println("R harus berupa bilangan");
        }
        catch (Exception e) {
            System.out.println("Terjadi eksepsi: ");
            System.out.println(e);
        }
    }
}

