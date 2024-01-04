package tess;
import java.util.Scanner;

public class Tabungan {
        private int saldo;  // Atribut saldo, bersifat private untuk melindungi data

        // Konstruktor untuk menginisialisasi saldo awal
        public Tabungan(int saldoAwal) {
            this.saldo = saldoAwal;
        }

        // Metode untuk mengatur (set) saldo baru
        public void setSaldo(int saldoBaru) {
            saldo = saldoBaru;
        }

        // Metode untuk mendapatkan (get) saldo
        public int getSaldo() {
            return saldo;
        }

        // Metode untuk melakukan penarikan uang
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

            // Membuat objek Tabungan dengan saldo awal yang diinputkan
            Tabungan tabungan = new Tabungan(saldoAwal);

            System.out.print("Jumlah uang yang akan diambil: ");
            int jumlahUangDiambil = input.nextInt();

            // Melakukan penarikan uang dan mendapatkan jumlah yang berhasil diambil
            int uangDiambil = tabungan.ambilUang(jumlahUangDiambil);

            if (uangDiambil > 0) {
                System.out.println("Uang yang diambil: " + uangDiambil);
                System.out.println("Saldo Anda sekarang: " + tabungan.getSaldo());
            } else {
                System.out.println("Saldo Anda tetap sama.");
            }

            input.close();
        }
    }
