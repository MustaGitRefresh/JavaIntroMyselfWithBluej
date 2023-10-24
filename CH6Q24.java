// Making the program for making it capital the first letter and finding number of vowels and consonants
import java.util.Scanner;
public class CH6Q24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String text = sc.nextLine();
        String[] words;
        // Checking whether the string ends with ? or .
        char last_char = text.charAt(text.length() - 1);
        if(!(last_char == '?' || last_char == '.')){
            System.out.println("The sentence is not ending with ? or .");
            System.exit(0);
        }
        // Splitting the words from the text
        words = text.split(" ");
        for(int i=0; i<words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
        }
        text = String.join(" ", words);
        System.out.println(text);
        // Now counting vowels and consonants and words
        int words_count = words.length;
        int consonants = 0;
        int vowels = 0;
        String lowercaseS = text.toLowerCase();
        char[] characters = lowercaseS.toCharArray();
        for(int j=0; j<characters.length; j++){
            char c = characters[j];
            if (c >='a' && c <= 'z'){
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
        System.out.println("The total analysis are");
        System.out.println("The words are " + words_count);
        System.out.println("The vowels are " + vowels);
        System.out.println("The consonants are " + consonants);
    }
}

