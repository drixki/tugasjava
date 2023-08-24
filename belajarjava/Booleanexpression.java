import java.util.Scanner;

 public class Booleanexpression {
    public static void main ( String[] args){
        Scanner keyboard = new Scanner(System.in);
        Boolean a, b, c, d, e, f;
        double x, y;

        System.out.print("Give me to number. First:");
        x = keyboard.nextDouble();
        System.out.print("Second:");
        y = keyboard.nextDouble();

        a = (x < y);
        b =(x <= y);
        c =(x == y);
        d =(x != y);
        e =(x > y);
        f =(x >= y);

        System.out.println(x +"Kurang Dari"+ y + ": " + a);
        System.out.println(x +"Kurang Dari/Sama dengan"+y+": "+b);
        System.out.println(x+"Sama Dengan"+y+": "+ c);
        System.out.println(x+"Tidak Sama Dengan"+y+": "+ d);
        System.out.println(x+"Lebih Dari"+ y +": " + e);
        System.out.println("Lebih Dari/Sama Dengan" + y +": " + f);
        System.out.println("");

        System.out.println(!(x < y) +" "+(x >= y));
        System.out.println(!(x <= y) +" "+(x > y));
        System.out.println(!(x == y) +" "+(x != y));
        System.out.println(!(x != y) +" "+(x == y));
        System.out.println(!(x > y) +" "+(x <= y));
        System.out.println(!(x <= y) +" "+(x > y));
        


   }
    
 }