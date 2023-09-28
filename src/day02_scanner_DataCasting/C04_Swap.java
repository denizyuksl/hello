package day02_scanner_DataCasting;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {

        //Kullanıcıdan iki sayi alip
        //ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk tamsayıyı giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen ikinci tamsayıyı giriniz");
        int sayi2 = scanner.nextInt();

        System.out.println("Girdiginiz degerler: sayi1 =  "+ sayi1 +", sayı2 = "+ sayi2 );

        int boskova =0;
        boskova = sayi2;
        sayi2 = sayi1;
        sayi1 = boskova;

        System.out.println("Degistirilen  degerler: sayi1 =  "+ sayi1 +", sayı2 = "+ sayi2 );
    }
}
