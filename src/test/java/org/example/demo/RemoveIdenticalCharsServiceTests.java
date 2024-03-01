package org.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveIdenticalCharsServiceTests {
    @Test
    void testRemoveConsecutiveIdenticalChars() {
        IIdenticalCharsService removeTest = new RemoveIdenticalCharsService()::convert;

        assertEquals("d", removeTest.apply("aabvvvdddwwwwdddcccbbad"));
        assertEquals("d", removeTest.apply("aabcccbbad"));
        assertEquals("ad", removeTest.apply("aaabbbad"));
        assertEquals("d", removeTest.apply("aaad"));
        assertEquals("ab", removeTest.apply("abccc"));
        assertEquals("abcc", removeTest.apply("abcc"));
        assertEquals("cc", removeTest.apply("cc"));
        assertEquals("", removeTest.apply(""));
        assertEquals("###@@@", removeTest.apply("###@@@"));
        assertEquals("33222", removeTest.apply("33222"));
        assertNull(removeTest.apply(null));
    }
}
