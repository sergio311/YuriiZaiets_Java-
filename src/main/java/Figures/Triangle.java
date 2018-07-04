package Figures;

public class Triangle implements IFigures {
    public double height;
    public double sideA;
    public double sideB;
    public double sideC;

    public Triangle(double height, double sideA, double sideB, double sideC) {
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calcPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calcArea() {
        return 0.5 * sideA * height;
    }
}
