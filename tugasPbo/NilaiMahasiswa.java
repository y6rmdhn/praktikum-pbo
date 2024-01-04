package tugasPbo;

import java.util.Scanner;

public class NilaiMahasiswa {
    private double quiz;
    private double uts;

    public double getUts() {
        return uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    private double uas;

    public float hitungNilai(){
        double bobotQuiz = 0.20;
        double bobotUts = 0.30;
        double bobotUas = 0.50;

        return (float) ((bobotQuiz * quiz) + (bobotUts * uts) + (bobotUas * uas));
    }

    public float konversi(double nilaiAkhir){
        String index = "";
        String keterangan = "";

        if(nilaiAkhir > 80.0 && nilaiAkhir <= 100.0){
            index = "A";
            keterangan = "Sangat Baik";
        } else if (nilaiAkhir > 68.0 && nilaiAkhir <= 80.0){
            index = "B";
            keterangan = "Baik";
        }else if (nilaiAkhir > 56.0 && nilaiAkhir <= 68.0){
            index = "C";
            keterangan = "Cukup";
        }else if (nilaiAkhir > 45.0 && nilaiAkhir <= 56.0){
            index = "D";
            keterangan = "Kurang";
        }else if (nilaiAkhir > 0.0 && nilaiAkhir <= 45.0){
            index = "E";
            keterangan = "Sangat Kurang";
        }else {
            index = "Tidak diketahui";
            keterangan = "Anda Salah Input";
        }

        System.out.println("Index: " + index);
        System.out.println("Keterangan: " + keterangan);

        return (float) nilaiAkhir;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NilaiMahasiswa nilaiMahasiswa = new NilaiMahasiswa();

        System.out.print("QUIZ = ");
        double quiz = scanner.nextDouble();
        nilaiMahasiswa.setQuiz(quiz);

        System.out.print("UTS = ");
        double uts = scanner.nextDouble();
        nilaiMahasiswa.setUts(uts);

        System.out.print("UAS = ");
        double uas = scanner.nextDouble();
        nilaiMahasiswa.setUas(uas);

        double nilaiAkhir = nilaiMahasiswa.hitungNilai();

        System.out.println("");

        System.out.println("Nilai Akhir = " + nilaiMahasiswa.hitungNilai());

        System.out.println("");

        nilaiMahasiswa.konversi(nilaiAkhir);


    }
}
