package pbo2.pkg10117045.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Alif hermawan
 * KELAS    : IF-2
 * NIM      : 10117045
 * Deskripsi Program : Program ini berisi perintah untuk menghitung nilai akhir 
 * mahasiswa berdasarkan nilai quis,uts dan uas
 */
public class Utama {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);

        NilaiMhs nilai = new NilaiMhs();

        System.out.print("QUIZ \t = ");
        nilai.setQuiz(scn.nextDouble());

        System.out.print("UTS \t = ");
        nilai.setUts(scn.nextDouble());

        System.out.print("UAS \t = ");
        nilai.setUas(scn.nextDouble());

        System.out.println("\nNilai Akhir = " + nilai.nilaiAkhir());
        System.out.println("\nIndex = " + nilai.indexNilai());
        System.out.println("Keterangan = " + nilai.keterangan());

    }
}
