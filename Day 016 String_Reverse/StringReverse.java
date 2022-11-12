import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        
        boolean palin = true;
        
        for(int i = 0; i<A.length()/2;i++)
        {
            if(!A.substring(i,i+1).equals(A.substring(A.length()-i-1,A.length()-i)))
            {
                palin = false;
            }
        }
        if(palin){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        
    }
}
