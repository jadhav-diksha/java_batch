interface A2{

     void run();
}

    public class InterfaceAnonymous {
    public static void main(String args[])
    {
        A2 a1=new A2(){               //anonumous class
           public void run()
            {
                System.out.println("anonymous class");
            }
        };
        a1.run();
    }

    
}






