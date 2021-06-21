public class SyntaxTypesVariables {

    public static void main(String[] args) {
//        type bounds; each number type has a min and max to be used
        ////        declare object type in the declaration;
        //        byte byt = 127;
        //        byte byt2 = 1;
        //        // returns Integer
        //        System.out.println(((Object)(byt + byt2)).getClass().getName()); //Integer
        ////        however, incrementing maintains object Type, and the sum exceeds the bounds of a byte, therefore
        ////        it returns to the minimum of a byte(127)/
        //        byte byt3 = 127;
        //        byte byt4 = 1;
        //        byt3 += byt4;
        //        System.out.println(byt3); // -128 (min bound)
//        float
//        provided double (NEED TO SPECIFY)
//        float myFirstNumber = 32.1; // wrong cuz double see next
//        float myFirstNumber = (float)32.1; or 32.1f;
        // Strings

//        System.out.println('H' + 'e' + 'l' + 'l' + 'o'); //  returns 500;
//        System.out.println((int)'H'); // returns 72;
//        String myName = "Grady";
//        System.out.println(myName); // returns "Grady"
        // returning numerical char value ASCII;
//        Boolean
        int temperature = 70;
        var isNiceDay = (temperature > 60) && (temperature < 80);
        if (isNiceDay) {
            System.out.println("What a lovely day it is");
        } else{
            System.out.println("I don't like it");
        }

    }

}
