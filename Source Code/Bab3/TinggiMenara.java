import java.util.Scanner;
import java.lang.Math;

public class TinggiMenara {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in);

        double x, derajat;

        System.out.print("x = ");
        x = kbd.nextDouble();

        System.out.print("Sudut (dalam derajat) = ");
        derajat = kbd.nextDouble();

        double radian = Math.toRadians(derajat);
        double y = x * Math.tan(radian);

        System.out.printf("Tinggi menara = %.2f\n", y);
    }
}    
        