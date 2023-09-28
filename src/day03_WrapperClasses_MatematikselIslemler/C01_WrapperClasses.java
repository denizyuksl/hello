package day03_WrapperClasses_MatematikselIslemler;

import java.util.concurrent.Callable;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        int sayi = 20;
        String  str = "Java";

        Integer sayi2=30;

        sayi = sayi2;
        sayi2 = sayi;

        char chr1 ='j';
        Character chr2 =chr1;


        //primitive data türleri ile o türün wrwpper class'i arasında geçis mumkundur.

        System.out.println(Integer.MIN_VALUE);

        String str1 = "34";
        String  str2 = "45";
        // soru: str1 ve str2 nin degerlerini matematiksel olarak toplayınız.

        System.out.println(str1+str2); //3445

        System.out.println((Integer.parseInt(str1) + Integer.parseInt(str2)));


        //eger bir strig sadece sayılardan oluşmuştugundan eminsek parsInt metodunu kullanabiliriz.

        chr1 = 'a';
        System.out.println(Character.isDigit(chr1));//false
        {

            System.out.println(Character.isLetter(chr1));//true


        }
        };

    }










