package shapes;

public class Square extends Quadrilateral {


    public Square(int side){
        super(side, side);
    }

    @Override
    public double setWidth() {
        return this.width;
    }

    @Override
    public double setLength() {
        return this.length;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
