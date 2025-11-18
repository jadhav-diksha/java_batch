public class localInnerEx {

    int a=50;

    public void display()
    {
        System.out.println("values is:"+a);
    
    class LocalInner
    {
        void show()
        {
            System.out.println("method of inner class");
        }
    }
    LocalInner l=new LocalInner();
    l.show();
}
    public static void main(String args[])
    {
       localInnerEx  l1=new localInnerEx ();
        l1.display();

    }
    
}

    

