public class Waktu {
    public static void main (String[] args) {
        int jam = 8;
        int menit = 9;
        int detik = 2;

        System.out.println(jam + ":" + menit +
                           ":" + detik);
        System.out.printf("%2d:%2d:%2d\n",
                          jam, menit, detik);
        System.out.printf("%02d:%02d:%02d\n",
                          jam, menit, detik);
    }
}    
        