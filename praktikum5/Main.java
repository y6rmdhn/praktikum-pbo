package praktikum5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nama, warna;
        int berat;
        Scanner input = new Scanner(System.in);
        Dinosaurus DinoSaya = new Dinosaurus();

        System.out.print("Masukan nama Dino : ");
        nama = input.next();

        System.out.print("Masukan warna Dino : ");
        warna = input.next();

        System.out.print("Masukan berat Dino : ");
        berat = input.nextInt();


        DinoSaya.identitas(nama, warna, berat);
        System.out.println("Dinosaurus saya namanya "+DinoSaya.ambilNama()+", "
        +" warnanya "+DinoSaya.ambilWarna()+", "+" beratnya "+DinoSaya.ambilBerat()+" Kg, "+" ada di teras lagi makan batu");
    }
}
