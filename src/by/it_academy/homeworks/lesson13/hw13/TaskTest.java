package by.it_academy.homeworks.lesson13.hw13;
//Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
public class TaskTest {
    public static void main(String[] args) {
        final String PATH_TO_FILE_1 = "resources/homework13.txt";
        final String PATH_TO_FILE_2 = "resources/ССП 1 лаба.docx";
        final String PATH_TO_FILE_3 = "resources/ghjk";


        System.out.println("Quantity of punctuation marks in files is " + TextFilesUtils.getQuantityOfPunctuationMarks(PATH_TO_FILE_1));
        System.out.println("Quantity of words in files is " + TextFilesUtils.getQuantityOfWords(PATH_TO_FILE_1)+"\n");

        System.out.println("Quantity of punctuation marks in files is " + TextFilesUtils.getQuantityOfPunctuationMarks(PATH_TO_FILE_2));
        System.out.println("Quantity of words in files is " + TextFilesUtils.getQuantityOfWords(PATH_TO_FILE_2)+"\n");

        System.out.println("Quantity of punctuation marks in files is " + TextFilesUtils.getQuantityOfPunctuationMarks(PATH_TO_FILE_3));
        System.out.println("Quantity of words in files is " + TextFilesUtils.getQuantityOfWords(PATH_TO_FILE_3)+"\n");
    }
}
