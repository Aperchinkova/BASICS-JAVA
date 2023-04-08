package EXAM;

import java.util.Scanner;

public class DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String[] parts = input.split(" ");
            String command = parts[0];
            switch (command) {
                case "Replace":
                    String currentChar = parts[1];
                    String newChar = parts[2];
                    text = text.replaceAll(currentChar, newChar);
                    System.out.println(text);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(parts[1]);
                    int endIndex = Integer.parseInt(parts[2]);
                    /*
                    if(!isValid(startIndex,endIndex,text))
                    {

                        break;
                    }

                     */
                    if(!isValid(startIndex,endIndex,text))
                    {
                        System.out.println("Invalid indices!");
                        break;
                    }
                    String substring = text.substring(startIndex, endIndex + 1);

                    text = text.replace(substring, "");
                    if(text.length()>0)
                    {
                        System.out.println(text);
                    }

                    break;
                case "Make":
                    String letters = parts[1];
                    if (letters.equals("Upper")) {
                        text = text.toUpperCase();

                    } else if (letters.equals("Lower")) {
                        text = text.toLowerCase();

                    }
                    if(text.length()>0)
                    {
                        System.out.println(text);
                    }
                    break;
                case "Check":
                    String string = parts[1];
                    if (text.contains(string)) {
                        System.out.println("Message contains " + string);
                    } else {
                        System.out.println("Message doesn't contain " + string);
                    }
                    break;
                case "Sum":
                    int index1 = Integer.parseInt(parts[1]);
                    int index2 = Integer.parseInt(parts[2]);
                    if(!isValid(index1,index2,text))
                    {
                        System.out.println("Invalid indices!");
                        break;
                    }
                    String get = text.substring(index1, index2 + 1);
                    int sum = 0;

                    for (int i = 0; i < get.length(); i++) {
                        char symbol = get.charAt(i);
                        sum += (int) symbol;

                    }
                    System.out.println(sum);
                   /*
                    else {
                        System.out.println("Invalid indices!");
                    }

                    */
                    break;
            }
            input = scanner.nextLine();
        }
    }
    private static boolean isValid(int index1,int index2,String text){
        return index1>=0 && index2<=text.length()-1;
    }
}
