package org.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractIdenticalCharsService {
    public String regex="([a-z])\\1{2,}";
    public Pattern pattern= Pattern.compile(regex);
    public StringBuilder sb= new StringBuilder();
    public Matcher matcher;

}
