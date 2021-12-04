// Pengujian ekspresi relasional

public class Relasional {
    public static void main (String[] args) {
        System.out.println("Pengujian relasional");
        System.out.println("--------------------");

        int a = 25, b = 23;

        System.out.println(a + " > " + b + "? " + 
                          (a > b));

        System.out.println(a + " == " + (b + 2) + "? " +
                           (a == b + 2));

        System.out.println(a + " != " + b + "? " + 
                           (a != b));

        System.out.println(a + " <= " + b + "? " + 
                           (a <= b));
    }
}    
        