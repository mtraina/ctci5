package chapter01;

import static java.util.Objects.isNull;

public class Q02 {

    public static String reverse(String text){
        if (isNull(text) || text.equals("")) {
            return text;
        }

        StringBuilder builder = new StringBuilder();
        for(int i = text.length() - 1; i >= 0; i--){
            builder.append(text.charAt(i));
        }
        return builder.toString();
    }
}
