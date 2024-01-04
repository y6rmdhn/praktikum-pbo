package tugas2;

/*
@author
NAMA                : Satrio Teguh Hutomo
KELAS               : Reguler C
NIM                 : 221106042963
Deskripsi Program   : Program Menampilkan Dosen dan Mahasiswa

*/

public class Manusia {
    public String nama;
    public int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void siapaKamu(){
        System.out.println("Saya manusia.");
    }

    class Dosen extends Manusia{
        private String nip;
        private String matakuliah;

        public String getNip() {
            return nip;
        }

        public void setNip(String nip) {
            this.nip = nip;
        }

        public String getMatakuliah() {
            return matakuliah;
        }

        public void setMatakuliah(String matakuliah) {
            this.matakuliah = matakuliah;
        }

        public void mengajarApa(){
            System.out.println("Saya "+nama+ " "+ umur+" tahun sedang mengajar matakuliah "+ matakuliah);
        }

        @Override public void siapaKamu(){
            System.out.println("NIP DOSEN : "+ nip);
            System.out.println("Saya dosen");
        }
    }

    class Mahasiswa extends Manusia{
        private String nim;
        private String kelas;

        public String getNim() {
            return nim;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }

        public String getKelas() {
            return kelas;
        }

        public void setKelas(String kelas) {
            this.kelas = kelas;
        }

        public void kelasApa(){
            System.out.println("Saya "+nama+ " "+ umur+" tahun sedang belajar di kelas "+ kelas);
        }

        @Override public void siapaKamu(){
            System.out.println("NIM MAHASISWA : "+ nim);
            System.out.println("Saya Mahasiswa");
        }
    }

    public static void main(String[] args) {
        Manusia manusia = new Manusia();

        Manusia.Dosen dosen = manusia .new Dosen();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setNip("41227829930");
        dosen.setMatakuliah("PBO");
        dosen.siapaKamu();
        dosen.mengajarApa();

        Manusia.Mahasiswa mahasiswa = manusia .new Mahasiswa();
        mahasiswa.setNama("Hindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO2");
        mahasiswa.setNim("10110269");
        System.out.print("\n");
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }

}
