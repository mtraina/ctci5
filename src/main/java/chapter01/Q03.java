package chapter01;

import java.util.Arrays;

import static java.util.Objects.isNull;

public class Q03 {
    public static boolean isPermutation(String first, String second){
        if(isNull(first) || isNull(second)){
            return false;
        }
        if(first.length() != second.length()) {
            return false;
        }

        return Arrays.equals(
                first.chars().boxed().sorted().toArray(),
                second.chars().boxed().sorted().toArray());
    }
}
