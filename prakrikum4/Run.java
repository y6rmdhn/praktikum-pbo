package prakrikum4;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int saldo, tariktunai;

        System.out.print("Masukan Jumlah Saldo : ");
        saldo = input.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        System.out.print("Saldo Awal : "+tabungan.saldo);

        System.out.print("\nMasukan Saldo Penarikan : ");
        tariktunai = input.nextInt();
        tabungan.ambilUang(tariktunai);
        System.out.print("Jumlah Uang yang diambil : "+tariktunai);
        System.out.print("\nSaldo Sekarang : "+tabungan.saldo);
    }
}
