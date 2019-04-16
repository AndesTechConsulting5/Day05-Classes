package org.andestech.learning.rfb19.g4;


public class App
{

    public static String getFigureStat(Figure figure)
    {
        return "Perimeter: " + figure.perimeter() +
             ", square: " + figure.square();

    }


    public static void main( String[] args ) throws CloneNotSupportedException {

        Circle circle = new Circle(1);
        System.out.println( getFigureStat(circle) );



        Rectangle rectangle = new Rectangle(2,3);
        System.out.println( getFigureStat(rectangle));

        System.out.println(circle);


        Circle circle1 = circle;


        Circle circle2 = (Circle) circle.clone();
        System.out.println(circle2);

        circle.setR(10);
        System.out.println("c2: " + circle2 + ", c: " +circle);


        circle2.setR(10);

        System.out.println(circle2.equals(circle));


        Circle circle3 = circle.merge(circle2);

        Circle circle4 = Circle.merge2(circle,circle2);
        System.out.println("c3: " + circle3 + ", c4: " +circle4);


    }
}
