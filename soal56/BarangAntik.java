package soal56;

public class BarangAntik {
    private int umur;

    //constructor
    public BarangAntik (int umur){
        this.umur = umur;
    }

    public void tampilUmur(){
        System.out.println("Umur Barang Antik Ini Adalah : "+umur+ " tahun");
    }

    class Radio extends BarangAntik{
        private String name;

        //constructor
        public Radio (int umur){
            super(umur);
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        BarangAntik barang = new BarangAntik(234);
        BarangAntik.Radio radio = barang.new Radio(0);

        radio.setName("Radio AM");
        System.out.println("Nama Barang Antik : "+radio.getName());
        barang.tampilUmur();
    }
}
