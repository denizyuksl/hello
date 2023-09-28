package day02_scanner_DataCasting;

public class C06_ExplicitlyNarrowing {
    public static void main(String[] args) {

        int sayi = 20;
        byte byt =(byte ) sayi;
        System.out.println("20'nin byte olarak karsılıgı : " + byt);

        sayi = 130;
        byt =(byte) sayi;
        System.out.println("130'un byte olarak karsılıgı :" + byt);

        double dbl = 34.7;
        sayi = (int)dbl;
        System.out.println("34,7'nin int olarak degeri: " + sayi);

    }
}
