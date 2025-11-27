public class countdigit {

    public static void main(String args[])
    {
        int n=8678,cnt=0;

        while(n>0)
        {
            n=n/10;
            cnt++;
        }
        System.out.println("ttal count"+cnt);
    }
    
}
