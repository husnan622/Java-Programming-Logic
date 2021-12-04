import java.util.Scanner;

public class TigaData {
    public static void main (String[] args) {
        Scanner kbd = new Scanner(System.in); 
        
        System.out.print("Masukkan 3 bilangan bulat: ");
        double varSatu = kbd.nextDouble();
        double varDua = kbd.nextDouble();
        double varTiga = kbd.nextDouble();
        
        System.out.println("varSatu =  " + varSatu);
        System.out.println("varDua  =  " + varDua);
        System.out.println("varTiga =  " + varTiga);
    }
}    
        