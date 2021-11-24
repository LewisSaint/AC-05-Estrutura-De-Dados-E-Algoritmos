package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import source.BinarySearchTree;

public class GroupTest {

    @Test
    void test() {
        BinarySearchTree<Integer,String> arvore = new BinarySearchTree();

        arvore.put(25,"Pedro"); //idade das pessoas e nome
        arvore.put(19,"Joana");
        arvore.put(29,"Paulo");
        arvore.put(32,"Marcio");
        arvore.put(59,"Thais");

        assertEquals("((19)25(29(32(59))))",arvore.printExpression(arvore.root()));

        arvore.remove(32);

        assertEquals("((19)25(29(59)))",arvore.printExpression(arvore.root()));

        arvore.put(75, "Darcy");

        assertEquals("((19)25(29(59(75))))",arvore.printExpression(arvore.root()));

        assertEquals("[Joana, Pedro, Paulo, Thais, Darcy]", arvore.values().toString());


    }
}
