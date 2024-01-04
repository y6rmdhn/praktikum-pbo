package tugasPbo;

import java.util.Scanner;

public class Age {
    private int yearBirth;
    private int yearNow;

    public Age(int yearNow, int yearBirth) {
        this.yearNow = yearNow;
        this.yearBirth = yearBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public void tandanyaKamu() {
        int umur = hitungUmur();
        String tanda = "Tandanya Kamu : ";

        if (umur > 0 && umur < 5) {
            System.out.println(tanda + "LAGI LUCU-LUCUNYA");
        } else if (umur >= 5 && umur < 10) {
            System.out.println(tanda + "MASIH ANAK-ANAK");
        } else if (umur >= 10 && umur < 13) {
            System.out.println(tanda + "MASIH REMAJA");
        } else if (umur >= 13 && umur < 19) {
            System.out.println(tanda + "ALAY");
        } else if (umur >= 19 && umur < 29) {
            System.out.println(tanda + "LAGI GALAU NYARI JODOH");
        } else if (umur >= 29 && umur < 35) {
            System.out.println(tanda + "LAGI SIBUK NYARI UANG");
        } else if (umur >= 35 && umur < 150) {
            System.out.println(tanda + "SUDAH TUA");
        } else {
            System.out.println("Umur Tidak terprediksi");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Tahun Lahir Anda: ");
        int yearBirth = scanner.nextInt();
        int yearNow = 2023; // Ganti dengan tahun saat ini

        Age age = new Age(yearNow, yearBirth);

        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda: " + age.getYearBirth());
        System.out.println("Hari ini tahun: " + age.getYearNow());

        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " Tahun");
        age.tandanyaKamu();
    }
}
