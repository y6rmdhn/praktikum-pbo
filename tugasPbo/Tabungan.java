package tugasPbo;
import java.util.Scanner;

public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int ambilUang(int jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi.");
            return 0;
        } else {
            saldo -= jumlah;
            return jumlah;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("======Program Penarikan Uang======");

        System.out.print("Masukkan saldo awal: ");
        int saldoAwal = input.nextInt();

        System.out.print("jumlah uang yang akan diambil: ");
        int jumlahUangDiambil = input.nextInt();

        Tabungan tabungan = new Tabungan(saldoAwal);

        int uangDiambil = tabungan.ambilUang(jumlahUangDiambil);

        if (uangDiambil > 0) {
            System.out.println("Saldo anda sekarang: " + tabungan.saldo);
        }

        input.close();
    }
}
