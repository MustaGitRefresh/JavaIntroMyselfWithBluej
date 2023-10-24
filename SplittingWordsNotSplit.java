import java.util.Scanner;

public class SplittingWordsNotSplit {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine();
            String[] words = splitWords(sentence);
            for (String word : words) {
                System.out.println(word);
            }
        }

        public static String[] splitWords(String sentence) {
            int count = 0;
            boolean inWord = false;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ' || sentence.charAt(i) == '\t' || sentence.charAt(i) == '\n') {
                    inWord = false;
                } else if (!inWord) {
                    count++;
                    inWord = true;
                }
            }
            String[] words = new String[count];
            int index = 0;
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                if (c == ' ' || c == '\t' || c == '\n') {
                    if (word.length() > 0) {
                        words[index] = word.toString();
                        index++;
                        word.setLength(0);
                    }
                } else {
                    word.append(c);
                }
            }
            if (word.length() > 0) {
                words[index] = word.toString();
            }
            return words;
        }
    }

