public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"nice", "funny","evil", "infamous", "unlovable", "lovable", "triumphant", "courageous", "cowardly", "silly", "stinky", "fubar", "juicy"};
        String[] nouns = {"school", "home", "mailbox", "computer", "duck", "idea", "knight", "oprah", "tom cruise", "Grady"};


        for (int i = 0; i < 25; i++){
            System.out.println(serverNameGenerator(adjectives, nouns));
        }
    }
    public static String randomElement(String[] arr){
        int random = (int) ((Math.random() * arr.length));
        return arr[random];
    }

    public static String serverNameGenerator(String[] arr1, String[] arr2){
        return "Here is your server name: \n" + randomElement(arr1) + "-" + randomElement(arr2);
    }
}
