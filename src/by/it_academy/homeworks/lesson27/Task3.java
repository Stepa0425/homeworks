package by.it_academy.homeworks.lesson27;

import java.util.Scanner;

public class Task3 {
    public static boolean checkTyping(String inputStr, String keyPresses) {
        StringBuilder typedStr = new StringBuilder();
        int cursorPosition = 0;

        for (char key : keyPresses.toCharArray()) {
            switch (key) {
                case '<':
                    if (cursorPosition > 0) cursorPosition--; // Перемещаем курсор влево, если это возможно
                    break;
                case '>':
                    if (cursorPosition < typedStr.length()) cursorPosition++; // Перемещаем курсор вправо, если это возможно
                    break;
                case '*':
                    if (cursorPosition > 0 && cursorPosition <= typedStr.length()) {
                        typedStr.deleteCharAt(cursorPosition - 1); // Удаляем символ перед курсором, если это возможно
                        cursorPosition--;
                    }
                    break;
                default:
                    typedStr.insert(cursorPosition, key); // Вставляем символ на позицию курсора
                    cursorPosition++;
                    break;
            }
        }

        return typedStr.toString().equals(inputStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr1 = sc.nextLine();
        String keyPresses1 = sc.nextLine();
        System.out.println(checkTyping(inputStr1, keyPresses1) ? "YES" : "NO");

    }
}

