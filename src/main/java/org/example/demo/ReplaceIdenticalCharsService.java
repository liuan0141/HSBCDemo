package org.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceIdenticalCharsService implements IIdenticalCharsService{

    @Override
    public String apply(String input) {
        if (input == null || input.length() <= 2) {
            return input;
        }
        String regex = "(.)\\1{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        Map<String, String> letterMap = getAlphaMap();
        while (matcher.find()){
            if (letterMap.containsKey(String.valueOf(input.charAt(matcher.start()+1)))){
                matcher.appendReplacement(sb,letterMap.get(String.valueOf(input.charAt(matcher.start()+1))));
            }
        }
        matcher.appendTail(sb);
        if(pattern.matcher(sb).find())
            return apply(sb.toString());
        return sb.toString();
    }
    private static Map<String,String> getAlphaMap(){
        Map<String, String> letterMap = new HashMap<>();
        letterMap.put("a","");
        letterMap.put("b","a");
        letterMap.put("c","b");
        letterMap.put("d","c");
        letterMap.put("e","d");
        letterMap.put("f","e");
        letterMap.put("g","f");
        letterMap.put("h","g");
        letterMap.put("i","h");
        letterMap.put("j","i");
        letterMap.put("k","j");
        letterMap.put("l","k");
        letterMap.put("m","l");
        letterMap.put("n","m");
        letterMap.put("o","n");
        letterMap.put("p","o");
        letterMap.put("q","p");
        letterMap.put("r","q");
        letterMap.put("s","r");
        letterMap.put("t","s");
        letterMap.put("u","t");
        letterMap.put("v","u");
        letterMap.put("w","v");
        letterMap.put("x","w");
        letterMap.put("y","x");
        letterMap.put("z","y");
        return letterMap;
    }
}
