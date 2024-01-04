package tugasPbo;

public class BolaBaseball {
        private double massa;
        private double kecepatanAwal;
        private double energiKinetik;
        private double usaha;

        public BolaBaseball(double massa, double kecepatanAwal) {
            this.massa = massa;
            this.kecepatanAwal = kecepatanAwal;
        }

        public void hitungEnergiKinetik() {
            energiKinetik = Fisika.hitungEnergiKinetik(massa, kecepatanAwal);
        }

        public void hitungUsaha() {
            double kecepatanAkhir = 25.0; // Kecepatan akhir yang ingin dicapai
            usaha = Fisika.hitungUsaha(massa, kecepatanAwal, kecepatanAkhir);
        }

        public static void main(String[] args) {
            double massaBola = 145.0 / 1000.0; // Massa dalam kg (145 g)
            double kecepatanAwalBola = 0.0; // Bola dimulai dari keadaan diam

            BolaBaseball bola = new BolaBaseball(massaBola, kecepatanAwalBola);

            bola.hitungEnergiKinetik();
            bola.hitungUsaha();

            System.out.println("a. Energi Kinetik bola baseball: " + bola.energiKinetik + " joule");
            System.out.println("b. Usaha yang dilakukan pada bola untuk mencapai kecepatan ini: " + bola.usaha + " joule");
        }
    }

    class Fisika {
        public static double hitungEnergiKinetik(double massa, double kecepatan) {
            return 0.5 * massa * kecepatan * kecepatan;
        }

        public static double hitungUsaha(double massa, double kecepatanAwal, double kecepatanAkhir) {
            return 0.5 * massa * (kecepatanAkhir * kecepatanAkhir - kecepatanAwal * kecepatanAwal);
        }
    }
