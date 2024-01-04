package tugas2;

/*
@author
NAMA                : Muhamad Yopan Ramadhan
KELAS               : Reguler C
NIM                 : 221106042905
Deskripsi Program   : Program unutk Menampilkan warna koordinat dan posisinya

*/

public class Kordinat {
    private int x;
    private int y;

    //constructor
    public Kordinat(int x, int y){
        this.x = x;
        this.y = y;
    }


    //getter dan setter untuk x
    public int getX(){
        return x;
    }

    public void setX(){
        this.x = x;
    }

    //getter dan setter untuk y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    class WarnaKoordinat extends Kordinat{
        private String namaWarna;

        public WarnaKoordinat(int x, int y, String namaWarna){
            super(x, y);
            this.namaWarna = namaWarna;
        }

        public String getNamaWarna() {
            return namaWarna;
        }

        public void setNamaWarna(String namaWarna) {
            this.namaWarna = namaWarna;
        }
    }
}
