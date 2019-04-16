package org.andestech.learning.rfb19.g4;

public class Circle extends Figure {


    public Circle(double r) {
                this.r = r;
    }

    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double square() {
        return Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "Circle, r=" + r;
    }
}
