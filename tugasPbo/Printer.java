package tugasPbo;

import java.util.Scanner;

public class Printer {
        private int jmlCetak;
        private String nama;
        public int getJmlCetak() {
            return jmlCetak;
        }

        public void setJmlCetak(int jmlCetak) {
            this.jmlCetak = jmlCetak;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String cetak(String nama){
            return "Muhamd Yusup";
        }

        public void cetak(String nama, int jmlCetak){
            for(int i = 1; i <= jmlCetak; i++){
                System.out.println(i + ". " + nama);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Printer printer = new Printer();

            System.out.println("====Aplikasi Pencetak Nama====");

            System.out.print("Masukkan nama anda : ");
            String nama = scanner.nextLine();
            printer.setNama(nama);

            System.out.print("Mau cetak berapa kali? : ");
            int jmlCetak =  scanner.nextInt();
            printer.setJmlCetak(jmlCetak);

            System.out.println("Nama Anda : " + printer.getNama());
            System.out.println("Hasil Cetak : ");

            printer.cetak(printer.getNama(), printer.getJmlCetak());
        }
}
