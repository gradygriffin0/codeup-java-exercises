package warmup;

import java.util.Arrays;
import java.util.Scanner;

public class VacationSpots {
    // TODO: Create a method which will return a String[] containing the user's favorite vacation spots
//  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
//  -> Then, add the old elements
//  -> Finally, add the new element
//  -> When the user decides to finish inputting spots, return the String[].
//  -> sout out the returned value!
    protected static final Scanner sc = new Scanner(System.in);
    protected static int counter;
    protected static String[] vacationSpots = {};
    protected static String[] copyArr = {};



    public static void main(String[] args) {
        home();
    }


    public static int choice(){
        while(sc.hasNext()) {
            int input = sc.nextInt();
            if ((input == 0) || (input == 1) || (input == 2)){
                return input;
            } else{
                System.out.println("That isn't an option.");
            }
        }
        return 2;
    }
    public static int yesNo(){
        while(sc.hasNext()) {
            int input = sc.nextInt();
            if ((input == 0) || (input == 1)){
                return input;
            } else{
                System.out.println("That isn't an option.");
            }
        }
        return 0;
    }
    public static void home(){

        System.out.println(Arrays.toString(vacationSpots));
        System.out.println("What would you like to do?\n");
        System.out.println("0 - View all vacation spots");
        System.out.println("1 - Add new vacation spot");
        System.out.println("2 - Exit");

        int choice = choice();

        if (choice == 0){
            if (counter == 0){
                System.out.println("Sorry, there aren't any vacation spots yet..");
                home();
            } else {
                System.out.println(Arrays.toString(vacationSpots));
            }
        }

        if (choice == 1){
            System.out.println("Enter the name of your vacation destination.");
            sc.nextLine();
            String destination = sc.nextLine();
            copyArr = vacationSpots;

            vacationSpots = Arrays.copyOf(copyArr, copyArr.length +1);
            vacationSpots[copyArr.length] = destination;

            vacationSpots[vacationSpots.length - 1] = destination;
            System.out.println("You added " + destination + " to your list of vacations.");
        }
        if (choice == 2){
            return;
        }


            System.out.println("Would you like to continue?");
            System.out.println("0 - No");
            System.out.println("1 - Yes");
            int choice2 = yesNo();
            if (choice2 == 0){
                return;
            }
            if (choice2 == 1){
                home();
            }




    }
}
