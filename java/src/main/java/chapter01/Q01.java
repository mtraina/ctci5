package chapter01;

import static java.util.Objects.isNull;

public class Q01 {

    public static boolean isUniqueChars(String text){
        if(isNull(text) || text.length() > 256){
            return false;
        }

        return true;
    }
}
