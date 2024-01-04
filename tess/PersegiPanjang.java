package tess;

public class PersegiPanjang {
        private double panjang;
        private double lebar;

        // Mendapatkan nilai panjang
        public double getPanjang() {
            return panjang;
        }

        // Mengatur nilai panjang
        public void setPanjang(double panjang) {
            this.panjang = panjang;
        }

        // Mendapatkan nilai lebar
        public double getLebar() {
            return lebar;
        }

        // Mengatur nilai lebar
        public void setLebar(double lebar) {
            this.lebar = lebar;
        }

        // Menghitung keliling persegi panjang
        public double hitungKeliling() {
            return 2 * (panjang + lebar);
        }

        // Menghitung luas persegi panjang
        public double hitungLuas() {
            return panjang * lebar;
        }
}
