package shapes;

public class Square extends Rectangle {

    private int side;

    public Square(int side){
        super(side, side);
        this.side = side;
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

}
