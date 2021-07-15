package warmup;

public class StringRandomNumber {
    //WARM UP
// TODO Given this string: `String str = "Oberon is the
//  best cohort ever!"`, print out the character from that
//  string using a random number generator, that generates
//  a number between 0 and 50. Using a try/catch block, handle
//  any errors (Exceptions) that may occur by printing out the
//  message.
    public static void main(String[] args) {
        String str = "Oberon is the best cohort ever!";
        System.out.println(stringPrinter(str));
    }
    public static char stringPrinter(String str){
      int randomInt = (int) (Math.random() * 50);
      try {
          char thisChar = str.charAt(randomInt);
          System.out.println("Success.");
          return thisChar;
      } catch (StringIndexOutOfBoundsException e){
          System.out.println("Random was " + randomInt + "\nString has indexes of " + str.length());
          System.out.println("Error was " + e.getMessage());
          System.out.println("Rerunning the program: ");
         return stringPrinter(str);
      }

    }
}
