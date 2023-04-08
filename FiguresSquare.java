import java.util.Scanner;

public class FiguresSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String shape=scanner.nextLine();
        double area=0.00;
        if(shape.equals("square")){
            double side=Double.parseDouble(scanner.nextLine());
            area=side*side;
        }else if(shape.equals("rectangle")){
            double sideA=Double.parseDouble(scanner.nextLine());
            double sideB=Double.parseDouble(scanner.nextLine());
            area=sideA*sideB;
        }else if(shape.equals("circle")){
            double radius=Double.parseDouble(scanner.nextLine());
            area=Math.PI*radius*radius;
        }else if(shape.equals("triangle")){
            double sideA=Double.parseDouble(scanner.nextLine());
            double height=Double.parseDouble(scanner.nextLine());
            area=(sideA*height)/2;
        }
        System.out.printf("%.3f",area);
    }
}
