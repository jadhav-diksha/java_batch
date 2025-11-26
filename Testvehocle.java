class Vehicle
{
    String brand;
    int speed;

    void displayinfo()
    {
        System.out.println("brand is" +brand);
        System.out.println("speed" +speed);
    }
}

    class Car extends Vehicle
    {
        int seats;

        @Override
        void displayinfo()
        {
            System.out.println("brand is" +brand);
           System.out.println("speed" +speed);
            System.out.println("seats are" +seats);
        }
    }

public class Testvehocle {

    public static void main(String args[]){

    Vehicle v1=new Vehicle();

    v1.brand="thar";
    v1.speed=101;
    

     Car c1 = new Car();
        c1.brand = "BMW";
        c1.speed = 220;
        c1.seats = 4;

        c1.displayinfo();
        v1.displayinfo();

    }

}
