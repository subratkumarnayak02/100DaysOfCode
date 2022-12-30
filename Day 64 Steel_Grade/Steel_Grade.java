import java.util.*;

class Steel_Grade{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter a Hardness: ");  
        int h = sc.nextInt(); 
        System.out.println("Enter a Carbon content: ");  
        double c = sc.nextDouble();
        System.out.println("Enter a Tensile strength: ");  
        int t = sc.nextInt();
        sc.close();

        if (h>=50 && c<=0.7 && t>=5600) {
            System.out.println("Grade is 10");
        }
        else if (h>=50 && c<=0.7) {
            System.out.println("Grade is 9");
        }
        else if (c<=0.7 && t>=5600) {
            System.out.println("Grade is 8");
        }
        else if (h>=50 && t>=5600) {
            System.out.println("Grade is 7");
        }
        else if (h>=50 || c<=0.7 || t>=5600) {
            System.out.println("Grade is 6");
        }
        else 
            System.out.println("Grade is 5");
    }
}