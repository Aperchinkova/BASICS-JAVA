package methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double numInput=Double.parseDouble(scanner.nextLine());
        double powerInput=Double.parseDouble(scanner.nextLine());
        double np=mathPower(numInput,powerInput);
        DecimalFormat df=new DecimalFormat("0.####");
        System.out.println(df.format(np));
    }
    public static Double mathPower(double num,double power)
    {
        double result=1;
        for(int i=1;i<=power;i++)//1,2,3,4 puti
        {
            result=result*num;//resulta shte go umnajavam s num-a
        }
        return result;
    }

}
