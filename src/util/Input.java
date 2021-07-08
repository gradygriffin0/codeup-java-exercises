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
        if ((value.equalsIgnoreCase("yes")) || (value.equalsIgnoreCase("y"))|| (value.equalsIgnoreCase("yeah")) || (value.equalsIgnoreCase("yea"))) {
            return true;
        } else if (value.equalsIgnoreCase("no") || value.equalsIgnoreCase("n")){
            return false
        }
        else {
            return yesNo();
        }
    }

    public int getInt(int min, int max){
        System.out.println("Enter an integer between " + min + " and " + max);
        int input = scanner.nextInt();
        while(input < min || input > max){
            System.out.println("Error not an integer.");
            System.out.println("Enter an integer between " + min + " and " + max);
            input = scanner.nextInt();
        }
        return input;
    }

    public double getDouble(int min, int max){
        System.out.println("Enter a double between " + min + " and " + max);
        double input = scanner.nextDouble();
        while(input < min || input > max){
            System.out.println("Error not a double.");
            System.out.println("Enter an double between " + min + " and " + max);
            input = scanner.nextDouble();
        }
        return input;
    }

}
