package shapes;

public class RectangleTwo extends Quadrilateral{

    public RectangleTwo() {
    }

    public RectangleTwo(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea() {
        return (width * length);
    }
    @Override
    public double getPerimeter(){
        return ((width * 2) + (length * 2));
    }
}
