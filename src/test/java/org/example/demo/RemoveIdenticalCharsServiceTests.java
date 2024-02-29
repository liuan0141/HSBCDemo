package org.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RemoveIdenticalCharsServiceTests {
    public static String test(IIdenticalCharsService service,String input){
        return service.apply(input);
    }
    @Test
    void testRemoveConsecutiveIdenticalChars() {

        assertEquals("d", test(new RemoveIdenticalCharsService(),"aabvvvdddwwwwd555444ddcccbbad"));
        assertEquals("d", test(new RemoveIdenticalCharsService(),"aabcccbbad"));
        assertEquals("ad", test(new RemoveIdenticalCharsService(),"aaabbbad"));
        assertEquals("d", test(new RemoveIdenticalCharsService(),"aaad"));
        assertEquals("ab", test(new RemoveIdenticalCharsService(),"abccc"));
        assertEquals("abcc", test(new RemoveIdenticalCharsService(),"abcc"));

        assertEquals("", test(new RemoveIdenticalCharsService(),""));
        assertNull(test(new RemoveIdenticalCharsService(),null));
    }
}
