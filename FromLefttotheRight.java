package DataTypesAndVariablesMoreExcercise;

import javax.naming.NamingEnumeration;
import java.util.Scanner;

public class FromLefttotheRight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int sum=0;
        for(int i=0;i<n;i++)
        {
            String number= scanner.nextLine();
            String s[]=number.split(" ");
            long out[]=new long[s.length];
            for(int j=0;j<s.length;j++)
            {
                out[j]=Long.parseLong(s[j]);
            }
            if(out[0]>out[1])
            {
                while(out[0]>0)
                {
                    long last=out[0]%10;
                    sum+=last;
                    out[0]/=10;
                }
                System.out.println(Math.abs(sum));
                sum=0;
            }else if(out[0]<out[1])
            {
                while(out[1]>0)
                {
                    long last=out[1]%10;
                    sum+=last;
                    out[1]/=10;
                }
                System.out.println(Math.abs(sum));
                sum=0;
            }else if(out[0]==out[1])
            {
                while(out[1]>0)
                {
                    long last=out[1]%10;
                    sum+=last;
                    out[1]/=10;
                }
                System.out.println(Math.abs(sum));
                sum=0;
            }

        }
    }
}
