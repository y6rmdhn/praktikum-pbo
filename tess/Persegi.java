package tess;

public class Persegi {
        private double sisi;

        // Mendapatkan nilai sisi
        public double getSisi() {
            return sisi;
        }

        // Mengatur nilai sisi
        public void setSisi(double sisi) {
            this.sisi = sisi;
        }

        // Menghitung keliling persegi
        public double hitungKeliling() {
            return 4 * sisi;
        }

        // Menghitung luas persegi
        public double hitungLuas() {
            return sisi * sisi;
        }
}
