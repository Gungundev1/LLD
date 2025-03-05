package SolidPrinciples.OpenClosedPrinciple;

public class Circle implements Shape{
    double radius=3.5;

    @Override
    public void calculateArea() {
        System.out.println("Area of circle is:"+radius*radius);

    }


}
