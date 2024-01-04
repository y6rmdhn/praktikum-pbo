package tess;

public class Kalkulator {
        private double value1;
        private double value2;

        // Konstruktor untuk inisialisasi objek Kalkulator dengan dua nilai awal
        public Kalkulator(double value1, double value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        // Metode untuk operasi penambahan
        public double tambah() {
            return value1 + value2;
        }

        // Metode untuk operasi pengurangan
        public double kurang() {
            return value1 - value2;
        }

        // Metode untuk operasi perkalian
        public double kali() {
            return value1 * value2;
        }

        // Metode untuk operasi pembagian
        public double bagi() {
            if (value2 != 0) {
                return value1 / value2;
            } else {
                System.out.println("Tidak bisa dibagi dengan nol.");
                return Double.NaN; // Not-a-Number
            }
        }

        public static void main(String[] args) {
            // Membuat objek Kalkulator dengan dua nilai awal
            Kalkulator kalkulator = new Kalkulator(7.0, 5.0);

            // Menggunakan objek Kalkulator untuk melakukan operasi
            double hasilTambah = kalkulator.tambah();
            double hasilKurang = kalkulator.kurang();
            double hasilKali = kalkulator.kali();
            double hasilBagi = kalkulator.bagi();

            // Menampilkan hasil operasi
            System.out.println("Nilai 1 = " + kalkulator.value1);
            System.out.println("Nilai 2 = " + kalkulator.value2);
            System.out.println("Hasil Penjumlahan = " + hasilTambah);
            System.out.println("Hasil Pengurangan = " + hasilKurang);
            System.out.println("Hasil Perkalian = " + hasilKali);
            System.out.println("Hasil Pembagian = " + hasilBagi);
        }
}
