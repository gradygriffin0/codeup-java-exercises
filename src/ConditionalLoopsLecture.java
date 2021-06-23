import java.util.Scanner;

public class ConditionalLoopsLecture {
    public static void main(String[] args) {


//        relational expressions
        /*
        * equality: ==
        * inequality: !=
        * greater than > // >=
        * less than < // <=
        *
        *
        * (false && true);
        * && - checks left hand first, if left hand is false .. stops reading.
        * & - checks left hand even if false, then compares to right.
        *
        * ||  or
        * | - bitwise or
        */

        // string comparison
        /*
        * String myName = "GRADY"
        * String yourName = "Laura"
        *
        * equals() - to compare strings
        * equalsIgnoreCase()
        *
        * myName.equals(yourName) // false
        *
        * */

        //Control Structures
        /*
        * IF Statements
        *
        * if(condition){
        *     executes if condition is true;
        * }
        *
        * */

        //        MINI EXERCISE
        // TODO: create three unique usernames (user1, user2, user3).
        //  create a fourth user and set it equal to user input. (ask
        //  the user to enter a username). if the username has already
        //  been used by user1, user2, or user3, print "sorry this
        //  username already exists.

        String user1 = "UsernameOne";
        String user2 = "UsernameTwo";
        String user3 = "UsernameThree";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username");

        String user4 = sc.next();
        while(user4.equalsIgnoreCase(user1) || user4.equalsIgnoreCase(user2) || user4.equalsIgnoreCase(user3)){
            System.out.println("Sorry that username is taken.");
            System.out.println("Enter your username");
            user4 = sc.next();
        };
        System.out.println("Hello " + user4 );


    }
}
