import java.util.Scanner;
import java.text.DecimalFormat;

// PAUZIAH
public class App {
    public static void main(String[] args) throws Exception {
        Scanner tokoGudang = new Scanner(System.in);
        DecimalFormat convertDecimal = new DecimalFormat("#0.00");
        try {
            String nama, nama_barang;
            int jml_barang;
            Double harga_beli;
            Double harga_jual;
            System.out.print("Masukan nama anda: ");
            nama = tokoGudang.nextLine();
            System.out.println("Stock gudang input barang \n######################### \n");
            System.out.println("Selamat datang: " + nama);
            System.out.print("Masukan nama barang yang mau ditambah: ");
            nama_barang = tokoGudang.nextLine();
            System.out.print("Masukan jumlah barang yang mau ditambah: ");
            jml_barang = tokoGudang.nextInt();
            System.out.print("Masukan harga beli untuk barang tersebut: ");
            harga_beli = tokoGudang.nextDouble();
            System.out.print("Masukan harga jual untuk barang tersebut: ");
            harga_jual = tokoGudang.nextDouble();
            System.out.println("\nStock Gudang Rincian Barang \n######################### \n"
                    + "\nNama Barang : " + nama_barang
                    + "\nJumlah Barang : " + jml_barang
                    + "\nHarga Beli : Rp. " + convertDecimal.format(harga_beli)
                    + "\nHarga Jual : Rp. " + convertDecimal.format(harga_jual));

        } finally {
            tokoGudang.close();
        }
    }

}
