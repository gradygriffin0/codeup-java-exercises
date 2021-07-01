package Animals;

public class Fish extends MarineAnimal {
        private boolean hasScales;
    public Fish(boolean canSwim, int length, int finCount, boolean isSaltwater, String name, boolean hasScales) {
        super(canSwim, length, finCount, isSaltwater, name);
        this.hasScales = hasScales;


    }

    public Fish() {

    }

    public boolean getHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }

}
