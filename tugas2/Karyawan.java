package tugas2;
import java.util.Scanner;

/*
@author
NAMA                : Satrio Teguh Hutomo
KELAS               : Reguler C
NIM                 : 221106042963
Deskripsi Program   : Program Perhitungan Gaji Karyawan

*/


public class Karyawan {
    public String nik;
    public String nama;
    public String jabatan;
    public int golongan;

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;

        float tunjanganJabatan = new Manager(). tunjanganJabatan(jabatan);
    }

    public int getGolongan(){
        return golongan;
    }

    public void setGolongan(int golongan){
        this.golongan = golongan;

        float tunjanganGolongan = new Manager(). tunjanganGolongan(golongan);
    }

    class Manager extends Karyawan{
        private int kehadiran;
        private float tunjanganKehadiran;
        private float tunjanganJabatan;
        private float tunjanganGolongan;

        public int getKehadiran(){
            return kehadiran;
        }

        public void setKehadiran(int kehadiran){
            this.kehadiran = kehadiran;
        }

        public float tunjanganKehadiran(int hadir){
            tunjanganKehadiran = hadir * 10000;
            return tunjanganKehadiran;
        }

        public float tunjanganJabatan(String jabatan){
            tunjanganJabatan = ("Manager".equals(jabatan)) ? 2000000 : ("Kabag".equals(jabatan)) ? 1000000 : 0;
            return tunjanganJabatan;
        }

        public float tunjanganGolongan(int golongan){
            tunjanganGolongan = switch (golongan) {
                case 1 -> 500000;
                case 2 -> 1000000;
                case 3 -> 1500000;
                default -> 0;
            };
            return tunjanganGolongan;
        }

        public float gajiTotal(){
            float total =  tunjanganJabatan + tunjanganGolongan + tunjanganKehadiran;
            return total;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Karyawan karyawan = new Karyawan();
        Karyawan.Manager manager = karyawan .new Manager();


        System.out.print("\n======Program Perhitungan Gaji Karyawan======");
        System.out.print("\nMasukan NIK : ");
        String nik = input.next();
        System.out.print("Masukan Nama : ");
        String nama = input.next();
        System.out.print("Masukan Golongan (1/2/3) : ");
        int golongan = input.nextInt();
        System.out.print("Masukan Jabatan (Manager/Kabag) : ");
        String jabatan = input.next();
        System.out.print("Masukan Jumlah Kehadiran : ");
        int kehadiran = input.nextInt();

        System.out.print("\n======Hasil Perhitungan======");

        karyawan.setNik(nik);
        System.out.print("\nNIK : "+karyawan.getNik());

        karyawan.setNama(nama);
        System.out.print("\nNAMA : "+karyawan.getNama());

        manager.setGolongan(golongan);
        System.out.print("\nGOLONGAN : "+manager.getGolongan());

        manager.setJabatan(jabatan);
        System.out.print("\nJABATAN : "+manager.getJabatan());

        manager.setKehadiran(kehadiran);
        System.out.print("\nKEHADIRAN : "+manager.getKehadiran());

        System.out.print("\n");
        System.out.println("\nTUNJANGAN GOLONGAN : " + manager.tunjanganGolongan(golongan));
        System.out.println("TUNJANGAN JABATAN: " + manager.tunjanganJabatan(jabatan));
        System.out.println("TUNJANGAN KEHADIRAN: " + manager.tunjanganKehadiran(kehadiran));
        System.out.println("\nGaji Total: " + manager.gajiTotal());

    }
}
