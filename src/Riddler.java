/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Niko Madriz
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        int i = 0;
        int shift = 9;
        int ascii = 0;
        char newLetter = ' ';
        while (i < encrypted.length()) {
            if((int) encrypted.charAt(i) < 65 || (int) encrypted.charAt(i) > 122){
                decrypted += encrypted.charAt(i);
            }
            else {
                ascii = (int) encrypted.charAt(i) + 9;
                if(Character.isUpperCase(encrypted.charAt(i))){
                    if(ascii > 90){
                        newLetter = (char) ((((ascii - 65) + shift) % 26) + 'A');
                    }
                }
                else{
                    if(ascii > 122){
                        newLetter = (char) ((((ascii - 97) + shift) % 26) + 'a');
                    }
                }
                decrypted += newLetter;
            }
            i++;
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {

        String decrypted = "";
        String ascii = "";
        String dlet = "";
        int i = 0;
        while(i < encrypted.length()){
            if(encrypted.charAt(i) == ' '){
                i++;
                char c = (char) i;
                dlet += c;
                decrypted += dlet;
                dlet = "";
                ascii = "";
            }
            ascii += encrypted.charAt(i);
            i++;
        }
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        String temp = "";
        for (int i = 0; i < encrypted.length(); i++) {
            if (i % 8 == 0) {
                temp = encrypted.substring(i, i + 8);
                int ascii = Integer.parseInt(temp, 2);
                char dlet = (char) ascii;
                decrypted += dlet;
            }
        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
