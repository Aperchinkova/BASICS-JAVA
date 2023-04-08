import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String fruit=scanner.nextLine();
        String day=scanner.nextLine();
        double quantity=Double.parseDouble(scanner.nextLine());

        double price=0.0;

        if(day=="Monday" || day=="Tuesday" || day=="Wednesday" || day=="Thursday" || day=="Friday"){
            if(fruit=="banana"){
                price=quantity*2.50;
                System.out.printf("%.1f",price);
            }else if(fruit=="apple"){
                price=1.20*quantity;
                System.out.printf("%.1f",price);
            }else if(fruit=="orange"){
                price=0.85*quantity;
                System.out.printf("%.1f",price);
            }else if(fruit=="grapefruit"){
                price=1.45*quantity;
                System.out.printf("%.1f",price);
            }else if(fruit=="kiwi"){
                price=2.70*quantity;
                System.out.printf("%.1f",price);
            }else if(fruit=="pineapple"){
                price=5.50*quantity;
                System.out.printf("%.1f",price);
            }else if(fruit=="grapes"){
                price=3.85*quantity;
                System.out.printf("%.1f",price);
            }

        }else if(day=="Saturday"||day=="Sunday"){
            if(fruit=="banana"){
                price=quantity*2.70;

            }else if(fruit=="apple"){
                price=1.25*quantity;

            }else if(fruit=="orange"){
                price=0.90*quantity;

            }else if(fruit=="grapefruit"){
                price=1.60*quantity;

            }else if(fruit=="kiwi"){
                price=3.00*quantity;

            }else if(fruit=="pineapple"){
                price=5.60*quantity;

            }else if(fruit=="grapes"){
                price=4.20*quantity;

            }
            System.out.printf("%.1f",price);

        }else{
            System.out.println("error");
        }
;

    }
}
