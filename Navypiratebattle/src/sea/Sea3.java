package sea;


import navies.BaseNavies;

import java.util.Random;

public class Sea3  extends baseSea{
    public Sea3 (String nome){
        super(nome);
    }


    public <T extends BaseNavies> void appliccaeffetto(T navyx, T navyy) {

        Random random = new Random();

        // check navyx name to apply effect
        if (navyx.getName().equals("Furia del Maelstrom")) {
            System.out.println(navyx.getName() + " è immune agli effetti del mare.");
            navyx.setPosition(navyx.getPosition()+1);
        } else if (navyx.getName().equals("Vascello delle Anime Erranti")) {
            // Salva il valore iniziale della forza del capitano
            int forzaIniziale = navyx.getStrength();

            int aumentoForza = 20 + random.nextInt(21); // Valore tra 20 e 40
            navyx.setStrength(navyx.getStrength() + aumentoForza);
            System.out.println(navyx.getName() + " ha aumentato la forza del capitano di " + aumentoForza + " punti!");

            // Dopo l'effetto, ripristina la forza originale
            navyx.setStrength(forzaIniziale);
            navyx.setPosition(navyx.getPosition()+1);
        } else {
            int danno = 20 + random.nextInt(21); // Valore tra 20 e 40
            navyx.setLife(navyx.getLife() - danno);
            System.out.println("L'ambiente toglie " + danno + " HP alla nave " + navyx.getName());
            navyx.setPosition(navyx.getPosition()+1);
        }

        // check navyy name to apply effect
        if (navyy.getName().equals("Furia del Maelstrom")) {
            System.out.println(navyy.getName() + " è immune agli effetti del mare.");
            navyy.setPosition(navyy.getPosition()+1);
        } else if (navyy.getName().equals("Vascello delle Anime Erranti")) {
            // Salva il valore iniziale della forza del capitano
            int forzaIniziale = navyy.getStrength();

            int aumentoForza = 20 + random.nextInt(21); // Valore tra 20 e 40
            navyy.setStrength(navyy.getStrength() + aumentoForza);
            System.out.println(navyy.getName() + " ha aumentato la forza del capitano di " + aumentoForza + " punti!");

            // Dopo l'effetto, ripristina la forza originale
            navyy.setStrength(forzaIniziale);
            navyy.setPosition(navyy.getPosition()+1);
        } else {
            int danno = 20 + random.nextInt(21); // Valore tra 20 e 40
            navyy.setLife(navyy.getLife() - danno);
            System.out.println("L'ambiente toglie " + danno + " HP alla nave " + navyy.getName());
            navyy.setPosition(navyy.getPosition()+1);
        }
    }

}
