package collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {
    public static void main(String[] args) {

        int[] intArray = {1, 2, 3};
        System.out.println(Arrays.toString(intArray)); // [1, 2, 3]
        System.out.println(Arrays.toString(getIntArray()));
        System.out.println(Arrays.toString(getIntArray(50)));

    }
    public static boolean middleCheck(Scanner sc){

        System.out.println("Do you have a middle name: y/n");
        String input = sc.next();
        if (input.equalsIgnoreCase("y")){
            return true;
        } else if (input.equals("n"))
    }
    public static String[] getName(Scanner sc){


    }

    public static int[] getIntArray() {
        return new int[]{1, 2, 3};
    }

    public static int[] getIntArray(int lengthOfArray) {

        int[] arr = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
