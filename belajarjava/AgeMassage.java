import java.util.Scanner;
public class AgeMassage {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int Umur ;

    System.out.println("Berapa Umurmu?");
    Umur = input.nextInt();

        if (Umur >= 18) {
            System.out.println("kamu dapat membuat SIM");
        }

        if(Umur >= 17){
            System.out.println("Kamu dapat membuat KTP");
        }
        if(Umur >=25){
            System.out.println("Menikah di usia Ideal");
        }
 

}
}