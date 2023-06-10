import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input angka bilangan bulat : ");
        int angka = input.nextInt();
        
        boolean bilPrima = true;
        
        for(int i=2; i<angka; i++){
            if(angka % i == 0){
                bilPrima = false;
                System.out.printf("%d bukan angka prima karena bisa dibagi %d\n", angka, i);
                break;
            }
        }
        
        if(bilPrima){
            System.out.printf("%d adalah bilangan prima\n", angka);
        }
        input.close();

    }

}