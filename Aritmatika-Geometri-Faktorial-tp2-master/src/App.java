import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String banyakAngka, bedaAngka, inputAnswer;
        boolean loop = true;

        while (loop) {

            System.out.println("\n\nBelajar Deret Artimatika, Geometri dan menghitung Faktorial");

            System.out.print("Masukkan banyak angka yang mau dicetak [2..10] : ");
            banyakAngka = input.next();

            System.out.print("Masukkan banyak angka yang mau dicetak [2..10] : ");
            bedaAngka = input.next();

            System.out.println(banyakAngka + bedaAngka);

            System.out.print("Apakah anda ingin mengulang [y/t] ? ");
            inputAnswer = input.next();

            if (inputAnswer.equalsIgnoreCase("y")) {
                loop = true;
            } else if (inputAnswer.equalsIgnoreCase("t")) {
                break;
            } else {
                System.out.println("\nPlease Input Valid Answer!!");
                break;
            }

        }

        input.close();

    }
}
