import java.util.Scanner;

public class Jobvacancy {
   
    public static void main(String[] args) {
        //variable yang di perlukan
        int umur, pengalaman;
        double penampilan;
        String  nama, lulusan, jeniskelamin;
        boolean reqKoor1,reqKoor2,reqKoor3,reqAdmin, reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        Scanner input = new Scanner(System.in);

        //output
        System.out.println("Selamat Datang di PT.Cinta Sejahtera");
        System.out.println("==================================\n");
        System.out.println("Masukan data diri anda");
        System.out.println("Nama : ");
        nama = input.next();
        System.out.println("Umur : ");
        umur = input.nextInt();
        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jeniskelamin = input.next();
        System.out.println("Lulusan (SMK/D3/S1)");
        lulusan = input.next();
        System.out.println("Pengalaman : ");
        pengalaman = input.nextInt();
        System.out.println("Penampilan");
        penampilan = input.nextDouble();
     
       reqKoor1 = jeniskelamin.equals("Pria") && umur >=21 && umur <=30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >=7 ;
      
       reqKoor2 = jeniskelamin.equals("Wanita") && umur >=20 && umur <=30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >=8 ;
       
       reqKoor3 = (jeniskelamin.equalsIgnoreCase("Pria")|| lulusan.equalsIgnoreCase("Wanita")) && umur >=20 && umur <=30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) ;
      isPassingKoor = reqKoor1|| reqKoor2;

    reqAdmin = (jeniskelamin.equalsIgnoreCase("Pria")|| lulusan.equalsIgnoreCase("Wanita")) && umur >=25 && umur <=40 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) ;
    
    reqAdmin2 = (jeniskelamin.equalsIgnoreCase("Pria")|| lulusan.equalsIgnoreCase("Wanita")) && umur >=25 && umur <=40 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) ;
    
    isPassingAdmin = reqAdmin || reqAdmin2;

    //Hasil tes
    System.out.println();
    System.out.println(nama+"Terimakasih telah mengisi data dari perusahaan kami /n");
    System.out.println("Berikut adalah hasil untuk Lowongan Kami");
    System.out.println("Hasil Kelulusan Koordinator :"+isPassingKoor);
    System.out.println("Hasil Kelulusan Admin :" + isPassingAdmin);
   

        
        
        
    

    }
}
