package day21_varargs_stringBuilder;

import java.time.LocalDate;
import java.time.Period;

public class C01_TimePeriod {
    public static void main(String[] args) {


        LocalDate dogumTarihi = LocalDate.of(1992,11,28);
        LocalDate bugun = LocalDate.now();

        Period yasim = Period.between(dogumTarihi,bugun);

        System.out.println(yasim); // P30Y9M5D

        System.out.println(yasim.getYears()); // 30
        LocalDate dogumTarihi1= LocalDate.of(1991,8,14);
        LocalDate bugun1 =LocalDate.now();
        Period yas= Period.between(dogumTarihi1,bugun1);
        System.out.println(yas);//P32Y 1M 24D
    }
}
