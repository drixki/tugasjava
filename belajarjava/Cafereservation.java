import java.util.Scanner;

public class Cafereservation {
    public static void main(String[] args) {
        String name, gender, day, result;
        int age;
        double appearance, money;

        Scanner input = new Scanner(System.in);

        result = "";

        System.out.println("Please insert your name?");
        name = input.next();

        System.out.println("How old are you?");
        age = input.nextInt();

        System.out.println("What is your Gender (Male/Female)");
        gender = input.next();

        System.out.println("How much attractive are you");
        appearance = input.nextDouble();

        System.out.println("How much money do you have?");
        money = input.nextDouble();

        System.out.println("What day do you want to make a reservation?");
        day = input.next();

        if (day.equalsIgnoreCase("Monday")) {
            if (age >= 20 && age <= 30 && money >= 500) {
                result = "Reservation successful, you can order on Monday. Young night.";
            } else {
                result = "Sorry, you can't order on Monday because it's for young night.";
            }
        } else if (day.equalsIgnoreCase("Tuesday")) {
            if (age >= 31 && age <= 50 && money >= 250) {
                result = "Reservation successful, you can order on Tuesday. Oldest night.";
            } else {
                result = "Sorry, you can't order on Tuesday because it's for Oldest night.";
            }
        } else if (day.equalsIgnoreCase("Wednesday")) {
            if (age >= 20 && age <= 35 && money >= 300) {
                result = "Reservation successful, you can order on Wednesday. Ladies night.";
            } else {
                result = "Sorry, you can't order on Wednesday because it's for Ladies night.";
            }
        } else if (day.equalsIgnoreCase("Thursday")) {
            if ((gender.equalsIgnoreCase("Male") && age >= 21 && age <= 30 && money >= 1000) || 
                (gender.equalsIgnoreCase("Female") && age >= 21 && age <= 30 && money >= 300 && appearance >= 8)) {
                result = "Reservation successful, you can order on Thursday. Single night.";
            } else {
                result = "Sorry, you can't order on Thursday because it's for single night.";
            }
        } else if (day.equalsIgnoreCase("Friday")) {
            if ((gender.equalsIgnoreCase("Male") && age >= 21 && age <= 25&& money >= 300 && appearance >=8) || 
                (gender.equalsIgnoreCase("Female") && age >= 31 && age <= 45 && money >= 1000 )) {
                result = "Reservation successful, you can order on Friday. Women night.";
            } else {
                result = "Sorry, you can't order on Friday because it's for Women night.";
            }
        }
        else if (day.equalsIgnoreCase("Saturday")) {
            if (age >= 18 && age <= 60 && money >= 100) {
                result = "Reservation successful, you can order on Saturday. Week end Freedom";
            } else {
                result = "Sorry, you can't order on Saturday because it's for Week end Freedom";
            }
        }
        else {
            result = "Invalid day selection.";
        }

        System.out.println(result);
    }
}
