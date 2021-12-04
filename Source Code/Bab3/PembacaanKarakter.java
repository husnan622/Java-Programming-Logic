import java.util.Scanner;

public class PembacaanKarakter {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in); 
        
        System.out.print("Masukkan kata > 5 huruf: ");
        char karSatu = kbd.findInLine(".").charAt(0);
        char karDua = kbd.findInLine(".").charAt(0);
        String sisa = kbd.next();
        
        System.out.println("karSatu =  " + karSatu);
        System.out.println("karDua  =  " + karDua);
        System.out.println("sisa =  " + sisa);
    }
}    
        