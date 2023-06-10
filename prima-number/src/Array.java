import java.util.Scanner;
import java.text.DecimalFormat;

public class Array {
  public static void main(String[] args) {
    String average1;
    double average;
    Scanner input = new Scanner(System.in);
    DecimalFormat decimalFormat = new DecimalFormat("#");

    System.out.print("Jumlah bilangan = ");
    int amount = input.nextInt();

    int[] number = new int[amount];

    for (int i = 0; i < amount; i++) {
      System.out.print("Bilangan ke-" + (i + 1) + " = ");
      number[i] = input.nextInt();
    }

    int smallest = number[0];
    int biggest = number[0];
    int total = number[0];

    for (int i = 1; i < amount; i++) {
      if (number[i] < smallest) {
        smallest = number[i];
        System.out.println("Bilangan Terkecil = " + smallest);

      }
      if (number[i] > biggest) {
        biggest = number[i];
        System.out.println("Bilangan Terbesar = " + biggest);

      }
      total += number[i];
    }

    average = (double) total / amount;
    average1 = decimalFormat.format(average);

    System.out.println("Nilai rata-rata = " + average1);
    input.close();
  }

}
