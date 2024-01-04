package praktikum3;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        int angka1, angka2, hasil, perhitungan, perulangan;
        Scanner input = new Scanner(System.in);

        System.out.print("masukan perulangan: " );
        perulangan = input.nextInt();

        for (int i = 1; 1 <= perulangan; i++){
            //        input user
            System.out.print("masukan angka 1 : ");
            angka1 = input.nextInt();

            System.out.print("masukan angka 2 : ");
            angka2 = input.nextInt();
            System.out.print("list perhitungan : "
                    + "\n 1 : pertambahan"
                    + "\n 2 : pengurangan"
                    + "\n 3 : perkalian"
                    + "\n 4 : pembagian"
                    + "\n Masukan Angka Perhitungan : "
            );
            perhitungan = input.nextInt();
//  kondisi if
            if (perhitungan == 1){
                hasil = angka1 + angka2;
                System.out.println("hasil nya adalah : " + hasil);
            }else if (perhitungan == 2){
                hasil = angka1 - angka2;
                System.out.println("hasil nya adalah : \" + hasil");
            }else if (perhitungan == 2) {
                hasil = angka1 * angka2;
                System.out.println("hasil nya adalah : \" + hasil");
            }else if (perhitungan == 2) {
                hasil = angka1 / angka2;
                System.out.println("hasil nya adalah : \" + hasil");
            } else {
                System.out.println("angka yg dimasukan salah!");
            }
        }
    }
}
