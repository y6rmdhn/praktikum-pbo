package tess;

public class BiayaEmasKawin {
        private double beratEmas;          // Atribut untuk menyimpan berat emas dalam gram
        private double hargaEmasPerGram;   // Atribut untuk menyimpan harga emas per gram

        // Konstruktor untuk inisialisasi objek BiayaEmasKawin dengan berat emas dan harga emas per gram
        public BiayaEmasKawin(double beratEmas, double hargaEmasPerGram) {
            this.beratEmas = beratEmas;
            this.hargaEmasPerGram = hargaEmasPerGram;
        }

        // Metode untuk menghitung total biaya pembelian emas kawin
        public double hitungTotalBiaya() {
            return beratEmas * hargaEmasPerGram;
        }

        public static void main(String[] args) {
            double beratEmas = 15.7;           // Berat emas dalam gram
            double hargaEmasPerGram = 570000.0; // Harga 1 gram emas per bulan Oktober

            // Membuat objek BiayaEmasKawin dengan berat emas dan harga emas per gram
            BiayaEmasKawin biayaEmasKawin = new BiayaEmasKawin(beratEmas, hargaEmasPerGram);

            double totalBiaya = biayaEmasKawin.hitungTotalBiaya();

            System.out.println("Total biaya untuk emas kawin: Rp. " + totalBiaya);
        }
}
