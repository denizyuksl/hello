package day03_WrapperClasses_MatematikselIslemler;

import java.util.Scanner;

public class C03_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        /*
        kullanıcıdan  3 basamaklı pozitif bir tamsayı alıp
        sayının rakamlar toplamini yazdirin.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı poitif bir tamsayı giriniz.");

        int girilenSayi =scanner.nextInt();

        int rakamlarToplamı = 0;
        int rakam = 0;
        rakam = girilenSayi %10;
        rakamlarToplamı = rakamlarToplamı + rakam;
        girilenSayi = girilenSayi /10;

        // girilen sayı 25 oldu rakam 7 oldu. rak top:7

        rakam = girilenSayi %10;
        rakamlarToplamı = rakamlarToplamı +rakam;
        girilenSayi = girilenSayi /10;
        // girilen sayı 2 rakam 5 rakamlar top:12

        rakam =girilenSayi %10;
        rakamlarToplamı = rakamlarToplamı +rakam;
        girilenSayi = girilenSayi/10; // 0,2  ==>0

        // sayı SIFIR olana kadar devam edecek!!!

        System.out.println("girilen sayının rakamları toplamı:" +rakamlarToplamı);

    }
}
