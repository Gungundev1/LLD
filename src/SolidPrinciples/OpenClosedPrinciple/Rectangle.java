package SolidPrinciples.OpenClosedPrinciple;

public class Rectangle implements Shape {
   double length=10;
   double width=7;

    @Override
    public  void calculateArea() {

        System.out.println("Area of rectancle is:"+length*width);

    }
}
