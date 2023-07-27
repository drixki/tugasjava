import java.util.Scanner;

public class Forgetfullmachine{
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Apa yang kamu sukai?");
            keyboard.next();

            System.out.println("pilih angka 1 sampai 10?");
            keyboard.nextInt();

            System.out.println("pilih antara 1,90 dan 2,0");
            keyboard.nextDouble();

            System.out.println("Apa yang kamu sukai?");
            keyboard.next();

        }
    }
  
}