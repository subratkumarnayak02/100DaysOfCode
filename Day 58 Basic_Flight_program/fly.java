import java.util.*;
class flight{
    int Flight;
    String Destination;
    float Distance;
    float Fuel;

    float CALFUEL(float d){
        Distance=d;
        if(Distance<=1000){
            d= 500;
        }
        else if(Distance>1000 && Distance<=2000){
            d= 1100;
        }
        else if(Distance>2000){
            d= 2200;
        }
        return d;
    }

    void FEEDINFO(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Flight number: ");
        Flight=sc.nextInt();
        System.out.println("Enter Flight Destination: ");
        Destination=sc.next();
        System.out.println("Enter Distance: ");
        Distance=sc.nextFloat();
        sc.close();

        Fuel=CALFUEL(Distance);
    }

    void ShowInfo()
    {
        System.out.println("Flight Number: "+Flight);
        System.out.println("Destination: "+Destination);
        System.out.println("Distance: "+Distance);
        System.out.println("Fuel requiered: "+Fuel);
    }
}

public class fly{
    public static void main(String[] args) {
        flight f=new flight();
        
        f.FEEDINFO();
        f.ShowInfo();

    }
}