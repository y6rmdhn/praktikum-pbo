package praktikum2;
import java.util.Scanner;

public class PengkondisianSwitch {
    public static void main(String[] args) {
//        inisialisasi
        int angka1, angka2, hasil;
        String perhitungan;
        Scanner input = new Scanner(System.in);
//        input user
        System.out.print("masukan angka 1 : ");
        angka1 = input.nextInt();

        System.out.print("masukan angka 2 : ");
        angka2 = input.nextInt();
        System.out.print("list perhitungan : "
                + "\n + : pertambahan"
                + "\n - : pengurangan"
                + "\n * : perkalian"
                + "\n / : pembagian"
                + "\n Masukan Simbol Perhitungan : "
        );
        perhitungan = input.next();
//        kondisi switch
        switch (perhitungan){
            case "+":
                hasil = angka1 + angka2;
                System.out.print("hasilnya adalah : " +hasil);
                break;
            case "-":
                hasil = angka1 - angka2;
                System.out.print("hasilnya adalah : " +hasil);
                break;
            case "*":
                hasil = angka1 * angka2;
                System.out.print("hasilnya adalah : " +hasil);
                break;
            case "/":
                hasil = angka1 / angka2;
                System.out.print("hasilnya adalah : " +hasil);
                break;
            default:
                System.out.print("Simbol yg dimasukan tidak sesuai");
        }
    }
}
