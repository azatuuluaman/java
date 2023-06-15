import java.util.Scanner;

public class Switch { // вместо кучу if
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        String age = scanner.nextLine();
        switch (age){
            case "ноль" :
                System.out.println("you borned");
                break;
            case "семь" :
                System.out.println("you went to school");
                break;
            case "восемнадцать" :
                System.out.println("you graduated school");
                break;


        }


    }
}
