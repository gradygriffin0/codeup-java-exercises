package shapes;

public class Square extends Rectangle{
    public static void main(String[] args) {

    }
    private int side;

    public Square(int side){
        this.length = side;
        this.width = side;
        this.side = side;

    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    @Override
    public int getArea() {
        return side * side;
    }

    public int getPerimeter(){
        return side * 4;
    }

}
