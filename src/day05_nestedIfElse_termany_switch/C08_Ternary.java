package day05_nestedIfElse_termany_switch;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {


        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        /*
            buyuk olmayan demekle kucuk olan demek farklidir
            cunku 9 ve 9   verildiginde buyuk olmayan 9 dur ama
                                     kucuk olan ????

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();


        System.out.println( sayi1 > sayi2 ? sayi2 : sayi1);
    }
}
