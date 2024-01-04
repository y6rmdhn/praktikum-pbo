package tugasPbo;

public class GajiPegawai {
        private String nama;
        private String alamat;
        private int uangTransport;
        private int uangTunjangan;
        private int gajiPokok;
        private int totalGaji;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public int getUangTransport() {
            return uangTransport;
        }

        public void setUangTransport(int uangTransport) {
            this.uangTransport = uangTransport;
        }

        public int getUangTunjangan() {
            return uangTunjangan;
        }

        public void setUangTunjangan(int uangTunjangan) {
            this.uangTunjangan = uangTunjangan;
        }

        public int getGajiPokok() {
            return gajiPokok;
        }

        public void setGajiPokok(int gajiPokok) {
            this.gajiPokok = gajiPokok;
        }

        public int getTotalGaji() {
            return totalGaji;
        }

        public void setTotalGaji(int totalGaji) {
            this.totalGaji = totalGaji;
        }

        public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok) {
            return uangTunjangan + uangTransport + gajiPokok;
        }

        public void tampilanData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji) {
            setNama(nama);
            setAlamat(alamat);
            setUangTunjangan(uangTunjangan);
            setUangTransport(uangTransport);
            setGajiPokok(gajiPokok);
            setTotalGaji(totalGaji);
        }

        public static void main(String[] args) {
            GajiPegawai pegawai = new GajiPegawai();

            pegawai.tampilanData("Rizki Adam Kurniawan", "Jalan Semar Dalam 4 No 72/66", 300000, 250000, 4500000, pegawai.totalGaji(300000, 250000, 4500000));

            System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
            System.out.println("---------------------");
            System.out.println("Nama Karyawan: " + pegawai.getNama());
            System.out.println("Alamat: " + pegawai.getAlamat());
            System.out.println("Uang Transport: Rp. " + pegawai.getUangTransport());
            System.out.println("Uang Tunjangan: Rp. " + pegawai.getUangTunjangan());
            System.out.println("Gaji Pokok: Rp. " + pegawai.getGajiPokok());
            System.out.println("TOTAL GAJI: Rp. " + pegawai.getTotalGaji());
        }
}
