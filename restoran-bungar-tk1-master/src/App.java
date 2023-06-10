import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        DecimalFormat convertDecimal = new DecimalFormat("#0.00");
        int jumlahorang;
        String nama;
        double nasgor, ayam, steak, kwetiaw, kambing, total, diskon, totalBayar, pembelianSetiapOrang;
        double harga_nasgor = 9999.99,
                harga_ayam = 12345.67,
                harga_steak = 21108.40,
                harga_kwetiaw = 13579.13,
                harga_kambing = 98765.43;

        println("Selamat siang...");
        // ===============Add Jumlah===============//
        System.out.print("Pesanan Untuk Berapa Orang : ");
        jumlahorang = input.nextInt();

        // ===============Add Nama Pesanan==============//
        System.out.print("Pesanan Atas Nama          : ");
        nama = input.next();

        // ===============Daftar Menu===============//
        println("\nMenu Special Hari Ini");
        println("========================");
        println("1. Nasi Goreng Spesial            @ Rp.  " + harga_nasgor
                + " \n2. Ayam Bakar Spesial             @ Rp. " + harga_ayam
                + " \n3. Steak Sirloin Spesial          @ Rp. " + harga_steak
                + " \n4. Kwetiaw Siram Spesial          @ Rp. " + harga_kwetiaw
                + " \n5. Kambing Guling Spesial         @ Rp. " + harga_kambing);

        // ===============Add Pesanan===============//
        println("\nPesanan Anda (Batas Pesanan 1-10 PO)");
        System.out.print("1. Nasi Goreng Spesial       = ");
        int jmlNasgor = input.nextInt();
        System.out.print("2. Ayam Goreng Spesial       = ");
        int jmlAyam = input.nextInt();
        System.out.print("3. Steak Sirloin Spesial     = ");
        int jmlSteak = input.nextInt();
        System.out.print("4. Kwetiaw Siram Spesial     = ");
        int jmlKwetiaw = input.nextInt();
        System.out.print("5. Kambing Guling Spesial    = ");
        int jmlKambing = input.nextInt();

        // ===============Perhitungan Pembelian===============//
        nasgor = (jmlNasgor * harga_nasgor);
        ayam = (jmlAyam * harga_ayam);
        steak = (jmlSteak * harga_steak);
        kwetiaw = (jmlKwetiaw * harga_kwetiaw);
        kambing = (jmlKambing * harga_kambing);
        total = nasgor + ayam + steak + kwetiaw + kambing;
        diskon = (total * 10) / 100;
        totalBayar = total - diskon;
        pembelianSetiapOrang = totalBayar / jumlahorang;

        // =============== Proses Perhitungan===============//
        System.out.printf("\nSelamat menikmati makanan anda %s...", nama);
        println("\nHarga Pembelian : ");
        System.out.printf("1. Nasi Goreng Spesial     %d Porsi * 9999,99     = Rp. " + convertDecimal.format(nasgor),
                jmlNasgor);
        System.out.printf(" \n2. Ayam Goreng Spesial     %d Porsi * 12345,67    = Rp. " + convertDecimal
                .format(ayam), jmlAyam);
        System.out.printf(" \n3. Steak Sirloin Spesial   %d Porsi * 21108,40    = Rp. " + convertDecimal
                .format(steak), jmlSteak);
        System.out.printf(" \n4. Kwetiaw Siram Spesial   %d Porsi * 13579,13    = Rp. " + convertDecimal
                .format(kwetiaw), jmlKwetiaw);
        System.out.printf(" \n5. Kambing Guling Spesial  %d Porsi * 98765,43    = Rp. " + convertDecimal
                .format(kambing), jmlKambing);
        println("\t+");
        println("========================================================================");
        println("Total Pembelian                                  = Rp. " + convertDecimal.format(total));
        println("Disc.10 %  <Masa Promosi>                        = Rp. " + diskon + "       \t-");
        println("========================================================================");
        println("Total Pembelian Setelah Diskon 10 %              = Rp. " + convertDecimal
                .format(totalBayar));
        println("Pembelian Per Orang (Untuk 8 Orang)              = Rp. " + convertDecimal
                .format(pembelianSetiapOrang));
        println("            Terimakasih Atas Kunjungan Anda         ");
        println("                 Tekan ENTER untuk Keluar            ");
        try {
            System.in.read();
        } catch (Exception e) {
            System.out.println(e);
        }

        input.close();
    }

    static void println(String output) {
        System.out.println(output);

    }
}
