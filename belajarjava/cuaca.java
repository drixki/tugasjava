import java.util.Scanner;


public class cuaca {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        String cuaca;

        System.out.println("Cuaca Sore Hari ini?");
        cuaca = input.nextLine();

        if (cuaca.equals("hujan")) {
            System.out.println("Saya tidak akan basket");
        }
        else if (cuaca.equals("cerah") || cuaca.equals("Panas")) {
            System.out.println("Saya akan latihan");
        }
        else if (cuaca.equals("Mendung")) {
             System.out.println("Saya akan latihan");
        }
        else {
            System.out.println("DIAM");
        }
    }
}
