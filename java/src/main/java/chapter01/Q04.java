package chapter01;

public class Q04 {

    public static String replaceSpaces(char[] chars, int length){
        char empty = ' ';
        int emptySpaces = 0;

        for(char c : chars) {
            if (c == empty) {
                emptySpaces++;
            }
        }

        // if there are no empty spaces, the string shouldn't change, so return earlier
        if(emptySpaces == 0){
            return String.copyValueOf(chars);
        }

        char[] newText = new char[length + emptySpaces * 2];

        int newTextIndex = 0;
        for(int i = 0; i < length; i++){
            int newTextIndexStep = 1;

            if(chars[i] == empty){
                newText[newTextIndex] = '%';
                newText[newTextIndex+1] = '2';
                newText[newTextIndex+2] = '0';

                // bigger step here
                newTextIndexStep = 3;
            }
            else {
                newText[newTextIndex] = chars[i];
            }

            // increase the step for the new text accordingly
            newTextIndex += newTextIndexStep;
        }

        return String.copyValueOf(newText);
    }
}
