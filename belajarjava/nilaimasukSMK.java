import java.util.Scanner;

public class nilaimasukSMK {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner( System.in);
    int nilai;
    boolean allowed;

    System.out.println("Berapa nilai Matematika ?");
    nilai = keyboard.nextInt();

    System.out.println("Berapa nilai B.Indonesia ?");
    nilai = keyboard.nextInt();

    System.out.println("Berapa nilai IPA ?");
    nilai = keyboard.nextInt();

    allowed=(nilai > 75 && nilai < 100);

    System.out.println("LULUS?"+allowed);
  }  

}
