package by.it_academy.homeworks.hw8.tasks.t2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String IPAddress = "105.2.14.6";
        final String ipAddressOctetRegex = "([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
        final String point = "\\.";
        String regexPattern = "^" + ipAddressOctetRegex + point +
                                    ipAddressOctetRegex + point +
                                    ipAddressOctetRegex + point +
                                    ipAddressOctetRegex + "$";

        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(IPAddress);

        if (matcher.matches()) {
            System.out.println("IP Address " + IPAddress + " is valid");
        } else {
            System.out.println("No(");
        }
    }
}
