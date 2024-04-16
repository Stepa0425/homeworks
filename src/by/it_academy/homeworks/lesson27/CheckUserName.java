
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUserName {
    public static void main(String[] args) throws IOException {
        final String REGEX_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        final String INPUT_PATH_FILE = "input.txt";
        final String OUTPUT_PATH_FILE = "output.txt";

        String userName, result;
        userName = readOfFile(INPUT_PATH_FILE);
        result = checkUserName(userName, REGEX_PATTERN);
        writeResult(OUTPUT_PATH_FILE, result);

    }

    public static String readOfFile(String filePath) {
        String line = null;
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            while ((line = br.readLine()) != null) {
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
        return line;
    }

    public static String checkUserName(String username, String regexPattern) {
        if (username == null) {
            return "NO";
        }
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches() ? "YES" : "NO";
    }

    public static void writeResult(String filePath, String result) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(result);
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
    }

}
