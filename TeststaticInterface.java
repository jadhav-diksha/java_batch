interface Drawble{

void draw();
static int cube(int x)
{
return x*x*x;
}
default void display()
{
System.out.println("Default Method");
}

}

class Rectangle implements Drawble
{

public void draw()
{
System.out.println("Drawing Rectangle");
}

}

class TeststaticInterface
{

public static void main(String args[])
{
Drawble d1=new Rectangle();
d1.draw();
System.out.println(Drawble.cube(5));
d1.display();
}
}