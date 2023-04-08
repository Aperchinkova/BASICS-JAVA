package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] path=scanner.nextLine().split("\\\\");
        String[] file=path[path.length-1].split("\\.");
        String name=file[0];
        String ext=file[1];
        System.out.printf("File name: %s%n",name);
        System.out.printf("File extension: %s",ext);

    }
}
