package Figures;

public class Circle implements IFigures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * this.radius * this.radius;
    }
}
