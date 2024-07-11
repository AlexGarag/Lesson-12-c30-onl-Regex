package by.tmc.c30.lesson12regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordAnalyzer {
    public static void main(String[] args) {
        String password = "12@@fghA#";
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        System.out.println();
        if (matcher.find()) {
            System.out.println(password.substring(matcher.start(), matcher.end()) + " - valid password");
        } else {
            System.out.println("Invalid password!");
        }
    }
}
