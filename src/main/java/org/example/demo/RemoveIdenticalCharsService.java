package org.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveIdenticalCharsService {

    public static String remove(String input) {
        if (input == null || input.length() <= 2) {
            return input;
        }
        String regex = "(.)\\1{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder sb = new StringBuilder();
        while (matcher.find()){
            matcher.appendReplacement(sb,"");
        }
        matcher.appendTail(sb);
        if(pattern.matcher(sb).find())
            return remove(sb.toString());
        return sb.toString();
    }
}
