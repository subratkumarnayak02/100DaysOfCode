import java.util.*;

//how to create custom exception..

class AgeInvalidException extends Exception{

    AgeInvalidException(){
        super("Age invalid");
    }
    AgeInvalidException(String message){
        super(message);
    }
}

public class Excep {
    public static void main(String[] args){
        
        try{

            System.out.println("Started...");//starting...

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1st number: ");
            int n1=sc.nextInt();

            System.out.println("Enter 2nd number: ");
            int n2=sc.nextInt();
            
            sc.close();
            System.out.println("\n");
            int result= n1/n2;
            System.out.println("Division is "+result);

            if(n2<10){
                throw new AgeInvalidException("Your age is invalid");
            }

        }
        catch(Exception e){
            System.out.println("Error !!!");
            System.out.println(e);// to print the type of exception occured
        }

        finally{
            //always gets executed
            System.out.println("This is final block... ");
        }
        System.out.println("Terminated...");//ending point
    }
}

