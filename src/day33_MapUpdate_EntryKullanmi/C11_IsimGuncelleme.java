package day33_MapUpdate_EntryKullanmi;


import day32_map.MapMethodDepo;

import java.util.Map;

public class C11_IsimGuncelleme {
    public static void main(String[] args) {

        /*
         ogrenci numarasi verilen elemanin,
        ismini verilen yeni deger olarak update edin
         */
        Map<Integer,String> ogrenciMap= MapMethodDepo.okulMapDondur();
        ogrenciMap =MapMethodDepo.numaraIleIsimUpdate(ogrenciMap,105,"Nevfel");
        System.out.println(ogrenciMap.get(105));


    }

}
