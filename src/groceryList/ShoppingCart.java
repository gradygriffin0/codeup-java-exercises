package groceryList;

import java.util.HashMap;

public class ShoppingCart {
    protected  HashMap<Item, Integer> shoppingCart;
    public ShoppingCart() {
         this.shoppingCart = new HashMap<>();
    }



    public HashMap<Item, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Item item, int quantity) {
        this.shoppingCart.put(item, quantity);
    }
}
