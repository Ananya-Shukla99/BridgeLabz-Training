package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestingListManager {


    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 5);
        ListManager.addElement(list, 10);

        assertEquals(2, list.size());
        assertTrue(list.contains(5));
        assertTrue(list.contains(10));
    }
    
	@Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ListManager.removeElement(list, 2);

        assertEquals(2, list.size());
        assertFalse(list.contains(2));
        assertTrue(list.contains(1));
        assertTrue(list.contains(3));
    }
    
    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        assertEquals(0, ListManager.getSize(list));

        list.add(10);
        list.add(20);
        assertEquals(2, ListManager.getSize(list));
    }
}
