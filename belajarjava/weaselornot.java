import java.util.Scanner;

public class weaselornot {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String kataString;
        boolean yep, nope;

        System.out.println("Type the word \"wiesel\", please");
        kataString = keyboard.next();

        yep = kataString.equals("wiesel");
        nope = !kataString.equals("wiesel");

        System.out.println("You typed what was requested: " + yep);
        System.out.println("You typed what was not requested: " + nope);
    }
}



