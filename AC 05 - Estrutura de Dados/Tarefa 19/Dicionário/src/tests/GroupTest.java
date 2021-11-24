package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import src.HashTableMultiMap;

public class GroupTest {


    @Test
    void test() {


        HashTableMultiMap<String, String > mapa = new HashTableMultiMap();

        mapa.put("Brasil", "Romario");
        assertEquals("[Brasil=Romario]",mapa.entrySet().toString());
        mapa.put("Italia","Cannavaro");
        assertEquals("[Brasil=Romario, Italia=Cannavaro]",mapa.entrySet().toString());

        mapa.put("Hungria","Puskas");

        assertEquals("[Brasil=Romario, Hungria=Puskas, Italia=Cannavaro]", mapa.entrySet().toString());
    }
}
