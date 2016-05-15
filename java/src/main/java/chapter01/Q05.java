package chapter01;

public class Q05 {

    public static String compress(String original){
        char[] compressed = new char[original.length()];

        char last = original.charAt(0);
        int count = 0;
        int compressedIndex = 0;
        for(int i = 0; i < original.length(); i++){
            if(original.charAt(i) == last){
                count++;
            } else {
                if(compressedIndex + 2 >= original.length()){
                    return original;
                }

                compressed[compressedIndex] = last;
                compressedIndex++;

                char[] countChars = String.valueOf(count).toCharArray();

                for(int j = 0; j < countChars.length; j++){
                    compressed[compressedIndex + j] = countChars[j];
                }

                count = 1;
                last = original.charAt(i);
            }
        }

        return String.copyValueOf(compressed);
    }
}
