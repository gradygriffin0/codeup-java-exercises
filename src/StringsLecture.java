import java.util.Arrays;
import java.util.Scanner;

public class StringsLecture {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
//        System.out.println("Print your name");
//        String input = scnr.next();
//        String randomName = "Grady";
//        if(input.equalsIgnoreCase(randomName)){
//            System.out.println("Hey that's my name!");


//        Scanner sc = new Scanner(System.in);
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//
//        System.out.println("Enter your name");
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//        String input = sc.next();
//        while (!input.equalsIgnoreCase(randomName)){
//
//            randomNum = (int) (Math.random() * 28);
//            randomName = studentsArr[randomNum];
//            System.out.printf("%s \n", randomName);
//
//        }
        //        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"
//        String sentence = "Red Orange Blue Yellow Green Purple";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a color");
//        String input = sc.next();
//        if (sentence.toUpperCase().startsWith(input.toUpperCase())){
//            System.out.println("your favorite color is the start of sentence");
//        }
//        if (sentence.toUpperCase().endsWith(input.toUpperCase())){
//            System.out.println("your favorite color is the end of sentence");
//        }

        //    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.


//        System.out.printf(basketball("Spurs"));
//        System.out.println(stringCount(basketball("Spurs")));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your first name");
//        String firstNameInput = sc.next();
//        System.out.println("Enter your last name");
//        String lastNameInput = sc.next();
//        System.out.println("Enter your age");
//        int ageInput = sc.nextInt();
//
//        System.out.println(greeting(firstNameInput, lastNameInput, ageInput));
////        greeting("Grady", "Griffin", 100);
//
//    }

//    public static String basketball(String teamName){
//        return teamName + " is the best team\n";
//
//    }
//    public static int stringCount(String stringToCount){
//        return stringToCount.length();
//    }
//    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";
//.       - accepts: your age. returns: "that's crazy! you don't look
//        100 years old!"

//    public static String greeting(String firstName, String lastName, int age) {
//            return "Hello " + firstName + " " + lastName + ". You don't look " + age + " years old!";
//
//
//    }

        //    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tell me about yourself: Put your age, name and t/f if you own pet(s).");
////        sc.useDelimiter(" " || "\n");
//        String first = sc.nextLine();
//        String second = sc.nextLine();
//        String third = sc.nextLine();
//        tellMe(first, second, third);
//    }
//    public static String tellMe(String first, String second, String third){
//        if (first.equalsIgnoreCase("t")){
//            first = "You have pet(s)";
//        }
//        else if (second.equalsIgnoreCase("t")){
//            second = "You have pet(s)";
//        }
//        else if (third.equalsIgnoreCase("t")){
//            third = "You have pet(s)";
//        }
//        if (first.equalsIgnoreCase("f")){
//            first = "You don't have pets";
//        }
//        else if (second.equalsIgnoreCase("f")){
//            second = "You don't have pets";
//        }
//        else if (third.equalsIgnoreCase("f")){
//            third = "You don't have pets";
//        }
//
//        System.out.println("Oh okay... " + first + ", " + second + ", and " + third + ".");
//        return "Oh okay... " + first + ", " + second + ", and " + third + ".";
//    }
// Recursion - method that calls itself internally, require a stopping point, also will need a new argument each time.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many seats are in the movie theatre");
//        int seatsLeft = sc.nextInt();
//        countSeats(seatsLeft);
//    }
////    public static void countSeats(int seats){
////        if(seats > 0){
////            System.out.println("Seats Available: " + seats);
////            seats--;
////            countSeats(seats);
////        } else {
////            System.out.println("No Seats Available!");
////        }
////
////
////    }
        //    TODO: you are a sports manager. Prompt your client who is training
//     for a marathon how many miles they have to run today. You're the
//     coach, so you decide how many miles they ran that day. print out
//     how many miles they have left in training until they have 0 miles
//     left.
        Scanner sc = new Scanner(System.in);
        System.out.println("How many miles did you run today?");
        int milesRan = sc.nextInt();
        mileMethod(milesRan);
    }

    public static void mileMethod(int miles){
        if (miles > 0){
            if (miles % 2 == 0){
                System.out.println("You have ran " + miles + ". Keep running!");
            }
            miles--;
            mileMethod(miles);
        } else {
            System.out.println("You ran all the miles!");
        }

    }

}


