package org.andestech.learning.rfb19.g4;

public class Circle extends Figure implements Cloneable{


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

       // return super.toString() + ", Circle, r=" + r;
        return "Circle, r=" + r;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return r==((Circle)obj).getR();
    }

    public Circle merge(Circle circle)
    {
       return new Circle(Math.sqrt(r*r + circle.getR()*
                circle.getR()));
    }

    public static Circle merge2(Circle circle, Circle circle2)
    {
        return new Circle(Math.sqrt(circle2.getR()*
                circle2.getR() + circle.getR()*circle.getR()));
    }

}
