package by.it_academy.homeworks.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegEx {
    public static void main(String[] args) {

        String emailAddress = "invalid@email";
        //String emailAddress = "username@domain.com";
        String regexPattern = "^(.+)@(\\S+)\\.(\\S+)$";

        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(emailAddress);

        if (matcher.matches()) {
            System.out.println("Email " + emailAddress + " is valid");
        }
    }
}