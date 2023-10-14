package day25_inheritanceDataypeKullanimi_overriding;

public class H_Runner{


    public static void main(String[] args) {


        G_AvciKuslar kartal4 = new G_AvciKuslar();
     /*

           Ozellikler method olarak olusturulmussa

                -constructor ve data turu ayni ise
                 o class'dan aramaya baslayip, parent class'lara dogru devam ederiz
                 ilk buldugumuz method calistirilir

                 -constructor ve data turu ayni degil ise
                  data turu olan class'dan aramaya baslayip, parent class'lara dogru devam ederiz
                  eger method bulunursa, hemen calistirilmaz
                  o method'un constructor olan class'a kadar daha gunceli var mi kontrol edilir
                  daha guncel varsa guncel olan calisir

                   aramaya basladigimiz class'da ve parent class'larinda method bulunamazsa
                   child class'lara donulmez, guncel var mi bakilmaz
                   CTE olusur

         */

        kartal4.hareket();// G ucarlar
        kartal4.solunum();// F akcigerle
        kartal4.beslenme();// G et yerler
        kartal4.cogalma();// F yumurtayla cogalırlar
        kartal4.omur();// E yasar ve olurler
        kartal4.kanat();// F kanatlidir
        kartal4.gaga();// G sivri gagalidir
        kartal4.pence();// G pencelidirler

        F_Kuslar kartal5 = new G_AvciKuslar();
        kartal5.hareket();// G ucarlar
        kartal5.solunum();// F akcigerle
        kartal5.beslenme();// G et yerler
        kartal5.cogalma();// F yumurtayla cogalırlar
        kartal5.omur();// E yasar ve olurler
        kartal5.kanat();// F kanatlidir
        kartal5.gaga();// G sivri gagalidir
       // kartal5.pence();// CTE

        E_Hayvanlar kartal6= new G_AvciKuslar();
        kartal6.hareket();// G ucarlar
        kartal6.solunum();// F akcigerle
        kartal6.beslenme();// G et yerler
        kartal6.cogalma();// F yumurtayla cogalırlar
        kartal6.omur();// E yasar ve olurler
        //kartal6.kanat();// CTE
        //kartal6.gaga();// CTE
        //kartal6.pence();// CTE

        F_Kuslar kus1= new F_Kuslar();
        // constructor ve data türü ayni
        // kuslara gidip ilk buldugumu kullanırım
        kus1.hareket();// E hareket ederler
        kus1.solunum();// F akcigerle
        kus1.beslenme();// E beslenirler
        kus1.cogalma();// F yumurtayla cogalırlar
        kus1.omur();// E yasar ve olurler
        kus1.kanat();// F kanatlidir
        kus1.gaga();// F gagalı
        //kus1.pence();// CTE

        E_Hayvanlar kus2= new F_Kuslar();
        kus2.hareket();// E hareket ederler
        kus2.solunum();// F akcigerle
        kus2.beslenme();// E beslenirler
        kus2.cogalma();// F yumurtayla cogalırlar
        kus2.omur();// E yasar ve olurler
        //kus2.kanat();// CTE
        //kus2.gaga();// CTE
        //kus2.pence();// CTE


        E_Hayvanlar hayvanlar1 = new E_Hayvanlar();
        hayvanlar1.hareket();// E hareket ederler
        hayvanlar1.solunum();// E solunum yapar
        hayvanlar1.beslenme();// E beslenirler
        hayvanlar1.cogalma();// E  cogalırlar
        hayvanlar1.omur();// E yasar ve olurler
        //hayvanlar1.kanat();// CTE
        //hayvanlar1.gaga();// CTE
        //hayvanlar1.pence();// CTE





    }
}
