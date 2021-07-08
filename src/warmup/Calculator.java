package warmup;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
    }

    public static String operatorGrab(Scanner sc){
        System.out.println("Enter an operator: x / + - %");
        String operator = sc.next();
        if (    !(operator.equalsIgnoreCase("x") ||
                operator.equalsIgnoreCase("/") ||
                operator.equalsIgnoreCase("+") ||
                operator.equalsIgnoreCase("-") ||
                operator.equalsIgnoreCase("%"))) {
            System.out.println("Error, not an operator. Enter an operator:");
            return operatorGrab(sc);

        } else {
            System.out.println(operator);
            return operator;
        }
    }
    public static void calculate(Scanner sc){
        System.out.println("Enter a number");
        double firstInput = sc.nextDouble();
        String operator = operatorGrab(sc);

        if (operator.equalsIgnoreCase("x")){
            System.out.println("Enter another number to multiply:");
            double secondInput = sc.nextDouble();
            System.out.println("Your product is: " + (firstInput*secondInput));

        } else if (operator.equalsIgnoreCase("/")){
            System.out.println("Enter another number to divide by:");
            double secondInput = sc.nextDouble();
            System.out.println("Your quotient is: " + (firstInput/secondInput));

        } else if (operator.equalsIgnoreCase("+")){
            System.out.println("Enter another number to add:");
            double secondInput = sc.nextDouble();
            System.out.println("Your sum is: " + (firstInput+secondInput));

        } else if (operator.equalsIgnoreCase("%")){
            System.out.println("Enter another number to find remainder:");
            double secondInput = sc.nextDouble();
            System.out.println("Your remainder is: " + (firstInput%secondInput));
        }



    }
}
