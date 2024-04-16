package by.it_academy.homeworks.lesson27;

import java.util.Scanner;

public class TaskN2 {
    public static boolean checkTyping(String inputStr, String keyPresses) {
        StringBuilder outputStr = new StringBuilder();
        int cursorPosition = 0;

        for (int i = 0; i < keyPresses.length(); i++) {
            char key = keyPresses.charAt(i);
            switch (key) {
                case '<':
                    if (keyPresses.startsWith("<delete>", i)) {
                        if (cursorPosition < outputStr.length()) {
                            outputStr.deleteCharAt(cursorPosition);
                        }
                        i += "<delete>".length() - 1;
                    } else if (keyPresses.startsWith("<bspace>", i)) {
                        if (cursorPosition > 0) {
                            outputStr.deleteCharAt(cursorPosition - 1);
                            cursorPosition--;
                        }
                        i += "<bspace>".length() - 1;
                    } else if (keyPresses.startsWith("<left>", i)) {
                        if (cursorPosition > 0) {
                            cursorPosition--;
                        }
                        i += "<left>".length() - 1;
                    } else if (keyPresses.startsWith("<right>", i)) {
                        if (cursorPosition < outputStr.length()) {
                            cursorPosition++;
                        }
                        i += "<right>".length() - 1;
                    }
                    break;
                default:
                    outputStr.insert(cursorPosition, key);
                    cursorPosition++;
                    break;
            }
        }
        return outputStr.toString().equals(inputStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr1 = sc.nextLine();
        String keyPresses1 = sc.nextLine();
        System.out.println(checkTyping(inputStr1, keyPresses1) ? "YES" : "NO");
    }
}

