package by.it_academy.homeworks.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {

        // 1 любой символ
        String stringPattern = ".";
        String value = "5";

        // 1 word
        /*String stringPattern = "\\w";
        String value = "b";*/

        // НЕ 1 word
        /*String stringPattern = "\\W";
        String value = "%";*/

        // 1 digit
        /*String stringPattern = "\\d";
        String value = "1";*/

        // НЕ 1 digit
        /*String stringPattern = "\\D";
        String value = "a";*/

        // 1 space
        /*String stringPattern = "\\s";
        String value = " ";*/
        // НЕ 1 space
        /*String stringPattern = "\\S";
        String value = "1";*/

        // 1 символ из a,b,c
        /*String stringPattern = "[abc]";
        String value = " ";*/

        // НЕ 1 символ из a,b,c
        /*String stringPattern = "[^abc]";
        String value = "a";*/

        // 1 символ из a-d
        /*String stringPattern = "[a-d]";
        String value = "a";*/

        // НЕ 1 символ из a-d
        /*String stringPattern = "[^a-d]";
        String value = "x";*/
        // 0 и более a
        /*String stringPattern = "a*";
        String value = "a";*/

        // 1 и более a
        /*String stringPattern = "a+";
        String value = "a";*/

        // 0 или 1 a
        /*String stringPattern = "a?";
        String value = "a";*/

        // ровно 5 a
        /*String stringPattern = "a{5}";
        String value = "aaaaa";*/

        // 2 и более a
        /*String stringPattern = "a{2,}";
        String value = "aaaaa";*/

        // от 2 до 4 a
        /*String stringPattern = "a{2,4}";
        String value = "aaaa";*/

        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(value);

        if (matcher.matches()) {
            System.out.println("Given string " + value + " matches the pattern " + stringPattern);
        }

    }
}