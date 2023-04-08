package list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Integer> numList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input=scanner.nextLine();
        while(!input.equals("end"))
        {
            List<String> commandLine=Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());
            String command= commandLine.get(0);
            int number=0;
            String type="";
            int sum=0;
            String condition="";
            switch(command)
            {
                case "Contains":
                    number=Integer.parseInt(commandLine.get(1));
                    if(numList.contains(number))
                    {
                        System.out.println("Yes");
                    }else
                    {
                        System.out.println("No such number");
                    }
                   // System.out.println();
                    break;
                case "Print":
                    type=commandLine.get(1);
                    if(type.equals("even"))
                    {
                        for(int i=0;i<numList.size();i++)
                        {
                            if(numList.get(i)%2==0)
                            {
                                if(numList.get(i)!=numList.get(numList.size()-1))
                                {
                                    System.out.print(numList.get(i)+" ");
                                }else
                                {
                                    System.out.print(numList.get(i)+"");
                                }

                            }
                        }
                    }else if(type.equals("odd"))
                    {
                        for(int i=0;i<numList.size();i++)
                        {
                            if(numList.get(i)%2==1)
                            {
                                if(numList.get(i)!=numList.get(numList.size()-1))
                                {
                                    System.out.print(numList.get(i)+" ");
                                }else
                                {
                                    System.out.print(numList.get(i)+"");
                                }

                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    type=commandLine.get(1);
                    for(int i=0;i<numList.size();i++)
                    {
                        sum+=numList.get(i);
                    }
                    System.out.println(sum);
                    //System.out.println();
                    break;
                case "Filter":
                    condition=commandLine.get(1);
                    number=Integer.parseInt(commandLine.get(2));
                    switch (condition)
                    {
                        case "<":
                            for(int i=0;i<numList.size();i++)
                            {
                                if(numList.get(i)<number)
                                {

                                    if(numList.get(i)!=numList.get(numList.size()-1))
                                    {
                                        System.out.print(numList.get(i)+" ");
                                    }else
                                    {
                                        System.out.print(numList.get(i)+"");
                                    }
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for(int i=0;i<numList.size();i++)
                            {
                                if(numList.get(i)>number)
                                {
                                    if(numList.get(i)!=numList.get(numList.size()-1))
                                    {
                                        System.out.print(numList.get(i)+" ");
                                    }else
                                    {
                                        System.out.print(numList.get(i)+"");
                                    }
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for(int i=0;i<numList.size();i++)
                            {
                                if(numList.get(i)>=number)
                                {
                                    if(numList.get(i)!=numList.get(numList.size()-1))
                                    {
                                        System.out.print(numList.get(i)+" ");
                                    }else
                                    {
                                        System.out.print(numList.get(i)+"");
                                    }
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for(int i=0;i<numList.size();i++)
                            {
                                if(numList.get(i)<=number)
                                {
                                    if(numList.get(i)!=numList.get(numList.size()-1))
                                    {
                                        System.out.print(numList.get(i)+" ");
                                    }else
                                    {
                                        System.out.print(numList.get(i)+"");
                                    }
                                }
                            }
                            System.out.println();
                            break;

                    }
                    //System.out.println();
                    break;

            }
           // System.out.println();
            input=scanner.nextLine();
        }
    }
}
