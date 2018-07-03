package Figures;

public class Rectangle implements IFigures {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (this.sideA + this.sideB);
    }

    @Override
    public double calcArea() {
        return this.sideA * this.sideB;
    }
}
