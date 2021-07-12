package groceryList;

import java.util.HashMap;
import java.util.Scanner;

public class GroceryInput {
    private static final Scanner sc = new Scanner(System.in);


    public static void mainMenu(){
        System.out.println("         GRADY'S GROCERY        ");
        System.out.println("--------------------------------");
        System.out.println("            OPTIONS:");
        System.out.println("0 - EXIT ");
        System.out.println("1 - CREATE NEW GROCERY LIST  ");
        chooseMainMenu(choose(2));

    }
    public static void groceryListHome(ShoppingCart cart){
        System.out.println("            OPTIONS:\n" +
                            "0 - EXIT\n" +
                            "1 - MAIN MENU\n" +
                            "2 - ADD GROCERY TO CART\n" +
                            "3 - VIEW CART (UNSORTED)\n" +
                            "4 - VIEW CART (SORTED)\n" +
                            "5 - EDIT ITEM\n" +
                            "6 - CREATE SAMPLE CART");
        chooseGroceryList(choose(6), cart);
    }
    public static void continueCheck(ShoppingCart cart){
        System.out.println("Would you like to continue?");
        System.out.println("0 - No");
        System.out.println("1 - Yes");
        switch(choose(2)){
            case 0:
                return;
            case 1:
                groceryListHome(cart);
                break;
        }
    }
    public static void addSampleCart(ShoppingCart cart){

        cart.setShoppingCart(createItem("Milk", "dairy"), 5);
        cart.setShoppingCart(createItem("Fish", "produce"), 2);
        cart.setShoppingCart(createItem("coffee", "beverage"), 1);
        cart.setShoppingCart(createItem("Steak", "produce"), 2);
        cart.setShoppingCart(createItem("Orange Juice", "beverage"), 1);




    }
    public static void viewItemUnsorted(ShoppingCart cart){
        for (Item item : cart.shoppingCart.keySet()){

            System.out.println(item.getName());
            System.out.println(item.getCategory());
            if(cart.shoppingCart.containsKey(item)){
                System.out.println(cart.shoppingCart.get(item));
            }

        }
    }

    public static void chooseGroceryList(int choice, ShoppingCart cart){

        switch(choice){
            case 0:
                return;
            case 1:
                mainMenu();
                break;
            case 2:
                addItem(cart);
                continueCheck(cart);
                break;
            case 3:
                viewItemUnsorted(cart);
                continueCheck(cart);
                break;
            case 4:
                addSampleCart(cart);
                continueCheck(cart);
                break;

        }
    }
    public static void addItem(ShoppingCart cart){
        System.out.println("What Item would you like to add?");
        String name = sc.next();
        System.out.println("What category is this item?");
        String category = sc.next();
        System.out.println("What quantity of " + name + " do you have?");
        int quantity = sc.nextInt();
        cart.setShoppingCart(createItem(name,category), quantity);


    }
    public static Item createItem(String name, String category){
        return new Item (name, category);
    }
    public static void chooseMainMenu(int choice){
        switch(choice){
            case 0:
                return;
            case 1:
                groceryListHome(new ShoppingCart());
                break;
            case 2:


        }

    }

    public static int choose(Integer numChoices){
        System.out.printf("ENTER YOUR CHOICE: ");
        String userInput = sc.next();
        for (int i = 0; i < numChoices; i++){
            if (userInput.equalsIgnoreCase((""+i))){
                return i;
            }
        }
        System.out.println("Not an Option");
        return choose(numChoices);
    }
}
