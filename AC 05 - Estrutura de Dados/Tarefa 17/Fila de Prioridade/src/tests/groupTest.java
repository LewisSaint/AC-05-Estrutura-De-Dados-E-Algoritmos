package tests;

import exceptions.EmptyPriorityQueueException;
import org.junit.jupiter.api.Test;
import pessoa.Pessoa;
import src.Entry;
import src.SortedListPriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class groupTest {

    @Test
    void test() {
        SortedListPriorityQueue <Integer, String> fila = new SortedListPriorityQueue();
        Entry<Integer,String> saida;

        saida = fila.insert(2, "Two");
        assertEquals("(2,Two)", saida.toString());

        saida = fila.insert(40, "Fourty");
        saida = fila.insert(25, "Fifty-Five");


        assertEquals("[(2,Two), (25,Fifty-Five), (40,Fourty)]",fila.toString());
        saida = fila.min();
        assertEquals("(2,Two)",saida.toString());


    }


}
