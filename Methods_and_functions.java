import javax.sound.midi.Soundbank;

public class Methods_and_functions {
    public static void main(String[] args) {
        Methods_and_functions ob = new Methods_and_functions();
        String[] words = ob.split("This is the best bat");
        for (int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
    }
    public String[] split(String string) {
        int length = string.length();
        String[] splits = new String[length];
        String word = "";
        int place = 0;
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) != ' ') {
                word = word + string.charAt(i);
            }
            else if (i== (string.length()-1) && string.charAt(length-1) != ' '){
                splits[place] = word;
            }
            else {
                splits[place] = word;
                word = "";
                place++;
            }

        }
        return splits;
    }
}

