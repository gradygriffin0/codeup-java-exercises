package shapes;

public class SquareTwo extends Quadrilateral{

    protected double side;

    public SquareTwo(double side) {
        super(side, side);
        this.side = side;

    }

    @Override
    public double getPerimeter() {
        return (side*4);
    }

    @Override
    public double getArea() {
        return (side * side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
