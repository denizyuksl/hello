package day09_ForLoops_MethotOlusturma;

public class C12MethodOlusturma {
    public static void main(String[] args) {


        String str = "Sevim bak kim gelmis ?";

        str.toUpperCase();

        // method bize bir sonuc donduruyorsa 2 sekilde o sonucu kullanabiliriz

        // sadece o satirda, sonucu gormek istiyorsaniz, kalici bir degisiklik yapmayacakasaniz
        // direk yazdirabiliriz
        System.out.println(str.toLowerCase()); // sevim bak kim gelmis ?

        // veya degisikligin kalici olmasini istiyorsak
        // yeni halini kaydedebiliriz

        String strBuyukharf = str.toUpperCase();

        System.out.println(str); // Sevim bak kim gelmis ?
        System.out.println(strBuyukharf); // SEVIM BAK KIM GELMIS ?

        // Google === google  bug


    }

}
