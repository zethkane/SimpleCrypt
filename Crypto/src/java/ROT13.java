import javax.swing.*;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    private Character cs;
    private Character cf;


    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {
        return getString(text);
    }

    public String encrypt(String text) {
        return getString(text);
    }

    public String decrypt(String text) {
        return getString(text);
    }

    private String getString(String text) {
        char[] convert = text.toCharArray();
        for (int i = 0; i < convert.length; i++) {
            char letter = convert[i];
            if ( letter >= 'a' && letter <= 'z') {
                if (letter > 'm'){
                    letter -= 13;
                } else {
                    letter += 13;
                }
            } else if (letter >= 'A' && letter <= 'Z'){
                if (letter >'M'){
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }
            convert[i] = letter;
        }
        return new String(convert);
    }

    public static String rotate(String s, Character c) {
        char[] converter = s.toCharArray();
        int shift = c - 'A';
        for (int i = 0; i < converter.length; i++) {
            char letter = converter[i];
            if (letter >= 'A' && letter <= 'Z'){
                if (letter >= c){
                    letter -= shift;
                } else {
                    letter += shift;
                }
            }
            converter[i] = letter;
        }
        return new String(converter);
    }

}
