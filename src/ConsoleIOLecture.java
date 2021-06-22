import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args) {
//        System.out.println("Prints a string and a new line");
//        System.out.print("Prints on the same line because a new line isnt made after");
//        System.out.print(" --- See?");
//
//        System.out.printf(" --- Does not provide new line also"); // printf means print formatted string

    //        String name = "Grady";
    //        int age = 21;
    //        String hobby = "basketball";
    //
    //        System.out.printf("My name is %s and I am %s. I love %s\n", name, age, hobby);
    //
    //        String mySentence = String.format("My name is %s and I am %s. I love %s", name, age, hobby);
    //        System.out.println(mySentence);

        // rounds to fit the %.2f .2 being decimal places you want to show
//        int currencyInPennies = 1000;
//        System.out.printf("I'll sell you my swamp for $%.2f per acre", currencyInPennies / 100.00);

// Scanner
    //        create new scanner object with name scnr
    //        new instance
    //        the argument () is where you want scanner to look or observe
            Scanner scnr = new Scanner(System.in);
    //        prompt user a question
    //        System.out.println("What is your name? First and Last");
    //        declare a var for the next thing input
    //        scanner will watch for it
    //        String firstName = scnr.next();
    //        String lastName = scnr.next();

    //        log scanner
    //        System.out.printf("Your name is %s %s. \n", firstName, lastName);
    //        String sentence = String.format("Your first name is: %s \nYour last name is: %s\n", firstName, lastName);
    //        System.out.println(sentence);

//        nextInt
//        System.out.println("Enter a number: ");
//        int myNum = scnr.nextInt();
//        System.out.println(myNum);

//        nextLine()
//        System.out.println("enter a line:");
//        String myString = scnr.nextLine();
//        System.out.println(myString);

        while (scnr.hasNext()){
            String word = scnr.next();
            System.out.print(word + " ");
            if (word.equals("break")){
                break;
            }
        }
    }
}
