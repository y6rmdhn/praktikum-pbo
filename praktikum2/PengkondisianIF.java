package praktikum2;
import java.util.Scanner;

public class PengkondisianIF {
    public static void main(String[] args) {
//        inisialisasi
        int angka1, angka2, hasil, perhitungan;
        Scanner input = new Scanner(System.in);
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
//        kondisi IF
        if (perhitungan == 1){
            hasil = angka1 + angka2;
            System.out.print("hasil nya adalah : " + hasil);
        }else if (perhitungan == 2){
            hasil = angka1 - angka2;
            System.out.print("hasil nya adalah : " + hasil);
        }else if (perhitungan == 3) {
            hasil = angka1 * angka2;
            System.out.print("hasil nya adalah : " + hasil);
        }else if (perhitungan == 4) {
            hasil = angka1 / angka2;
            System.out.print("hasil nya adalah : " + hasil);
        } else {
            System.out.print("angka yg dimasukan salah!");
        }
    }
}
