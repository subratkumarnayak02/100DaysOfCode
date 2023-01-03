import java.util.*;

public class Nested_try{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the size of array: ");
            int n=sc.nextInt();
            int []num=new int[n];
    
            System.out.println("Enter the numbers in array: ");
            for(int i=0;i<n;i++){
                num[i]=sc.nextInt();
            }
            
            try {
                System.out.println("Enter index of numbers to divide: ");
                int n1=sc.nextInt();
                int n2=sc.nextInt();
                System.out.println("Result: "+num[n1]/num[n2]);
            } catch (ArithmeticException e) {
                System.out.println("Error!!!"); 
                //System.out.println("Error1!!!");
                System.out.println(e.getMessage());
            } catch(InputMismatchException e){
                System.out.println("Error!!!");
                //System.out.println("Error2!!!");
                System.out.println(e.getMessage());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error!!!");
            //System.out.println("Error3!!!");
            System.out.println("Type of error: "+e.getMessage());
        }
    }
}