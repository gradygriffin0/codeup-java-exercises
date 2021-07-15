package warmup;

import java.util.Scanner;

public class User {
    protected double money;
    protected double age;
    protected final Scanner sc = new Scanner(System.in);

    public User() {
        System.out.println("How old are you?");
        double userInput = sc.nextDouble();
        System.out.println("How much money do you have?");
        double userMoney = sc.nextDouble();
        this.money = userMoney;
        this.age = userInput;
    }
}
