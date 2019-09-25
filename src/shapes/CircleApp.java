package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        Circle circle = new Circle(input.getDouble("Give me the radius"));

        System.out.println("Here is the area " + circle.getArea());

        System.out.println("Here is the circumference " + circle.getCircumference());

    }

}
