import java.util.Random;
import java.util.Scanner;

public class programm2 {
    public static void main (String args[]){
        Random rand = new Random();
        int random = rand.nextInt(1,9);

        Scanner scanner = new Scanner(System.in);
        System.out.println(random);
        System.out.println("попробуйте угадать число от 1 до 9");
        int polnum = scanner.nextInt();
        if ( polnum == 0){
            System.out.println("выход из программы");
            System.exit(0);
        }
        while(random != polnum){
            if(polnum > random){
                System.out.println("Загаданное число меньше");
                polnum = scanner.nextInt();
            }
            if(polnum < random){
                System.out.println("Загаданное число больше");
                polnum = scanner.nextInt();
            }

        }
        System.out.println("вы угадали");
    }
}
