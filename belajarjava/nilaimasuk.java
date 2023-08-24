import java.util.Scanner;

public class nilaimasuk {
    public static void main(String[] args) {
        int MTK,ENG,IND,IPA ; //Variable untuk menyimpan nilai ujian
        int PassingDKV,PassingPPL,PassingMLG;//variable meyimpan nilai kelulusan
        
        boolean isPassingDKV,isPassingPPL,isPassingMLG;//Variable bertipe boolean untuk hasil
        double avarageUjian, avarageBahasa;

        Scanner input = new Scanner(System.in);

        //inisialisasi nilai
        PassingDKV = 75;
        PassingPPL = 80;
        PassingMLG = 85;

        System.out.println("Masukan Nilai Ujian MTK");
        MTK = input.nextInt();

        System.out.println("Masukan Nilai Ujian ENG");
        ENG = input.nextInt();

        System.out.println("Masukan Nilai Ujian IND");
        IND= input.nextInt();

        System.out.println("Masukan Nilai Ujian IPA");
        IPA = input.nextInt();

        //menghitung nilai rata rata nilai ujian
        avarageUjian =(MTK+ENG+IND+IPA)/4;

        //menghitung nilai bahasa
        avarageBahasa =(ENG+IND)/2;

        //boolean expression 

        //menentukan nilai masuk DKV
        isPassingDKV = avarageUjian>= PassingDKV;

        //menentukan nilai masuk PPL
         isPassingPPL = avarageBahasa>= PassingPPL;

         //menentukan nilai masuk MLG
         isPassingMLG = MTK >PassingMLG;


         System.out.println("\n\n Hasil dari Nilai Ujian sebagai Berikut :");
         System.out.println("==============================");
         System.out.println("Apakah memenuhi syarat untuk masuk DKV :" + isPassingDKV);
         System.out.println("Apakah memenuhi syarat untuk masuk PPL :" + isPassingPPL);
         System.out.println("Apakah memenuhi syarat untuk masuk MLG :" + isPassingMLG);
    }
}
