package battle;

import java.util.Random;
import java.util.Scanner;

public class GameConfiguration {
    public int chooseNavy() {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Choose the  navy to  start the battle :");*/
        System.out.println("1. Furia del Maelstrom ");
        System.out.println("2. Regina dei Ghiacci Eterni ");
        System.out.println("3. Ombra del Crepuscolo ");
        System.out.println("4. Vascello delle Anime Erranti");

        System.out.print("Choose your navy to  start the battle (1-4): ");

        return scanner.nextInt();
    }

    public static int generateRandomNumber(int exclude) {
        Random random = new Random();
        int number;

        do {
            number = random.nextInt(4) + 1;
        } while (number == exclude);

        return number;

    }
}

//