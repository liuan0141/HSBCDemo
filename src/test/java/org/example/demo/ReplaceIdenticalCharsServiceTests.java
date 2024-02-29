package org.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReplaceIdenticalCharsServiceTests {
    public static String test(IIdenticalCharsService service,String input){
        return service.apply(input);
    }
    @Test
    void testReplaceConsecutiveIdenticalChars() {

        assertEquals("d",test(new ReplaceIdenticalCharsService(),"aabcccbbad"));
        assertEquals("d",test(new ReplaceIdenticalCharsService(),"abbbad"));
        assertEquals("1122",test(new ReplaceIdenticalCharsService(),"1122"));
        assertEquals("11b22bbc",test(new ReplaceIdenticalCharsService(),"11ccc22aaabbc"));
        assertEquals("1122bbc",test(new ReplaceIdenticalCharsService(),"1122aaabbc"));
        assertEquals("vv",test(new ReplaceIdenticalCharsService(),"vv"));
        assertNull(test(new ReplaceIdenticalCharsService(),null));
        assertEquals("",test(new ReplaceIdenticalCharsService(),""));
    }
}
