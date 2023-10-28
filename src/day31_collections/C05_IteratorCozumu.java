package day31_collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class C05_IteratorCozumu {
    public static void main(String[] args) {


        int[] arr = {2, 4, 6, 4, 1, 2, 5, 7, 9, 4, 5, 7, 2, 6, 8, 2, 1};
        // tekrarsiz elementleri saklayan Set olusturdum
        //hashSet'le de yapabilirdik fark etmez
        Set<Integer> tekrarsiz=new TreeSet<>();
        // Arrayi set'e ekledim
        for (int element : arr) {
            tekrarsiz.add(element);
        }
        //ıterator olusturdum
        Iterator<Integer> iterator = tekrarsiz.iterator();
        // Iterator kullanarak tekrarsız elemanları yazdirdim
        while (iterator.hasNext()) {//yaninda eleman oldukca donguyu devam ettirdim
            System.out.print(iterator.next()+" ");



        }
        System.out.println("");
        System.out.println(Arrays.toString(arr));
    }







}

