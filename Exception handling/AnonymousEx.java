abstract class A{

    abstract void run();
}
public class AnonymousEx {

    public static void main(String args[])
    {
        A a1=new A(){               //anonumous class
            void run()
            {
                System.out.println("anonymous class");
            }
        };
        a1.run();
    }

    
}
