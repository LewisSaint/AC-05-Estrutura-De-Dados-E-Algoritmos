package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import commons.Entry;
import org.junit.jupiter.api.Test;
import heap.HeapPriorityQueue;

public class GroupTest {

    @Test
    void groupTest() {

        HeapPriorityQueue<String, String> heap = new HeapPriorityQueue();

        heap.insert("America","Brasil");
        heap.insert("America","Peru");
        heap.insert("America","Argentina");

        boolean P = heap.isEmpty();

        assertFalse(P);

        heap.removeMin();

        assertEquals("[null, [(America,Argentina),1], [(America,Peru),2]]",heap.toString());

    }
}
