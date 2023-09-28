package day02_scanner_DataCasting;

import java.util.Scanner;


public class C01_Scanner {
    public static void main(String[] args) {

        //soru 1- kullanıcıdan uc farklı data turunde deger alıp,
        //        girilen degerleri aciklamalariyla yazdirin.


        // adım 1: scanner objesi oluşturun
        Scanner scanner = new Scanner(System.in);

        //adım 2: kullanıcıya ne istediginizi söyleyin.
        System.out.println("Lutfen isminizi giriniz");

        //adim 3: girilen bilgiye uygun valiable oluşturup data türüne uygun
        // next ....() ile bilgiyi alıp kaydedin
        String girilenIsim= scanner.next();// sadece ilk ismi alır

        System.out.println("Girdiğiniz isim:"+ girilenIsim);
        //String girilenIsim= scanner.nextLine();// birden fazla isim alır.

    }
}
