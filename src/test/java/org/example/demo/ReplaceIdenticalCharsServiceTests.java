package org.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReplaceIdenticalCharsServiceTests {

    @Test
    void testReplaceConsecutiveIdenticalChars() {
        IIdenticalCharsService replaceTest = new ReplaceIdenticalCharsService()::convert;

        assertEquals("d",replaceTest.apply("aabcccbbad"));
        assertEquals("d",replaceTest.apply("abbbad"));
        assertEquals("vv",replaceTest.apply("vv"));
        assertEquals("c",replaceTest.apply("aabbcccaabbbc"));
        assertEquals("cc", replaceTest.apply("cc"));
        assertNull(replaceTest.apply(null));
        assertEquals("",replaceTest.apply(""));
    }
}
