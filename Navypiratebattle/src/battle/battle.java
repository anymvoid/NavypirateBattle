package battle;

import captains.baseCaptain;
import navies.BaseNavies;
import sea.Sea1;
import sea.Sea2;
import sea.Sea3;
import java.util.Random;
import java.util.Scanner;
import java.lang.Thread;



   /*public <T extends BaseNavies, T2 extends baseCaptain> void Battle_acction (T navyx, T navyy, T2 captainx, T2 captainy, String NameOfNavyX, String NameOfNavyY) {
       Scanner scanner = new Scanner(System.in);
       Random random = new Random();
       boolean continueGame = true;
       int turnNumber = 1;

       System.out.println("************************************************************");
       System.out.println("*                    Welcome to the Ship Battle!         *");
       System.out.println("************************************************************");
       System.out.println("Battle between: " + navyx.getName() + " vs " + navyy.getName());
       System.out.println("************************************************************");

       while (continueGame) {
           System.out.println("\n==================== Turn " + turnNumber + " ====================");

           // Generating random environment
           int ambiente = generambienterandom();
           if (ambiente == 0) {
               Sea1 sea1 = new Sea1("Mare Ghiacciato");
               System.out.println("\n** Current Environment: " + sea1.getName() + " **");
               sea1.appliccaeffetto(navyx, navyy);
           } else if (ambiente == 1) {
               Sea2 sea2 = new Sea2("Arcipelaghi Misteriosi");
               System.out.println("\n** Current Environment: " + sea2.getName() + " **");
               sea2.appliccaeffetto(navyx, navyy);
           } else {
               Sea3 sea3 = new Sea3("Fossa delle anime perdute");
               System.out.println("\n** Current Environment: " + sea3.getName() + " **");
               sea3.appliccaeffetto(navyx, navyy);
           }

           // Determine damage from attacks
           int navyxDamage = navyx.getStrength() + captainx.getStrength();
           int navyyDamage = navyy.getStrength() + captainy.getStrength();

           // Display attack messages
           System.out.println("\n> " + navyx.getName() + " attacks " + navyy.getName() + " for " + navyxDamage + " damage.");
           System.out.println("> " + navyy.getName() + " attacks " + navyx.getName() + " for " + navyyDamage + " damage.");

           // Apply damage to the ships
           navyy.setLife(navyy.getLife() - navyxDamage);
           navyx.setLife(navyx.getLife() - navyyDamage);

           // Show current status of ships
           System.out.println("\n" + navyx.getName() + " (" + navyx.getLife() + " HP) vs " + navyy.getName() + " (" + navyy.getLife() + " HP)");

           // Check if a ship is defeated by HP
           if (navyy.getLife() <= 0) {
               System.out.println("\n" + navyx.getName() + " wins!");
               break;
           }
           if (navyx.getLife() <= 0) {
               System.out.println("\n" + navyy.getName() + " wins!");
               break;
           }

           0
           if (navyx.getPosition() >= 10) {
               System.out.println("\n" + navyx.getName() + " reaches position 10 and wins!");
               break;
           }
           if (navyy.getPosition() >= 10) {
               System.out.println("\n" + navyy.getName() + " reaches position 10 and wins!");
               break;
           }


           turnNumber++;

           while (navyx.getLife() > 0 && navyy.getLife() > 0) {
               System.out.println("\n------------------------------------------------------------");
               System.out.print("Choose your target: \n1 for " + navyx.NavyName(NameOfNavyX) + "\n2 for " + navyy.NavyName(NameOfNavyY) + "\nEnter choice: ");
               int target = scanner.nextInt();

               // Ship 1 attacks
               if (target == 1) {
                   navyy.setLife(navyy.getLife() - navyxDamage);
                   System.out.println("\n> " + navyx.NavyName(NameOfNavyX) + " attacks " + navyy.NavyName(NameOfNavyY) + " for " + navyxDamage + " damage.");
                   System.out.println(navyx.NavyName(NameOfNavyX) + " (" + navyx.getLife() + " HP) vs " + navyy.NavyName(NameOfNavyY) + " (" + navyy.getLife() + " HP)");
               }

               // Ship 2 attacks
               if (target == 2) {
                   navyx.setLife(navyx.getLife() - navyyDamage);
                   System.out.println("\n> " + navyy.NavyName(NameOfNavyY) + " attacks " + navyx.NavyName(NameOfNavyX) + " for " + navyyDamage + " damage.");
                   System.out.println(navyx.NavyName(NameOfNavyX) + " (" + navyx.getLife() + " HP) vs " + navyy.NavyName(NameOfNavyY) + " (" + navyy.getLife() + " HP)");
               }


               if (navyy.getLife() <= 0) {
                   System.out.println("\n> " + navyx.NavyName(NameOfNavyX) + " wins!");
                   continueGame = false;
                   break;
               }

               if (navyx.getLife() <= 0) {
                   System.out.println("\n> " + navyy.NavyName(NameOfNavyY) + " wins!");
                   continueGame = false;
                   break;
               }

               System.out.println("\n==================== End of Turn =====================\n");
           }
           continueGame = false;
       }
       scanner.close();
   }

    private int generambienterandom() {
        Random random = new Random();
        return random.nextInt(3);
    }
    */

    public class battle {
        public <T extends BaseNavies, T2 extends baseCaptain> void Battle_acction(
                T navyx, T navyy, T2 captainx, T2 captainy, String NameOfNavyX, String NameOfNavyY) {

            Random random = new Random();
            boolean continueGame = true;
            int turnNumber = 1;

            System.out.println("************************************************************");
            System.out.println("*                    Welcome to the Ship Battle!           *");
            System.out.println("************************************************************");
            System.out.println("Battle between: " + navyx.getName() + " vs " + navyy.getName());
            System.out.println("************************************************************");

            while (continueGame) {
                System.out.println("\n==================== Turn " + turnNumber + " ====================");

                // Generazione ambiente casuale e applicazione dell'effetto
                int ambiente = generambienterandom();
                if (ambiente == 0) {
                    Sea1 sea1 = new Sea1("Mare Ghiacciato");
                    System.out.println("\n** Current Environment: " + sea1.getName() + " **");
                    sea1.appliccaeffetto(navyx, navyy);
                } else if (ambiente == 1) {
                    Sea2 sea2 = new Sea2("Arcipelaghi Misteriosi");
                    System.out.println("\n** Current Environment: " + sea2.getName() + " **");
                    sea2.appliccaeffetto(navyx, navyy);
                } else {
                    Sea3 sea3 = new Sea3("Fossa delle anime perdute");
                    System.out.println("\n** Current Environment: " + sea3.getName() + " **");
                    sea3.appliccaeffetto(navyx, navyy);
                }

                // Calcolo del danno per ciascuna nave
                int navyxDamage = navyx.getStrength() + captainx.getStrength();
                int navyyDamage = navyy.getStrength() + captainy.getStrength();

                // Visualizzazione dei messaggi di attacco
                System.out.println("\n> " + navyx.getName() + " attacks " + navyy.getName() + " for " + navyxDamage + " damage.");
                System.out.println("> " + navyy.getName() + " attacks " + navyx.getName() + " for " + navyyDamage + " damage.");

                // Applicazione del danno alle navi
                navyy.setLife(navyy.getLife() - navyxDamage);
                navyx.setLife(navyx.getLife() - navyyDamage);

                // Visualizzazione dello stato attuale delle navi
                System.out.println("\n" + navyx.getName() + " (" + navyx.getLife() + " HP) vs " +
                        navyy.getName() + " (" + navyy.getLife() + " HP)");

                // Verifica se una nave è stata sconfitta
                if (navyy.getLife() <= 0) {
                    System.out.println("\n" + navyx.getName() + " wins!");
                    break;
                }
                if (navyx.getLife() <= 0) {
                    System.out.println("\n" + navyy.getName() + " wins!");
                    break;
                }


                if (navyx.getPosition() >= 10) {
                    System.out.println("\n" + navyx.getName() + " reaches position 10 and wins!");
                    break;
                }
                if (navyy.getPosition() >= 10) {
                    System.out.println("\n" + navyy.getName() + " reaches position 10 and wins!");
                    break;
                }

                System.out.println("\n==================== End of Turn " + turnNumber + " =====================\n");
                turnNumber++;

                // Attende 5 secondi prima di passare al turno successivo
                try {
                    Thread.sleep(5000); // 8000 millisecondi = 8 secondi
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private int generambienterandom() {
            Random random = new Random();
            return random.nextInt(3);
        }
    }




