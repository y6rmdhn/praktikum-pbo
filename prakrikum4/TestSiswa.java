package prakrikum4;
import java.util.Scanner;

public class TestSiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int npm;

        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukan Npm : ");
        npm = input.nextInt();

        Siswa anak = new Siswa();
        anak.setNama(nama);
        anak.setNrp(npm);

        System.out.print("Nama Siswa : "+anak.nama+ "\nNPM Siswa : "+ anak.nrp);
    }
}
