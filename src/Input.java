import java.util.Scanner;

public class Input {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input something");
//        String string = s.nextLine(); input for string
        int x = s.nextInt();  // input for integer
        System.out.println("Вы ввели " + x);

    }
}
