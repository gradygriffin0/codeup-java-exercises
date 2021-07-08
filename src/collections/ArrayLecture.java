package collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
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
        } else if (input.equalsIgnoreCase("n")){
            return false;
        }else {
            return middleCheck(sc);
        }
    }
    public static String[] getName(Scanner sc){

    boolean middle = middleCheck(sc);

    if(middle){
        String[] nameArr = new String[3];
        System.out.println("Enter your first name: ");
        nameArr[0] = sc.next();
        System.out.println("Enter your middle name: ");
        nameArr[1] = sc.next();
        System.out.println("Enter your last name: ");
        nameArr[2] = sc.next();
        return nameArr;
    } else {
        String[] nameArr = new String[2];
        System.out.println("Enter your first name: ");
        nameArr[0] = sc.next();
        System.out.println("Enter your last name: ");
        nameArr[1] = sc.next();
        return nameArr;
    }
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
