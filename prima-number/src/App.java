import java.util.Scanner;
//Pauziah
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka bilangan bulat: ");
        int number = input.nextInt();
        boolean isPrime = true;
        
        for(int i=2; i < number; i++) {
            if(number%i == 0) {
                isPrime = false;
                break;
            }
        }
        
        if(isPrime) {
            System.out.println(number + " adalah bilangan prima, karena hanya bisa di bagi oleh bilang dia sendiri yaitu " + number);
        } else {
            System.out.println(number + " bukan angka prima karena bisa dibagi " + checkPrime(number));
        }
        input.close();
    }
    // Check if the number is not the prime
    public static String checkPrime(int number) {
        String factNum = "";
        for(int i=2; i <= number / 2; i++) {
            if(number%i == 0) {
                factNum += i + ", ";
            }
        }
        factNum += number;
        return factNum;
    }
}
/*
 * Output
 * Input angka bilangan bulat: 79
 * 79 adalah bilangan prima, karena hanya bisa di bagi oleh bilang dia sendiri
 * yaitu 79
 * 
 * // Output saat Memasukan bilangn bukan prima
 * Input angka bilangan bulat: 77
 * 77 bukan angka prima karena bisa dibagi 7, 11, 77
 * 
 */
