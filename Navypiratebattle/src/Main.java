import battle.battle;
import captains.Captain1;
import captains.Captain2;
import captains.Captain3;
import captains.Captain4;
import navies.Navy1;
import navies.Navy2;
import navies.Navy3;
import navies.Navy4;
import battle.GameConfiguration;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Navy1 navy1 = new Navy1("Furia del Maelstrom", 400, 0, 4000);
        Navy2 navy2 = new Navy2("Regina dei Ghiacci Eterni", 250, 0, 6000);
        Navy3 navy3 = new Navy3("Ombra del Crepuscolo", 250, 0, 6000);
        Navy4 navy4 = new Navy4("Vascello delle Anime Erranti", 250, 0, 6000);
        Captain1 captain1 = new Captain1("Kael Fulminar", 180);
        Captain2 captain2 = new Captain2("Iskra Frostbane", 120);
        Captain3 captain3 = new Captain3("Darian Velenar", 100);
        Captain4 captain4 = new Captain4("Eryon Soulbane", 130);
        Scanner scanner = new Scanner(System.in);
        battle b = new battle();
        GameConfiguration game = new GameConfiguration();
        int choose1 = game.chooseNavy();
        int random = game.generateRandomNumber(choose1);

        switch (choose1) {
            case 1:
                if (random == 2) {
                    b.Battle_acction(navy1, navy2, captain1, captain2, "Furia del Maelstrom", "Regina dei Ghiacci Eterni");
                } else if (random == 3) {
                    b.Battle_acction(navy1, navy3, captain1, captain3, "Furia del Maelstrom", "Ombra del Crepuscolo");
                } else {
                    b.Battle_acction(navy1, navy4, captain1, captain4, "Furia del Maelstrom", "Vascello delle Anime Erranti");
                }
                break;
            case 2:
                if (random == 1) {
                    b.Battle_acction(navy2, navy1, captain2, captain1, "Regina dei Ghiacci Eterni", "Furia del Maelstrom");
                } else if (random == 3) {
                    b.Battle_acction(navy2, navy3, captain2, captain3, "Regina dei Ghiacci Eterni", "Ombra del Crepuscolo");
                } else {
                    b.Battle_acction(navy2, navy4, captain2, captain4, "Regina dei Ghiacci Eterni", "Vascello delle Anime Erranti");
                }
                break;
            case 3:
                if (random == 1) {
                    b.Battle_acction(navy3, navy1, captain3, captain1, "Ombra del Crepuscolo", "Furia del Maelstrom");
                } else if (random == 2) {
                    b.Battle_acction(navy3, navy2, captain3, captain2, "Ombra del Crepuscolo", "Regina dei Ghiacci Eterni");
                } else {
                    b.Battle_acction(navy3, navy4, captain3, captain4, "Ombra del Crepuscolo", "Vascello delle Anime Erranti");
                }
                break;
            case 4:
                if (random == 1) {
                    b.Battle_acction(navy4, navy1, captain4, captain1, "Vascello delle Anime Erranti", "Furia del Maelstrom");
                } else if (random == 2) {
                    b.Battle_acction(navy4, navy2, captain4, captain2, "Vascello delle Anime Erranti", "Regina dei Ghiacci Eterni");
                } else {
                    b.Battle_acction(navy4, navy3, captain4, captain3, "Vascello delle Anime Erranti", "Ombra del Crepuscolo");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}


