interface A3{
    void show();
    
        interface B{
            void msg();
        }
    }

public class NestedInterface implements A3.B {

   public void msg()
    {
        System.out.println("overloading method of nested interface");
    }
    public static void main(String args[])
    {
        A3.B obj1=new NestedInterface();
        obj1.msg();
    }
    
}

