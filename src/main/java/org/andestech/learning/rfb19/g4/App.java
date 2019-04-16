package org.andestech.learning.rfb19.g4;


public class App 
{

    public static String getFigureStat(Figure figure)
    {
        return "Perimeter: " + figure.perimeter() +
             ", square: " + figure.square();

    }


    public static void main( String[] args ){

        Circle circle = new Circle(1);
        System.out.println( getFigureStat(circle) );

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println( getFigureStat(rectangle));

        System.out.println(circle);



    }
}
