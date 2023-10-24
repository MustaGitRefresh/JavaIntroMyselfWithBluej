//    Pattern is
/*
 * S I M P L E
 * S I M P L
 * S I M P
 * S I M
 * S I
 * S
 * S I
 * S I M
 * S I M P
 * S I M P L
 * S I M P L E
 * */
public class PatternProgrammingQ24 {
//    pattern programming
public static void main(String[] args) {
    String fixedW = "SIMPLE";
    int length = fixedW.length();
    // Decrementing the 1 after each iteration and extracting substring and printing that
    for(int i=(length-1); i!=-1; i--){
        String decrementedW = fixedW.substring(0, (i+1));
        for(int l=0;l<decrementedW.length(); l++){
            System.out.print(decrementedW.charAt(l) + " ");
        }
        System.out.println();
    }
    for(int j=0; j<=length; j++){
        String incrementedW = fixedW.substring(0, j);
        if(incrementedW.length() <= 1){
            continue;
        }
        for(int k=0; k<incrementedW.length(); k++){
            System.out.print(incrementedW.charAt(k) + " ");
        }
        System.out.println();
    }
}
}
