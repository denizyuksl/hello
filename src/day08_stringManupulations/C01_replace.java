package day08_stringManupulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('a', 'q')); // Jqvq cqndir

        System.out.println(str.replace("Java", "Tava")); // Tava candir

        System.out.println(str.replace("Java", "X")); // X candir
        System.out.println("=====");
        System.out.println(str.replace('a','e'));
        System.out.println(str.replace("Java","Hava"));

        System.out.println(str.replace("x", "y")); // Java candir

        System.out.println(str.replace("a", "e").replace("i", "a"));
        // Jeve cendar

        System.out.println(str.replace("i", "a").replace("a", "e"));
        // Jeve cender
        System.out.println(str.replace("a", "e"));

        // degisecek metin sadece ilk deger icin degissin diyorsak
        // replace() yerine replaceFirst() kullanilir

        System.out.println(str.replaceFirst("a", "x")); // Jxva candir

        // regex : regular expressions : belirlenmis kisaltmalar
        // ilk harfi * yapalim
        System.out.println(str.replaceFirst("\\w", "*"));// *ava candir

        // varsa ilk string icindeki ilk rakami + yapalim
        str = "Java 44Candir";

        System.out.println(str.replaceFirst("\\d", "+")); // Java +4Candir

        System.out.println(str.replace("J", "k"));

    }
}


