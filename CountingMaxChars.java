public class CountingMaxChars {

    public static void main(String[] args) {
        String inputString = "hello world";

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            int count = 0;

            for (int j = 0; j < inputString.length(); j++) {
                if (inputString.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println("'" + currentChar + "' appears " + count + " times.");
            }
        }
//        char[] charArray = inputString.toCharArray();
//        customCount(charArray);
//    }
//
//    public static void customCount(char[] inputArray) {
//        int[] charCount = new int[256]; // Assuming ASCII characters
//
//        for (char c : inputArray) {
//            charCount[c]++;
//        }
//
//        for (int i = 0; i < charCount.length; i++) {
//            if (charCount[i] > 1) {
//                System.out.println("'" + (char) i + "' appears " + charCount[i] + " times.");
//            }
//        }
    }
}


