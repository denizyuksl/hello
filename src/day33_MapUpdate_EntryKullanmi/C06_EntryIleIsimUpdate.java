package day33_MapUpdate_EntryKullanmi;

import day32_map.MapMethodDepo;

import java.util.Map;

public class C06_EntryIleIsimUpdate {
    public static void main(String[] args) {

        // Tum listeyi gozden gecirerek
        // isimleri ilk harfi buyuk, sonraki harfler kucuk olacak sekilde
        // update eden bir method olusturun

        Map<Integer, String> ogrenciMapi = MapMethodDepo.okulMapDondur();

        ogrenciMapi = MapMethodDepo.isimDuzenle(ogrenciMapi);

        System.out.println(ogrenciMapi);
    }
}
