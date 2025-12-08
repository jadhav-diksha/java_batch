class MathUtil
{
  static int square(int a)
{
  return a*a;
}
static int cube(int a)
{
return a*a*a;
}

public static void main(String args[])
{
 System.out.println("Square of 5: " + MathUtil.square(5));
 System.out.println("Cube of 5: " + MathUtil.cube(5));

 
}
}