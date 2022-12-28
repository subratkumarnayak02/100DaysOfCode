import java.util.*;

public class marathon{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of runners: ");
        int num=sc.nextInt();

        String[] name=new String[num];
        int[] time=new int[num];

        System.out.println("Enter the name of runners with their timings: ");
        for(int i = 0;i<num;i++){

            System.out.println("Enter the name of runner "+(i+1)+" :");
            name[i]=sc.next();
            System.out.println("Enter the timing of runner "+(i+1)+" :");
            time[i]=sc.nextInt();
        }

        int min = time[0];
        int min2 = time[0];
        for (int i = 0; i < num; i++) {
            if (min > time[i]) {
                min = time[i];
            }
        }
        for (int i = 0; i < num; i++) {
            if (min == time[i]) {
                System.out.println("Fastest Runner is " + name[i] + " with time " + time[i]+"min");
                break;
            }
        }

        for (int i = 0; i < num; i++) {
            if (time[i] < min2) {
                if(time[i]==min){
                    continue;
                }
                min2 = time[i];
            }
        }
        for( int i=0 ; i< num; i++){
            if (min2 == time[i]) {
                System.out.println("Second Fastest Runner is " + name[i] + " with time " + time[i]+"min");
                break;
            }
        }
    }

        //System.out.println(max);
}