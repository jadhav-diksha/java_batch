class StringMethod {

   public static void main(String args[])
    {
       
        StringBuffer sb1=new StringBuffer(10);

        sb1.append("Diksha");

      
        System.out.println("length of "+sb1.length());
      
        System.out.println("reverse of "+sb1.reverse());

        System.out.println("character at specific index of "+sb1.charAt(5));

         sb1.setCharAt(5,'M');

         System.out.println("delete char at "+sb1.deleteCharAt(5));

         System.out.println("index of "+sb1.indexOf("f"));

         System.out.println("Is empty "+sb1.isEmpty());

        System.out.println("substring is:"+sb1.substring(3,7));

        System.out.println("hash code is:"+sb1.hashCode());

         System.out.println("string class is:"+sb1.getClass());


     }
}