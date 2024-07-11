package by.tmc.c30.lesson12regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailAnalyzer {
    public static void main(String[] args) {
        String email = "test@tmc.c30.com";
        String regexPattern = "^(.+)@(\\S+)$";
        Pattern emailPattern = Pattern.compile(regexPattern);
        Matcher emailMatcher = emailPattern.matcher(email);
        System.out.println();
        if (emailMatcher.find()) {
            System.out.println(email + " is a valid email address");
        } else {
            System.out.println(email + " is a invalid email!");
        }
    }
}
