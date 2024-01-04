package tugas2;

/*
@author
NAMA                : Muhamad Yopan Ramadhan
KELAS               : Reguler C
NIM                 : 221106042905
Deskripsi Program   : Program untuk Menampilkan Umur dan Nama Barang Antik

*/


public class BarangAntik {
    private int umur;

    public BarangAntik (int umur){
        this.umur = umur;
    }

    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah : "+umur+" tahun.");
    }

    class Radio extends BarangAntik{
        private String nama;

        //constructor
        public Radio(int umur, String nama){
            super(umur);
            this.nama = nama;
        }

        public String getNama(){
            return nama;
        }

        public void setNama(String nama){
            this.nama = nama;
        }

        @Override public void tampilUmur(){
            System.out.println("Nama barang antik : "+nama);
            super.tampilUmur();
        }
    }
}
