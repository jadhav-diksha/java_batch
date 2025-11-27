public class Calculator {

    void add(int a,int b)
    {
        
        System.out.println("result" +(a+b));
    }
    void add(double n,double m)
    {
       
        System.out.println("result"+(n+m));
    }

    void add(int s,int d,int f)
    {
       
        System.out.println("result"+(s+d+f));
    }

    public static void main(String args[])
    {
       Calculator c=new Calculator();

       c.add(4,5);
       c.add(22.34,99.67);
       c.add(3.4,9.8);
    }
    
}
