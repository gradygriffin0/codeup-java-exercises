package util;

import java.util.Scanner;


public class Input {
    public static void main(String[] args) {


    }

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);

    }

    public String getString() {
//        System.out.println("enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {

        String value = scanner.next();
        if ((value.equalsIgnoreCase("yes")) || (value.equalsIgnoreCase("y")) || (value.equalsIgnoreCase("yeah")) || (value.equalsIgnoreCase("yea"))) {
            return true;
        } else if (value.equalsIgnoreCase("no") || value.equalsIgnoreCase("n")) {
            return false;
        } else {
            return yesNo();
        }
    }

    public int getInt(int min, int max) {
        System.out.println("Enter an integer between " + min + " and " + max);
        try {  // .nextInt()
            int input = Integer.parseInt(getString());
            if (input > min && input < max) {
                return input;
            } else {
                System.out.println("Not in range");
                return getInt(min, max);
            }
        } catch (Exception e) {
            System.out.println("Invalid integer");
            return getInt(min, max);
        }
    }

    //    public double getDouble(int min, int max){
//        System.out.println("Enter a double between " + min + " and " + max);
//        double input = scanner.nextDouble();
//        while(input < min || input > max){
//            System.out.println("Error not a double.");
//            System.out.println("Enter an double between " + min + " and " + max);
//            input = scanner.nextDouble();
//        }
//        return input;
//    }

    public double getDouble(int min, int max) {
        System.out.println("Enter a double between " + min + " and " + max);
        try {  // .nextInt()
            double input = Double.parseDouble(getString());
            if (input > min && input < max) {
                return input;
            } else {
                System.out.println("Not in range");
                return getDouble(min, max);
            }
        } catch (Exception e) {
            System.out.println("Invalid double");
            return getDouble(min, max);
        }
    }
}
