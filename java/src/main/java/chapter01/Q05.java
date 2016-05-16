package chapter01;

public class Q05 {

    public static String compress(String original){
        int size = compressedSize(original);
        if(size >= original.length()){
            return original;
        }

        char[] compressed = new char[size];
        int j = 0;
        int count = 0;
        char current = original.charAt(0);

        for(int i=0; i<original.length(); i++){

            if(current == original.charAt(i)){
                count++;
            }
            else {
                compressed[j] = current;
                j++;
                char[] countChars = String.valueOf(count).toCharArray();
                for(int k=0; k<countChars.length; k++){
                    compressed[j+k] = countChars[k];
                }
                j += countChars.length;
                count = 1;
                current = original.charAt(i);
            }
        }

        compressed[j] = current;
        j++;
        char[] countChars = String.valueOf(count).toCharArray();
        for(int k=0; k<countChars.length; k++){
            compressed[j+k] = countChars[k];
        }
        return String.copyValueOf(compressed);
    }

    public static int compressedSize(String text){
        int size = 0;
        int count = 1;
        char current = text.charAt(0);

        for(int i=0; i<text.length(); i++){

            if(current == text.charAt(i)){
                count++;
            }
            else {
                size += (1 + String.valueOf(count).toCharArray().length);
                count = 1;
                current = text.charAt(i);
            }
        }
        return size + 1 + String.valueOf(count).toCharArray().length;
    }
}
