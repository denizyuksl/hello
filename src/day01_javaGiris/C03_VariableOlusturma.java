package day01_javaGiris;

public class C03_VariableOlusturma {
    public static void main(String[] args) {
        int sayi = 20;
        System.out.println(sayi);
        System.out.println("sayi");
        int sayi2;
        sayi2 = 30;
        // java'da = atama işaretidir
       // ='in soluna sadece variable olur
        // java = isaretini görünce önce sağ tarafta degeri hesaplar
        //buldugu sonucu variable ye atar

        float sayiFl = 3.4f;
        // floatta  degere f veya F YAZILIR!
        float sayi3 = 20f;
        float sayi4 = 6f;
        System.out.println(sayi3/sayi4);
        double sayi5 = 20;
        double sayi6 = 3;
        System.out.println(sayi5/sayi6);
    }
}