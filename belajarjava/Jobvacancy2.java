import java.util.Scanner;

public class Jobvacancy2 {
    public static void main(String[] args) {
        int umur, pengalaman;
        double penampilan;
        String lulusan, jenisKelamin, nama, posisi, hasil;
        boolean reqAdmin1, reqAdmin2, reqAdmin3, reqKoor1, reqKoor2, reqSPV1, reqSPV2;
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di PT.Cinta Sejahtera");
        System.out.println("==================================\n");
        System.out.println("Masukan data diri anda");
        System.out.println("Nama : ");
        nama = input.nextLine();
        System.out.println("Umur : ");
        umur = input.nextInt();
        input.nextLine(); 
        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jenisKelamin = input.nextLine();
        System.out.println("Lulusan (SMK/D3/S1)");
        lulusan = input.nextLine();
        System.out.println("Pengalaman berapa tahun : ");
        pengalaman = input.nextInt();
        System.out.println("Penampilan 1 s.d 10");
        penampilan = input.nextDouble();
        input.nextLine(); 
        System.out.println("Posisi (Admin,Kordinator,SPV)");
        posisi = input.nextLine();

        if (posisi.equalsIgnoreCase("Kordinator")) {
            reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
            reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 30 && (lulusan.equalsIgnoreCase("S1")) && pengalaman >= 5;

            if (reqKoor1 || reqKoor2) {
                hasil = "Selamat " + nama + ", Anda Lulus ke tahap selanjutnya untuk menjadi " + posisi;
            } else {
                hasil = "Maaf " + nama + ", Anda tidak lulus ke tahap selanjutnya untuk menjadi " + posisi;
            }
        } else if (posisi.equalsIgnoreCase("Admin")) {
            reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && (lulusan.equalsIgnoreCase("D3")) && (pengalaman >= 1 || penampilan >= 8);
            reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && (lulusan.equalsIgnoreCase("S1")) && pengalaman >= 3 && penampilan >= 8;
            reqAdmin3 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 30 && (lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2 && penampilan >= 8;

            if (reqAdmin1 || reqAdmin2 || reqAdmin3) {
                hasil = "Selamat " + nama + ", Anda Lulus ke tahap selanjutnya untuk menjadi " + posisi;
            } else {
                hasil = "Maaf " + nama + ", Anda tidak lulus ke tahap selanjutnya untuk menjadi " + posisi;
            }
        } else if (posisi.equalsIgnoreCase("SPV")) {
            reqSPV1 = (jenisKelamin.equalsIgnoreCase("Pria") || jenisKelamin.equalsIgnoreCase("Wanita")) && umur >= 23 && umur <= 30 && (lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2;
            reqSPV2 = (jenisKelamin.equalsIgnoreCase("Pria") || jenisKelamin.equalsIgnoreCase("Wanita")) && umur >= 35 && umur <= 35 && (lulusan.equalsIgnoreCase("D3")) && pengalaman >= 5;

            if (reqSPV1 || reqSPV2) {
                hasil = "Selamat " + nama + ", Anda Lulus ke tahap selanjutnya untuk menjadi " + posisi;
            } else {
                hasil = "Maaf " + nama + ", Anda tidak lulus ke tahap selanjutnya untuk menjadi " + posisi;
            }
        } else {
            hasil = "Posisi yang dimasukkan tidak valid.";
        }

        System.out.println("");
        System.out.println(nama + ", Terimakasih sudah mengikuti Lowongan ini");
        System.out.println("Berikut adalah hasil dari rekrutmen untuk Posisi " + posisi + " :");
        System.out.println(hasil);
    }
}
