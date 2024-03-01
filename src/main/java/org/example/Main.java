package org.example;

import org.example.demo.IIdenticalCharsService;
import org.example.demo.RemoveIdenticalCharsService;
import org.example.demo.ReplaceIdenticalCharsService;


public class Main {

    public static void main(String[] args) {
        IIdenticalCharsService removeTest = RemoveIdenticalCharsService::remove;
        IIdenticalCharsService replaceTest = ReplaceIdenticalCharsService::replace;

        System.out.println(removeTest.apply("aabcccbbad"));
        System.out.println(replaceTest.apply("abcccbad"));
    }
}