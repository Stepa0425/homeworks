package by.it_academy.homeworks.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice8 {
    public static void main(String[] args) {

//        String str = "adcfdf";
//        System.out.println(changeStr(str));
//        String str1 = "abcnew";
//        System.out.println(changeStr(str1));

        //System.out.println(getNormalStr("dasds sadasdas   asda asd asd      asd       asd      "));
        System.out.println(getMaxDigitsInRow("fsdf4333 5444678"));
    }

    //  Введите строку. Если она начинается на 'abc', то заменить их на 'www', иначе добавить в конец строки 'zzz'.
    public static String changeStr(String str) {
        String result;
        if (str.startsWith("abc")) {
            result = str.replace("abc", "www");
        } else {
            result = str + "zzz";
        }
        return result;
    }

    //Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами более одного пробела.
    // Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел.
    public static String getNormalStr(String str) {
        String resultStr;
        String demoResultStr = str.trim();
        resultStr = demoResultStr.replaceAll("\\s+", " ");
        return resultStr;
    }

    //    Введите строку (текст). Найдите наибольшее количество идущих подряд цифр.
    public static int getMaxDigitsInRow(String str) {
        int max = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            int currentValue = matcher.end() - matcher.start();
            if (max < currentValue) {
                max = currentValue;
            }
        }
        return max;
    }

}
