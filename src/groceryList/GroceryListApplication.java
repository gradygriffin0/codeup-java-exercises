package groceryList;

import java.util.Scanner;

import static groceryList.GroceryInput.choose;
import static groceryList.GroceryInput.mainMenu;

public class GroceryListApplication {



    public static void main(String[] args) {
        Item milk = new Item("milk", "dairy");
        Item ham = new Item("ham", "produce");
        mainMenu();
    }


}
