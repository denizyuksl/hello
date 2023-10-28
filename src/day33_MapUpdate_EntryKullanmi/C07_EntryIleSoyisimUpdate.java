package day33_MapUpdate_EntryKullanmi;

import day32_map.MapMethodDepo;

import java.util.Map;

public class C07_EntryIleSoyisimUpdate {

    public static void main(String[] args) {

        // okulMap'deki tum soyisimleri buyuk harf yapan bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        ogrenciMap = MapMethodDepo.soyisimleriBuyukHarfYap(ogrenciMap);

        System.out.println(ogrenciMap);

    }
}
