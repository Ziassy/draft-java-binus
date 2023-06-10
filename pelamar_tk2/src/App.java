import java.time.LocalDate;
import java.time.Period;

public class App {
    private String nama;
    private LocalDate tanggalLahir;
    private String posisi;

    public App(String nama, LocalDate tanggalLahir, String posisi) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.posisi = posisi;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public String getPosisi() {
        return posisi;
    }

    public int getUmur() {
        LocalDate hariIni = LocalDate.now();
        return Period.between(tanggalLahir, hariIni).getYears();
    }

    public boolean memenuhiKriteriaUmur() {
        int umur = getUmur();
        if (posisi.equals("Staff") && umur <= 25) {
            return true;
        } else if (posisi.equals("Officer") && umur <= 30) {
            return true;
        } else if (posisi.equals("Supervisor") && umur <= 35) {
            return true;
        } else if (posisi.equals("Manager") && umur <= 40) {
            return true;
        } else {
            return false;
        }
    }

    public void informasiKriteriaUmur() {
        if (memenuhiKriteriaUmur()) {
            System.out.println(nama + " memenuhi kriteria umur untuk posisi " + posisi);
        } else {
            System.out.println(nama + " tidak memenuhi kriteria umur untuk posisi " + posisi);
        }
    }

    public static void main(String[] args) throws Exception {

        newApp();
    }
}
