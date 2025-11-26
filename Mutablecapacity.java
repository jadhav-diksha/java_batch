class Mutablecapacity //string bufferdemo
{
   public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer(); //default capacity

        System.out.println(sb.capacity()); //(prevoiuscapacity+1)*2

        sb.append("welcome everyone to fortune cloud");

         System.out.println(sb.capacity()); //16


        StringBuffer sb1=new StringBuffer(10);

        sb1.append("Welcome to fct dear all");

        System.out.println(sb1.capacity());

      
        System.out.println("length of "+sb1.length());
      
        System.out.println("reverse of "+sb1.reverse());

        System.out.println("character at specific index of "+sb1.charAt(5));

        // System.out.println("add character at specific index of "+sb1.setChar(5,'M'));

        //  System.out.println("delete char at "+sb1.deletecharAt(5));

     }
}