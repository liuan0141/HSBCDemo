package org.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveIdenticalCharsServiceTests {
    @Test
    void testRemoveConsecutiveIdenticalChars() {
        IIdenticalCharsService removeTest = RemoveIdenticalCharsService::remove;

        assertEquals("d", removeTest.apply("aabvvvdddwwwwd555444ddcccbbad"));
        assertEquals("d", removeTest.apply("aabcccbbad"));
        assertEquals("ad", removeTest.apply("aaabbbad"));
        assertEquals("d", removeTest.apply("aaad"));
        assertEquals("ab", removeTest.apply("abccc"));
        assertEquals("abcc", removeTest.apply("abcc"));

        assertEquals("", removeTest.apply(""));
        assertNull(removeTest.apply(null));
    }
}
