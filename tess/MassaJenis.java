package tess;

public class MassaJenis {
        // Method untuk menghitung volume kubus
        public static int hitungVolume(int sisi) {
            return sisi * sisi * sisi;
        }

        // Method untuk menghitung massa jenis kubus
        public static double hitungMassaJenis(int massa, int volume) {
            return (double) massa / volume;
        }

        public static void main(String[] args) {
            // Input sisi dan massa dari kubus
            int sisiKubus = 5;
            int massaKubus = 250;

            // Menghitung volume kubus
            int volumeKubus = hitungVolume(sisiKubus);

            // Menghitung massa jenis kubus
            double massaJenisKubus = hitungMassaJenis(massaKubus, volumeKubus);

            // Menampilkan output
            System.out.println("======Massa Jenis Kubus======");
            System.out.println("Sisi : " + sisiKubus);
            System.out.println("Massa : " + massaKubus);
            System.out.println(" ");
            System.out.println("======Hasil Perhitungan======");
            System.out.println("Volume : " + volumeKubus);
            System.out.println("Massa Jenis : " + massaJenisKubus);
        }
}
