package org.example;

import org.example.demo.IIdenticalCharsService;
import org.example.demo.RemoveIdenticalCharsService;
import org.example.demo.ReplaceIdenticalCharsService;

public class Main {
    public static String test(IIdenticalCharsService service,String input){
        return service.apply(input);
    }

    public static void main(String[] args) {
        System.out.println(test(new RemoveIdenticalCharsService(),"aabcccbbad"));
        System.out.println(test(new ReplaceIdenticalCharsService(),"abcccbad"));
    }
}