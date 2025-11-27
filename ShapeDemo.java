abstract class Shape{
    abstract double calculateArea(); 
}
class Circle extends Shape{

    double radius;

    Circle(double radius)
    {
        this.radius=radius;
    }
    double calculateArea()
    {
        return 3.14*radius*radius;
    }

}

class Rectangle extends Shape{

    double len,width;

    Rectangle(double len,double width)
    {
        this.len=len;
        this.width=width;
    }
     double calculateArea()
    {
        return len*width;
    }
}

public class ShapeDemo{
public static void main(String args[])
{
   Circle c = new Circle(5);              
   Rectangle r = new Rectangle(4, 6);     

    System.out.println("Area of Circle: " + c.calculateArea());
    System.out.println("Area of Rectangle: " + r.calculateArea());
    }
   

}


