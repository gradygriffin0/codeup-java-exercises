package abstractLecture;

public abstract class fruit {
    public static void main(String[] args) {
        fruit Pina = new Pineapple("Pineapple", "Yellow", 32, false);
        System.out.println(Pina.whatFruit());
    }
    protected String name;
    protected String color;
    protected int lengthOfGrow;
    protected boolean softExterior;

    public fruit(String name, String color, int lengthOfGrow, boolean softExterior) {
        this.name = name;
        this.color = color;
        this.lengthOfGrow = lengthOfGrow;
        this.softExterior = softExterior;
    }

    public String whatFruit(){
        return "I am a " + name;
    }
}
