package day44_Inheritance.ShapesTask;

public class Rectangle extends Shape{
     /*
    variables: 4 ( 1 ins, 3 sta)
    methods: 4 (4 ins)
     */

    public double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        setInfo("Rectangle");
    }


}
