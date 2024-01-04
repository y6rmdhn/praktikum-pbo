package soal59;

import javax.xml.transform.sax.SAXResult;

public class AnimeConan {
    private String nama;
    private int umur;
    private String pekerjaan;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public void setPekerjaan(String pekerjaan){
        this.pekerjaan = pekerjaan;
    }

    public void introduce(){
        System.out.println("Nama Karakter : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("Pekerjaan : "+pekerjaan);
    }

    class Conan extends AnimeConan{
        private String unik;

        public String getUnik(){
            return unik;
        }

        public void setUnik(String unik){
            this.unik = unik;
        }
    }

    class Ran extends AnimeConan{
        private String unik;

        public String getUnik(){
            return unik;
        }

        public void setUnik(String unik){
            this.unik = unik;
        }
    }


    public static void main(String[] args) {
        AnimeConan anime = new AnimeConan();
        AnimeConan.Conan conan = anime.new Conan();
        AnimeConan.Ran ran = anime.new Ran();

        System.out.println("Detective Conan Character Information");
        System.out.println("-------------------------------------");

        conan.setNama("Conan Edogawa");
        conan.setUmur(19);
        conan.setPekerjaan("Detektif");
        conan.introduce();
        conan.setUnik("Keunikan Karakter conan adalah Karakter utama yang unik karena ia berubah menjadi seorang anak kecil setelah terkena racun.");
        System.out.println(conan.getUnik());

        System.out.println("");
        ran.setNama("Ran Mouri");
        ran.setUmur(20);
        ran.setPekerjaan("Kapten tim karate");
        ran.introduce();
        ran.setUnik("Keunikan Karakter ini adalah juara karate");
        System.out.println(ran.getUnik());
    }
}
