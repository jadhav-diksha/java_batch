public class primeCheck {
    public static void main(String[] args) {
        int a=17;
        boolean flag=true;

        for(int i=2 ; i<a ; i++){
            if(a % i==0){
                flag=false;
                break;
            }
        }
        if(flag)
        System.out.println("Prime");
        else
        System.out.println("Not Prime");
    }
}
