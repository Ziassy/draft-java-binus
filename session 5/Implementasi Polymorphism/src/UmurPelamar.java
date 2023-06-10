import java.time.LocalDate;
import java.time.Period;

public class UmurPelamar {

  public static void main(String[] args) {
    // contoh data pelamar
    String nama = "John Doe";
    LocalDate tanggalLahir = LocalDate.of(1995, 8, 20);
    String posisi = "Staff";

    // hitung umur pelamar
    int umur = hitungUmur(tanggalLahir);

    // cek kriteria umur berdasarkan posisi
    boolean kriteriaUmur = false;
    switch (posisi) {
      case "Staff":
        kriteriaUmur = umur <= 25;
        break;
      case "Officer":
        kriteriaUmur = umur <= 30;
        break;
      case "Supervisor":
        kriteriaUmur = umur <= 35;
        break;
      case "Manager":
        kriteriaUmur = umur <= 40;
        break;
      default:
        System.out.println("Posisi tidak dikenal");
    }

    // tampilkan hasil
    if (kriteriaUmur) {
      System.out.println(nama + " memenuhi kriteria umur untuk posisi " + posisi);
    } else {
      System.out.println(nama + " tidak memenuhi kriteria umur untuk posisi " + posisi);
    }
  }

  public static int hitungUmur(LocalDate tanggalLahir) {
    LocalDate hariIni = LocalDate.now();
    Period periode = Period.between(tanggalLahir, hariIni);
    return periode.getYears();
  }
}