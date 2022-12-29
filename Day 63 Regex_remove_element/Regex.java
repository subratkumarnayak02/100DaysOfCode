package String;

import java.util.*;

class Regex {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.println("Enter the character or string to remove from the given string: ");
        String str1=in.nextLine();
        System.out.print("\n ");
        in.close();

        System.out.print("All `"+str1+"` Removed Successfully..!!\nNew String is :  " + rem_The(str,str1)+"\n");
    }
 public static String rem_The(String str,String str1)
    {
        String str2 = "";
        str2 = str.replaceAll(str1, "");
        return str2;
    }
}