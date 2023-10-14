package day17_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Runner {
    public static void main(String[] args) {
    /*
        Constructor bir class'tan obje oluşturmak istediğimizde o objeye oluşturdugu class'taki
        variable ve metotlarla ilgili  İLK atamayı(initialize) yapan yapidir.


         */

        C01 obj =new C01();
        System.out.println(obj.sayi);// 6

        // bana rastgele sayı lazim.
        obj.rastgeleSayiUret();// 862

        //bugün ne pişireyim?
        obj.bugunNePisireyim();// Makarna

        Scanner scanner =new Scanner(System.in);
        String str = new String("Java candir");
        List<Integer> sayilar = new ArrayList<>();

        C01         obj2             =              new               C01()        ;
//      class adi    obje adi    atama işareti    keyword           Constructor



    }



}
