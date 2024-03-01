package org.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReplaceIdenticalCharsServiceTests {

    @Test
    void testReplaceConsecutiveIdenticalChars() {
        IIdenticalCharsService replaceTest = ReplaceIdenticalCharsService::replace;

        assertEquals("d",replaceTest.apply("aabcccbbad"));
        assertEquals("d",replaceTest.apply("abbbad"));
        assertEquals("1122",replaceTest.apply("1122"));
        assertEquals("11b22bbc",replaceTest.apply("11ccc22aaabbc"));
        assertEquals("1122bbc",replaceTest.apply("1122aaabbc"));
        assertEquals("vv",replaceTest.apply("vv"));
        assertNull(replaceTest.apply(null));
        assertEquals("",replaceTest.apply(""));
    }
}
