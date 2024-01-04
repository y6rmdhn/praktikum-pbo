package praktikum1;
import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        Scanner input = new Scanner(System.in);

//        System.out.print("masukan angka 1 : ");
//        angka1 = input.nextInt();
//
//        System.out.print("masukan angka 2 : ");
//        angka2 = input.nextInt();
//
//        hasil = angka1 + angka2;
//        System.out.print("hasilnya : " + hasil);



        String nama, namaLengkap, full;
        System.out.print("masukan nama : ");
        nama = input.nextLine();

        System.out.print("masukan nama belakang : ");
        namaLengkap = input.nextLine();

        full = nama + " " + namaLengkap;
        System.out.print("hasilnya : " + full);
    }
}

