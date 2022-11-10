import java.util.*;

public class Substring {

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String S = input.next();
        int start = input.nextInt();
        int end = input.nextInt();
        System.out.println(S.substring(start,end));
        input.close();
    }
}