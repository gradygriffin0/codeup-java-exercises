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

//        System.out.println("Enter an integer between 1 and 10");
//        System.out.println(getInteger(1, 10, sc));

        System.out.println("Enter an integer between 1 and 10");
        factorial(sc);
//        System.out.println("Roll the dice; enter the sides of your two dice to roll...");
//        System.out.println(diceRoll(sc.nextInt(), sc.nextInt()));

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
    public static int getInteger(int min, int max, Scanner sc){

        int scanInput = sc.nextInt();

        if (scanInput < min || scanInput > max) {
            System.out.println("Error, number not an integer or within range.");
            System.out.println("Enter a number between 1 and 10");
            return getInteger(min, max, sc);

        } else {
            return scanInput;
        }

    }
//    public static String factorial(Scanner scanner){
//
//        String ultimate = "";
//        int input = getInteger(1, 100, scanner);
//        long total = 1;
//        System.out.println(input);
//        for(int i = 1; i <= input; i++){
//                total *= i;
//            if (i == input){
//                ultimate += i + " ";
//                ultimate += "= " + total;
//            } else {
//                ultimate += i + " x ";
//            }
//        }
//
//        return  input + "!" + " = " + ultimate;
//    }
public static void factorial(Scanner scanner){

    String ultimate = "";
    int input = getInteger(1, 100, scanner);
    long total = 1;
    System.out.println(input);
    for(int i = 1; i <= input; i++){
        total *= i;
        if (i == input){
            ultimate += i + " ";
        } else {
            ultimate += i + " x ";
        }
        System.out.println(i + "! = " + ultimate + " = " + total);
    }

//    return  input + "!" + " = " + ultimate;
}

    public static String diceRoll(int sidesOfFirst, int sidesOfSecond){

        double chance1 = (double) 1 / sidesOfFirst;
        double chance2 = (double) 1 / sidesOfSecond;

        return "Chance of first rolling any given side = " + chance1 + "\n" +
                "Chance of first rolling any given side = " + chance2 + "\n" +
                "Chance both die rolling the same side = " + chance1 * chance2 + "\n";


    }


}
