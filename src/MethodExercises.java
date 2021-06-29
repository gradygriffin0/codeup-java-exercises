import java.util.Scanner;

public class MethodExercises {
    public static void main(String[] args) {
//1
//        System.out.println(integerAddition(40, 40));
//
//        System.out.println(integerSubtraction(40, 40));
//
//        System.out.println(integerMultiplication(30, 10));
//
//        System.out.println(integerDivision(100, 0));
//
//        System.out.println(integerModulus(2, 0));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int userInput = sc.nextInt();
        getInteger(1, 10, userInput);
    }

    //1
    public static int integerAddition(int num1, int num2) {
        return num1 + num2;
    }

    public static int integerSubtraction(int num1, int subtractor) {
        return num1 - subtractor;
    }

    public static int integerMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int integerDivision(int num1, int divisor) {
        if (divisor == 0) {
            System.out.println("Can't divide by 0");
            return num1;
        }
        return num1 / divisor;
    }

    public static int integerModulus(int num1, int num2) {
        return num1 % num2;
    }

    //    2
    public static int getInteger(int min, int max, int scanner){



    }


}
