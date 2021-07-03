package util;

import java.util.Scanner;


public class Input {
    public static void main(String[] args) {
        Input test = new Input();
        System.out.println(test.getString());
        System.out.println(test.yesNo());
    }

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);

    }

    public String getString() {
        System.out.println("enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Is it yes or not yes?: ");
        boolean yes = false;
        String value = scanner.next();
        if ((value.equalsIgnoreCase("yes")) || (value.equalsIgnoreCase("y"))|| (value.equalsIgnoreCase("yeah")) || (value.equalsIgnoreCase("yea"))) {
            yes = true;
        }
        return (yes);
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


}
