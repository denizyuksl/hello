package day17_Constructors;

public class C04_HemsireRunner {

    public static void main(String[] args) {


        C03_Hemsire hemsire1= new C03_Hemsire();

        hemsire1.hemsireAdi= "Esra";
        hemsire1.hemsireAdresi="Yenimahalle";


      C03_Hemsire hemsire2 = new C03_Hemsire();

        System.out.println(hemsire2.HemsireTel);//null


        System.out.println(new C03_Hemsire().hemsireAdresi);//null

        // son oluşturduğumuz objeyi
        // atama yapamdigimiz için bir daha kullanamayiz.
        //bu tür objeler Java'daki Garbage Collector tarafından
        // toplanıp yok edilir.

        C03_Hemsire hemsire3;
        //hemsire3.method1();
        //System.out.println(hemsire3.hemsireAdresi);
        // initialize yapılmadigi için,herhangi bir variable degerini yazdiramaz
    }



}
