import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Umur {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan tanggal lahir pelamar (format: yyyy-mm-dd): ");
    String tanggalLahir = scanner.nextLine();
    scanner.close();

    try {
      LocalDate dob = LocalDate.parse(tanggalLahir);
      LocalDate now = LocalDate.now();
      int age = Period.between(dob, now).getYears();

      String kriteria = "";
      int maksUmur = 0;

      if (age <= 25) {
        kriteria = "Staff";
        maksUmur = 25;
      } else if (age <= 30) {
        kriteria = "Officer";
        maksUmur = 30;
      } else if (age <= 35) {
        kriteria = "Supervisor";
        maksUmur = 35;
      } else if (age <= 40) {
        kriteria = "Manager";
        maksUmur = 40;
      } else {
        throw new AgeLimitException("Umur pelamar terlalu tua untuk posisi yang tersedia");
      }

      System.out.println("Umur pelamar: " + age + " tahun dan pelamar masuk dalam kriteria " + kriteria + " (batas umur maksimum: " + maksUmur + " tahun)");

    } catch (Exception e) {
      System.out.println("Something went Wrong: " + e.getMessage());
    }

  }

}

class AgeLimitException extends Exception {
  public AgeLimitException(String message) {
    super(message);
  }
}
