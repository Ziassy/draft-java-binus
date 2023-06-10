import java.util.*;

public class Main {

    public static void main(String[] args) {

        int maksimum, minimum, jumlah, i, array[];
        float jum, rata;

        // Membuat scanner
        Scanner scan = new Scanner(System.in);

        // Mengisi jumlah bilangan array
        System.out.print("Jumlah bilangan = ");
        jumlah = scan.nextInt();

        // Mengisi data ke array
        array = new int[jumlah];
        for (i = 0; i < jumlah; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + " = ");
            array[i] = scan.nextInt();
        }

        // Mencari nilai minumum data array
        minimum = array[0];
        for (i = 0; i < jumlah; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println("Bilangan Terkecil " + minimum);

        // Mencari nilai maksimum data array
        maksimum = array[0];
        for (i = 0; i < jumlah; i++) {
            if (array[i] > maksimum) {
                maksimum = array[i];
            }
        }
        System.out.println("Bilangan Terbesar " + maksimum);

        jum = array[0];
        for (i = 1; i < jumlah; i++) {
            jum += array[i];
        }

        rata = jum / jumlah;
        System.out.println("Nilai rata-rata = " + rata);
        scan.close();

    }
}