package com.company.algorithms.dataStructures.Array;

import static org.junit.Assert.*;
import org.junit.Test;

class FindFirstUniqueElementTest {
    @Test
    public void testFirstNonRepeatedCharacter() {
        assertEquals('b', FindFirstUniqueElement.firstNonRepeatedCharacter("abcdefghija"));
        assertEquals('h', FindFirstUniqueElement.firstNonRepeatedCharacter("hello"));
        assertEquals('J', FindFirstUniqueElement.firstNonRepeatedCharacter("Java"));
        assertEquals('i', FindFirstUniqueElement.firstNonRepeatedCharacter("simplest"));
    }

    @Test
    public void testFirstNonRepeatingChar() {
        assertEquals('b', FindFirstUniqueElement.firstNonRepeatingChar("abcdefghija"));
        assertEquals('h', FindFirstUniqueElement.firstNonRepeatingChar("hello"));
        assertEquals('J', FindFirstUniqueElement.firstNonRepeatingChar("Java"));
        assertEquals('i', FindFirstUniqueElement.firstNonRepeatingChar("simplest"));
    }

    @Test
    public void testGetFirstNonRepeatedChar() {
        assertEquals('b', FindFirstUniqueElement.getFirstNonRepeatedChar("abcdefghija"));
        assertEquals('h', FindFirstUniqueElement.getFirstNonRepeatedChar("hello"));
        assertEquals('J', FindFirstUniqueElement.getFirstNonRepeatedChar("Java"));
        assertEquals('i', FindFirstUniqueElement.getFirstNonRepeatedChar("simplest"));
    }
}