package warmup;

public class BankLaura {
    public static void main(String[] args) {

        eligbleBanker(new User());
        eligbleBanker(new User());
        eligbleBanker(new User());

    }


    public static void eligbleBanker(User user){

        if (user.age < 16){
            System.out.println("Sorry, you're not old enough.");
            throw new NumberFormatException();
        }
        if (user.money < 200){
            System.out.println("Sorry, Not enough funds to bank.");
            throw new NumberFormatException();
        }

        System.out.println("Thanks for banking with us.");
    }
}
