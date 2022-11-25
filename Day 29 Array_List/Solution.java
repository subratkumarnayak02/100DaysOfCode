import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<Integer> L = new ArrayList<Integer>(N);
        
        for (int i = 0; i < N; i++)
        {
            L.add(sc.nextInt());
        }
        
        
        int m = sc.nextInt();
        
        for (int i = 0; i < m; i++)
        {
            String op = sc.next();
            
            if (op.equals("Insert"))
            {
                int index = sc.nextInt();
                int value = sc.nextInt();
                L.add(index, value);
            }
            
            else if (op.equals("Delete"))
            {
                int index = sc.nextInt();
                L.remove(index);
            }
        }
        
        for (int element: L)
            
        {
            System.out.print(element + " ");
        }
        
        
    }
}
