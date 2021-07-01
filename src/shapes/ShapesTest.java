package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Square square1 = new Square(25);
        System.out.println(square1.getPerimeter());

        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

    }

}
