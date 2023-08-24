import java.util.Scanner;

public class nenekstrict {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner( System.in);
        int age;
        double income, cute;
        boolean allowed;

        System.out.println("Berapa Umurmu?");
        age = keyboard.nextInt();

        System.out.println("Berapa Penghasilanmu");
        income = keyboard.nextDouble();
        
        System.out.println("Seberapa lucu kamu dari skala 0.0 sampai 10.0?");
        cute = keyboard.nextDouble();

        allowed = ( age > 65 && age <100 && (income > 50000|| cute >= 8.5));

        System.out.println("Biarkan dia kencan dengan cucu anda?" + allowed);
    }

}
