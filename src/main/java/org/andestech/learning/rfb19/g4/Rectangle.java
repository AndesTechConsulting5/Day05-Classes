package org.andestech.learning.rfb19.g4;

public class Rectangle extends Figure {

    private double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA(){return a;}
    public double getB(){return b;}

    @Override
    public double square() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*(a+b);
    }
}
