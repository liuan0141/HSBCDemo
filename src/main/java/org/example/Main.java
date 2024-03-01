package org.example;

import org.example.demo.IIdenticalCharsService;
import org.example.demo.RemoveIdenticalCharsService;
import org.example.demo.ReplaceIdenticalCharsService;

public class Main {

    public static void main(String[] args) {
        IIdenticalCharsService  removeTest = new RemoveIdenticalCharsService()::convert;
        IIdenticalCharsService replaceTest = new ReplaceIdenticalCharsService()::convert;

        System.out.println(removeTest.apply("aabcccbbad"));
        System.out.println(replaceTest.apply("abcccbad"));
    }
}