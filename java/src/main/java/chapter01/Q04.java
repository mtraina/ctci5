package chapter01;

import java.util.Arrays;
import java.util.stream.StreamSupport;

import static java.util.Objects.isNull;

public class Q04 {
    public static String replaceSpaces(String text){
        if(isNull(text)){
            return null;
        }

        char empty = ' ';
        Long emptySpaceNum = text.chars()
                .mapToObj(i -> (char)i)
                .filter(c -> c == empty)
                .count();

        char[] newText = new char[text.length() + emptySpaceNum.intValue() * 2];

        for(int i = 0; i < text.length() - 1; i++){
            if(text.charAt(i) == empty){
                newText[i] = '%';
                newText[i+1] = '2';
                newText[i+2] = '0';
            }
            else {
                newText[i] = text.charAt(i);
            }
        }

        return String.copyValueOf(newText);
    }
}
