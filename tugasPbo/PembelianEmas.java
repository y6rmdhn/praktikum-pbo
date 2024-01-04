package tugasPbo;

public class PembelianEmas {
        private double beratEmas;
        private double hargaEmasPerGram;

        public PembelianEmas(double beratEmas, double hargaEmasPerGram) {
            this.beratEmas = beratEmas;
            this.hargaEmasPerGram = hargaEmasPerGram;
        }

        public double hitungTotalBiaya() {
            return beratEmas * hargaEmasPerGram;
        }

        public static void main(String[] args) {
            double beratEmas = 15.7; // Berat emas dalam gram
            double hargaEmasPerGram = 570000.0; // Harga 1 gram emas per bulan Oktober

            PembelianEmas pembelianEmas = new PembelianEmas(beratEmas, hargaEmasPerGram);

            double totalBiaya = pembelianEmas.hitungTotalBiaya();

            System.out.println("Total bayar yang harus dikeluarkan oleh Hendi: Rp. " + totalBiaya);
        }
    }
