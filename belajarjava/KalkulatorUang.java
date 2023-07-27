import java.util.Scanner;

public class KalkulatorUang {
    public static void main(String[] args) {
        String name;
        int moneyspent;
        double avarage;
        int total;
        int totalday =7;

        Scanner input = new Scanner(System.in);
        System.out.println("Hitung Uangmu!!!");

        System.out.println("Hai,Siapa namamu?");
        name = input.nextLine();

        System.out.println("Berapa Uang yang kamu keluarkan untuk Jajan hari senin?");
        moneyspent = input.nextInt();

        total = moneyspent;

            System.out.println("Berapa Uang yang kamu keluarkan untuk Jajan hari selasa?");
            moneyspent = input.nextInt();

            total = total + moneyspent;

            System.out.println("Berapa Uang yang kamu keluarkan untuk Jajan hari rabu?");
            moneyspent = input.nextInt();

            total = total + moneyspent;

            System.out.println("Berapa Uang yang kamu keluarkan untuk Jajan hari kamis?");
            moneyspent = input.nextInt();

            total = total + moneyspent;

            System.out.println("Berapa Uang yang kamu keluarkan untuk Jajan hari jumat?");
            moneyspent = input.nextInt();

            total = total + moneyspent;

            System.out.println("Berapa Uang yang kamu keluarkan untuk Jajan hari sabtu?");
            moneyspent = input.nextInt();

            total = total + moneyspent;

            System.out.println("Berapa Uang yang kamu keluarkan untuk Jajan hari minggu?");
            moneyspent = input.nextInt();

            total = total + moneyspent;

            avarage = (double) total/totalday;

            System.out.println("Hi Dea");
            System.out.println("Ini hasil uang yang kamu keluarkan selama seminggu"+total);
            System.out.println("Ini rata rata uangnya"+avarage);

        }
}
