package siapaKamu;

public class Manusia {
    protected String name;
    protected int umur;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUmur(){
        return umur;
    }

    public void setUmur(int umurku){
        this.umur = umurku;
    }

    public void siapaKmu(){
        System.out.println("saya manusia");
    }

    class Dosen extends Manusia{
        private String nip;
        private String matakuliah;

        public String getNip(){
            return nip;
        }

        public void setNip(String nip){
            this.nip = nip;
        }

        public String getMatakuliah(){
            return matakuliah;
        }

        public void setMatakuliah(String matakuliah){
            this.matakuliah = matakuliah;
        }

        public void mengajarApa(){
            System.out.println("Saya "+name+" umur "+umur+" tahun sedang mengajar matakuliah "+matakuliah);
        }

        @Override public void siapaKmu(){
            System.out.println("Saya Dosen");
        }
    }
    class Mahasiswa extends Manusia{
        private String nim;
        private String kelas;

        public String getNim(){
            return nim;
        }

        public void setNim(String nim){
            this.nim = nim;
        }

        public String getKelas(){
            return kelas;
        }

        public void setKelas(String kelas){
            this.kelas = kelas;
        }

        public void kelasApa(){
            System.out.println("Saya "+name+" umur "+umur+" tahun sedang belajar di kelas "+kelas);
        }

        @Override public void siapaKmu(){
            System.out.println("Saya Mahasiswa");
        }
    }

    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Manusia.Dosen dosen = manusia.new Dosen();
        Manusia.Mahasiswa mahasiswa = manusia.new Mahasiswa();

        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKmu();
        dosen.setName("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMatakuliah("PBO");
        dosen.mengajarApa();

        System.out.println("");
        mahasiswa.setNim("10110269");
        System.out.println("NIM MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKmu();
        mahasiswa.setName("Nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO2");
        mahasiswa.kelasApa();

    }
}
