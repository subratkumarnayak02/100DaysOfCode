import java.util.*;
import java.lang.Math; 
public class Armstrong_number {
    public static void main(String[] args) {
        int sum = 0,digits=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int temp = n;

        while(temp>0)    
        {   
            temp = temp/10;   
            digits+=1;   
        } 

        while(temp>0){
            int last = temp % 10;
            Double power =  (Math.pow(last, digits));
            sum += power;
            temp/=10;
        }
        if (n==sum)
            {System.out.println(n+" is an Armstrong number");}
        else
            {System.out.println(n+" is not an Armstrong number");}
        
        sc.close();
    }
}