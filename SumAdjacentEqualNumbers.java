package list;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Double> numbersList=new ArrayList<>();
       /*
        for (int i=0;i<numbs.length-1;i++)
        {
            double num=n;
        }


        */
        System.out.println(join(numbersList," "));

    }
    public static String join(List<Double> list, String delimiter) {
        String result = "";
        for (Double num : list) {
            DecimalFormat df = new DecimalFormat("0.#");

            String numFormat = df.format(num) + delimiter;

            result += numFormat;
        }

        return result;
    }

}
