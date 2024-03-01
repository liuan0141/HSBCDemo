package org.example.demo;

public class RemoveIdenticalCharsService extends AbstractIdenticalCharsService {
    public  String convert(String input) {
        if (input == null || input.length() <= 2) {
            return input;
        }
        matcher= pattern.matcher(input);
        sb = new StringBuilder();
        while (matcher.find()){
            matcher.appendReplacement(sb,"");
        }
        matcher.appendTail(sb);
        if(pattern.matcher(sb).find())
            return convert(sb.toString());
        return sb.toString();
    }

}
