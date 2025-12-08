class MathUtil
{
  static void square(int a)
{
  System.out.println("square is :"+a*a);
}
static void cube(int a)
{
System.out.println("cube is :" +a*a*a);
}

public static void main(String args[])
{
 System.out.println("Square of 5: " + MathUtil.square(5));
 System.out.println("Cube of 5: " + MathUtil.cube(5));

}
}