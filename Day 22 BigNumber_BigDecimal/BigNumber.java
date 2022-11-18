import java.math.BigDecimal;
import java.util.*;
class BigNumber{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        System.out.println("\n");
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1 == null || s2 == null) {
                    return 0;
                }
                BigDecimal bd1 = new BigDecimal(s1);
                BigDecimal bd2 = new BigDecimal(s2);
                return bd2.compareTo(bd1);
            }
        });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}