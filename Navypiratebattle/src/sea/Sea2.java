package sea;

import navies.BaseNavies;

import java.util.Random;

public class Sea2 extends baseSea {
    public Sea2 (String nome){
        super(nome);}

    public <T extends BaseNavies> void appliccaeffetto(T navyx, T navyy) {
        Random random = new Random();

        // Effetto su navyx (la prima nave)
        if (navyx.getName().equals("Furia del Maelstrom")) {
            System.out.println(navyx.getName() + " is immune to sea effects.");
            navyx.setPosition(navyx.getPosition() + 1);
        } else if (navyx.getName().equals("Ombra del Crepuscolo")) {
            System.out.println(navyx.getName() + " avanza di 2 caselle grazie al vantaggio ambientale .");
            navyx.setPosition(navyx.getPosition() + 2);

        }else {
                int retrocessione = random.nextInt(3);
                int nuovaPosizione = Math.max(0, navyx.getPosition() - retrocessione);
                navyx.setPosition(nuovaPosizione);
                System.out.println(navyx.getName() + " retrocede di " + retrocessione + " caselle a causa dell'ambiente.");
            }
             // Effetti su navyy (la seconda nave )
            if (navyy.getName().equals("Furia del Maelstrom")) {
                System.out.println(navyy.getName() + " is immune to sea effects.");
                navyy.setPosition(navyy.getPosition() + 1);
            } else if (navyy.getName().equals("Ombra del Crepuscolo")) {
                System.out.println(navyy.getName() + " avanza di 2 caselle.");
                navyy.setPosition((navyy.getPosition() + 2));
            } else {
                int retrocessione = random.nextInt(3); // Retrocede di 0, 1 o 2 caselle
                int nuovaPosizione = Math.max(0, navyy.getPosition() - retrocessione); // Assicura che non vada sotto 0
            /* Math.max(0, ...) → confronta la nuova posizione con 0 e sceglie il valore più grande tra i 2 .
Se la nuova posizione fosse negativa, questa riga la forza a rimanere a 0*/
                navyy.setPosition(nuovaPosizione);
                System.out.println(navyy.getName() + " retrocede di " + retrocessione + " caselle a causa dell'ambiente.");
            }
        }




    }


