import java.util.Scanner;

public class oldBokks {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //name of the book
        String book=scanner.nextLine();
        //inputing the name of the book
        String input=scanner.nextLine();

        //nomer na proverenite knigi
        int count=0;
        boolean isFound=false;//knigata ne e otkrita/ili e otkrita;moje da se promenq

        while(!input.equals("No More Books")){
            if(input.equals(book)){
                isFound=true;
                break;
            }
            count++;
            input=scanner.nextLine();
        }
        if(isFound){
            System.out.printf("You checked %d books and found it.",count);
        }else{
            System.out.printf("The book you search is not here!%nYou checked %d books.",count);
        }




    }
}
