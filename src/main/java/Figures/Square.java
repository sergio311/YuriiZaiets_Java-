package Figures;

public class Square implements IFigures {
    public double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calcPerimeter() {
        return 4*this.side;
    }

    @Override
    public double calcArea() {
        return this.side * this.side;
    }
}
