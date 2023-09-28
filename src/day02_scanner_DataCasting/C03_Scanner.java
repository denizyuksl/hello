package day02_scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {


        // soru:5 kullanıcıdan ismini soyismini ve yasını alıp asagıdaki formatta yazdırın.
        //        girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen Isminizi Giriniz");
        char ilkharf = scanner.nextLine().charAt(0);

        System.out.println("lutfen soyisminizi Giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("lutfen yasınızı giriniz");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler:"  + ilkharf  +"  "+ soyisim+"   "+yas);



    }
}
