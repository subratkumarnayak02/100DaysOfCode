import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        ArrayList[] ar = new ArrayList[20000];
        Scanner sc=new Scanner(System.in);
        int lis = sc.nextInt();

        for(int i=0;i<lis;i++ ){
            ar[i] = new ArrayList();
            int num = sc.nextInt();
            for(int j=0;j<num;j++){
                int value=sc.nextInt();
                ar[i].add(value);
            }
        }
        
        int queries=sc.nextInt();
        for(int i=0;i<queries;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(ar[x-1].get(y-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}