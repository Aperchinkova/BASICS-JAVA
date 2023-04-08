package ExamPreparation30July;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Pattern pattern=Pattern.compile("(?<barcode>@[#]{1,}[A-Z][A-Za-z0-9]{4,}[A-Z]@[#]+)");
        Pattern isDigit=Pattern.compile("\\d+");
        for (int i=0;i<n;i++)
        {
            String barcode= scanner.nextLine();
            Matcher matcher=pattern.matcher(barcode);

            if(matcher.find())//@###Brea0D@###
            {
                String conc="";
                char[] symbols=barcode.toCharArray();
                for(int j=0;j< symbols.length;j++)
                {

                    char sym=barcode.charAt(j);
                    if (Character.isDigit(sym))
                    {
                        conc=conc+sym+"";
                    }
                }
                if(conc.isEmpty())
                {
                    System.out.println("Product group: 00");
                }else{
                    System.out.printf("Product group: %s%n",conc);
                }

            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
