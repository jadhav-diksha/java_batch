public class ArithException {

    int a=10,b=0;
   
     
    try{
        System.out.println(a/b);
    }catch(ArithmeticException e){

        System.out.println(e);

    }
    
}
