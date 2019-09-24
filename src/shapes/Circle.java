package shapes;

import util.Input;

public class Circle {

    Input input = new Input();

    private double radius;

    public Circle(){

        System.out.println("Enter in a radius.");

        radius = input.getDouble();

    }

    public double getArea(){

       double area = Math.PI * radius * radius;

        return area;

    }

    public double getCircumference(){

        double circumference = 2 * Math.PI * radius;

        return circumference;

    }



}
