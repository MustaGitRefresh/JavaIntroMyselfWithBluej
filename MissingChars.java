import java.util.Scanner;

public class MissingChars {
    public static void main(String[] args) {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String word = scanner.nextLine().toLowerCase();
        char[] wordChars = word.toCharArray();

        // Remove spaces from word
        String modifiedWord = "";
        for (char c : wordChars) {
            if (c != ' ') {
                modifiedWord += c;
            }
        }

        // Sort the modifiedWord
        char[] sortedWordChars = modifiedWord.toCharArray();
        for (int i = 0; i < sortedWordChars.length - 1; i++) {
            for (int j = 0; j < sortedWordChars.length - i - 1; j++) {
                if (sortedWordChars[j] > sortedWordChars[j + 1]) {
                    char temp = sortedWordChars[j];
                    sortedWordChars[j] = sortedWordChars[j + 1];
                    sortedWordChars[j + 1] = temp;
                }
            }
        }

        // Find missing characters
        char[] checkList = new char[sortedWordChars[sortedWordChars.length - 1] - sortedWordChars[0] + 1];
        int index = 0;
        for (char c = sortedWordChars[0]; c <= sortedWordChars[sortedWordChars.length - 1]; c++) {
            boolean found = false;
            for (char w : sortedWordChars) {
                if (w == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                checkList[index] = c;
                index++;
            }
        }

        // Print missing characters
        char[] missingChars = new char[index];
        for (int i = 0; i < index; i++) {
            missingChars[i] = checkList[i];
        }
        String missingCharsStr = new String(missingChars);

        System.out.println("Missing characters: " + missingCharsStr);
    }
}
