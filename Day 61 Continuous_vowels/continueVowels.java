package String;

import java.util.*;

class continueVowels {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        str=str.toLowerCase();
        in.close();

        System.out.print("Number of  continues Vowels in the string: " + count_Vowels(str)+"\n");
    }
 public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                if (str.charAt(i+1) == 'a' || str.charAt(i+1) == 'e' || str.charAt(i+1) == 'i'
                    || str.charAt(i+1) == 'o' || str.charAt(i+1) == 'u')
                {
                count++;
                }
            }
        }
        return count;
    }
}