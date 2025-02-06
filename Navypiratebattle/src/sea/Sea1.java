package sea;
import navies.BaseNavies;
import java.util.Random;

public class Sea1 extends baseSea {

    public Sea1(String nome) {
        super(nome);
    }

    public <T extends BaseNavies> void appliccaeffetto(T navyx, T navyy) {
        // Effetto su navyx (la prima nave)
        if (navyx.getName().equals("Furia del Maelstrom")) {
            System.out.println(navyx.getName() + " is immune to sea effects.");
            navyx.setPosition(navyx.getPosition()+1);
        } else if (navyx.getName().equals("Regina dei Ghiacci Eterni")) {
            System.out.println(navyx.getName() + " is immune to freezing, and its attack strength increases.");
            Random random = new Random();
            int strengthBoost = random.nextInt(100); // Aumento casuale della forza
            int originalStrength = navyx.getStrength();
            navyx.setStrength(navyx.getStrength() + strengthBoost); // Aumenta la forza
            System.out.println(navyx.getName() + "'s attack strength boosted by " + strengthBoost + ".");
            navyx.setStrength(originalStrength); // Ripristina la forza originale dopo l'effetto
            navyx.setPosition(navyx.getPosition()+1);

    } else {
            System.out.println("The environment has frozen " + navyx.getName() + " and it cannot advance.");
        }

        // Effetto su navyy (la seconda nave)
        if (navyy.getName().equals("Furia del Maelstrom")) {
            System.out.println(navyy.getName() + " is immune to sea effects.");
            navyy.setPosition(navyy.getPosition()+1);
        } else if (navyy.getName().equals("Regina dei Ghiacci Eterni")) {
            System.out.println(navyy.getName() + " is immune to freezing, and its attack strength increases.");
            Random random = new Random();
            int strengthBoost = random.nextInt(100);
            int originalStrength = navyy.getStrength();
            navyy.setStrength(navyy.getStrength() + strengthBoost); // Aumenta la forza
            System.out.println(navyy.getName() + "'s attack strength boosted by " + strengthBoost + ".");
            navyy.setStrength(originalStrength); // Ripristina la forza originale dopo l'effetto
            navyy.setPosition(navyy.getPosition()+1);
        } else {
            System.out.println("The environment has frozen " + navyy.getName() + " and it cannot advance.");
        }
    }
}


