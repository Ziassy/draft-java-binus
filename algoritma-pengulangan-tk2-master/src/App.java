
import java.util.Scanner;

public class App {

    public static long fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static void generateFibonacci(int n) {
        int add = 1;
        long sum = 0;
        n += add;
        for (int i = 1; i < n; i++) {
            System.out.print(" " + fibonacci(i));
            long value = fibonacci(i);
            sum += value;

        }
        System.out.println("\nHasil Dari Penjumlahan = " + sum);
    }

    static void generateGenap(int n) {
        System.out.println("Deret Bilangan");
        System.out.println("###############");
        System.out.println("");
        System.out.println(n + " Bilangan Genap : ");
        int counter = 0;
        int totalgenap = 0;

        for (int a = 2; true; a += 2) {
            System.out.print(a + " ");
            totalgenap += a;
            counter++;

            if (counter > (n - 1)) {
                break;
            }
        }
        System.out.println("");
        System.out.println("Hasil Dari Penjumlahan = " + totalgenap + "\n");

    }

    static void generateGanjil(int n) {
        int hitung = 0;
        int totalganjil = 0;
        System.out.println(n + " Bilangan Ganjil : ");

        for (int a = 1; true; a += 2) {
            System.out.print(a + " ");
            totalganjil += a;
            hitung++;

            if (hitung > (n - 1)) {
                break;
            }
        }
        System.out.println("");
        System.out.println("Hasil Dari Penjumlahan = " + totalganjil);

    }

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        boolean running = true;
        String inputAnswer;

        while (running) {
            System.out.print("Masukkan Nama Anda [1..25] : ");
            String name = input.next();

            if (name.length() < 1 || name.length() > 25) {
                System.out.println("Nama harus lebih dari 1 huruf dan maksimal 25 huruf");
            } else {
                System.out.print("Masukkan NIM Anda [Harus 10 Karakter] : ");
                String nim = input.next();
                System.out.println("");

                if (nim.length() == 10) {
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println("");
                    System.out.println("Registrasi Sukses");
                    System.out.println("Selamat Datang " + name + " NIM " + nim);
                    System.out.println("");
                    System.out.println("Mari belajar macam- macam deret bilangan");
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println("");
                    System.out.print("Masukkan Sembarang Angka [5..20] : ");
                    int angka = input.nextInt();
                    System.out.println("");
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    if (angka >= 5 && angka <= 20) {
                        generateGenap(angka);
                        generateGanjil(angka);
                        System.out.println("\n" + angka + " Bilangan Fibonacci : ");
                        generateFibonacci(angka);

                        System.out.println("");
                    }
                    System.out.print("Apakah anda ingin mengulang [y/t] ?");
                    inputAnswer = input.next();

                    if (inputAnswer.equalsIgnoreCase("y")) {
                        running = true;
                    } else {
                        break;
                    }
                } else {
                    System.out.print(" NIM tidak valid\n");
                }
            }

        }

        input.close();
    }
}
