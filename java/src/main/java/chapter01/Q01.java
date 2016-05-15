package chapter01;

import static java.util.Objects.isNull;

public class Q01 {

    // assumption: the text is (extended) ASCII encoded
    public static boolean isUniqueChars(String text){
        if(isNull(text) || text.length() > 256){
            return false;
        }

        boolean[] chars = new boolean[256];

        for(char c : text.toCharArray()) {
            int i = (int) c;
            if (chars[i]) {
                return false;
            } else {
                chars[i] = true;
            }
        }
        return true;
    }

    public static boolean isUniqueChars2(String text){
        if(isNull(text) || text.length() > 256){
            return false;
        }

        boolean[] chars = new boolean[256];

        return text.chars().boxed().map(i -> {
            if(chars[i]) return false;
            else {
                chars[i] = true;
                return true;
            }
        }).filter(b -> !b).findFirst().orElse(true);
    }
}
