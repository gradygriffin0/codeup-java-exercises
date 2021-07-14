package warmup;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(splitString("hello this has a lot of spaces")));
    }
    public static String[] splitString(String stringToSplit){
        return stringToSplit.split(" ");
    }
}
